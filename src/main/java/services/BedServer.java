package services;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import io.grpc.stub.StreamObserver;
import java.util.Timer;
import java.util.TimerTask;

import java.util.logging.Logger;
import org.dominic.example.bed.BedGrpc;
import org.dominic.example.bed.BedStatus;
import serviceui.Printer;
import serviceui.ServiceUI;

/**
 * Server that manages startup/shutdown of a {@code Greeter} server.
 */
public class BedServer {

    private static final Logger logger = Logger.getLogger(BedServer.class.getName());

    /* The port on which the server should run */
    private int port = 50051;
    private Server server;

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new BedImpl())
                .build()
                .start();
        JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Dominics", "_bed._udp.local.", "", port);
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                BedServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon
     * threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    /**
     * Main launches the server from the command line.
     */
    public static void main(String[] args) throws Exception {
        final BedServer server = new BedServer();
        server.start();
        server.blockUntilShutdown();
    }

    private class BedImpl extends BedGrpc.BedImplBase {

        private int percentHot = 0;
        private Printer ui;

        public BedImpl() {
            String name = "Dominic's";
            String serviceType = "_bed._udp.local.";
            ui = new ServiceUI(name + serviceType);
        }

        @Override
        public void warm(com.google.protobuf.Empty request,
                io.grpc.stub.StreamObserver<org.dominic.example.bed.BedStatus> responseObserver) {
            Timer t = new Timer();
            t.schedule(new RemindTask(responseObserver), 0, 2000);

        }

        @Override
        public void getStatus(com.google.protobuf.Empty request,
                io.grpc.stub.StreamObserver<org.dominic.example.bed.BedStatus> responseObserver) {
            responseObserver.onNext(BedStatus.newBuilder().setPercentageHeated(percentHot).build());
            responseObserver.onCompleted();
        }

        class RemindTask extends TimerTask {

            StreamObserver<BedStatus> o;

            public RemindTask(StreamObserver<BedStatus> j) {
                o = j;
            }

            @Override
            public void run() {
                if (percentHot < 100) {
                    percentHot += 10;
                    BedStatus status = BedStatus.newBuilder().setPercentageHeated(percentHot).build();
                    ui.append(status.toString());
                    o.onNext(status);
                } else {
                    o.onCompleted();
                    this.cancel();
                }
            }
        }
    }
}
