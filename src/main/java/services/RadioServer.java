package services;

import com.google.protobuf.Empty;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import io.grpc.stub.StreamObserver;

import org.example.radio.RadioServiceGrpc;
import java.util.logging.Logger;
import org.example.radio.Radio;
import org.example.radio.RadioRequest;
import org.example.radio.RadioResponse;
import org.example.radio.VolumeRequest;
import org.example.radio.VolumeResponse;
import serviceui.Printer;
import serviceui.ServiceUI;

/**
 * Server that manages startup/shutdown of a {@code Greeter} server.
 */
public class RadioServer {

    private static final Logger logger = Logger.getLogger(RadioServer.class.getName());

    /* The port on which the server should run */
    private int port = 50054;
    private Server server;

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new RadioServiceImpl())
                .build()
                .start();
        JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Phone", "_phone._udp.local.", "", port);
        



        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                RadioServer.this.stop();
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
        final RadioServer server = new RadioServer();
        server.start();
        server.blockUntilShutdown();
    }
    
    

    private class RadioServiceImpl extends RadioServiceGrpc.RadioServiceImplBase {

        private Printer ui;
       

        public RadioServiceImpl() {
         
            String name = "Seans";
            String serviceType = "_radio._udp.local.";
            ui = new ServiceUI(name + serviceType);
           

        }


         @Override
    public void radioOn(RadioRequest request, StreamObserver<RadioResponse> responseObserver) {
        // extract the fields we need
        Radio radio = request.getRadio(); 
        String TurnRadioOn = radio.getTurnradioon();

        // create the response
        String radiostate = "The radio is " + TurnRadioOn;
        RadioResponse response = RadioResponse.newBuilder()
                .setRadiostate(radiostate)
                .build();
                 ui.append(response.toString());

        // send the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }
    
           @Override
    public void radioOff(RadioRequest request, StreamObserver<RadioResponse> responseObserver) {
        // extract the fields we need
        Radio radio = request.getRadio(); 
        String TurnRadioOff = radio.getTurnradiooff();

        // create the response
        String radiostate = "The radio is " + TurnRadioOff;
        RadioResponse response = RadioResponse.newBuilder()
                .setRadiostate(radiostate)
                .build();
                 ui.append(response.toString());

        // send the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }
    
   
 

   
}
    
}