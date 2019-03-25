package services;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import io.grpc.stub.StreamObserver;
import java.util.Timer;
import java.util.TimerTask;

import org.example.toaster.ToasterServiceGrpc;
import java.util.logging.Logger;
import org.example.toaster.Bread;
import org.example.toaster.BreadRequest;
import org.example.toaster.BreadResponse;
import org.example.toaster.StateRequest;
import org.example.toaster.StateResponse;
import org.example.toaster.ToastLevel;
import org.example.toaster.Toasting;
import serviceui.Printer;
import serviceui.ServiceUI;

/**
 * Server that manages startup/shutdown of a {@code Greeter} server.
 */
public class ToasterServer {

    private static final Logger logger = Logger.getLogger(ToasterServer.class.getName());

    /* The port on which the server should run */
    private int port = 50054;
    private Server server;

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new ToasterServiceImpl())
                .build()
                .start();
        JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Seans", "_toaster._udp.local.", "", port);
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                ToasterServer.this.stop();
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
        final ToasterServer server = new ToasterServer();
        server.start();
        server.blockUntilShutdown();
    }

    private class ToasterServiceImpl extends ToasterServiceGrpc.ToasterServiceImplBase {

        private Printer ui;
          private int percentToastHot = 0;

        public ToasterServiceImpl() {
            String name = "Seans";
            String serviceType = "_toaster._udp.local.";
            ui = new ServiceUI(name + serviceType);
        }

         @Override
    public void toasterStatus(StateRequest request, StreamObserver<StateResponse> responseObserver) {
        // extract the fields we need
        Toasting toasting = request.getToasting(); 
        String On = toasting.getOn();

        // create the response
        String state = "The toaster is " + On;
        StateResponse response = StateResponse.newBuilder()
                .setState(state)
                .build();
                 ui.append(response.toString());

        // send the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }
    
           @Override
    public void toasterStatusOff(StateRequest request, StreamObserver<StateResponse> responseObserver) {
        // extract the fields we need
        Toasting toasting = request.getToasting(); 
        String Off = toasting.getOff();

        // create the response
        String state = "The toaster is " + Off;
        StateResponse response = StateResponse.newBuilder()
                .setState(state)
                .build();
                 ui.append(response.toString());

        // send the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }
    
    
      @Override
     public StreamObserver<BreadRequest> addBread(final StreamObserver<BreadResponse> responseObserver) {
        // we create the requestObserver that we'll return in this function
       StreamObserver<BreadRequest> requestObserver = new StreamObserver<BreadRequest>() {

            String breadadded = "";

           @Override
           public void onNext(BreadRequest value) {
                // client sends a message
               breadadded += "The bread has been added " + value.getBread().getToastbread();
           }

           @Override
          public void onError(Throwable t) {
                // client sends an error
          }

         @Override
          public void onCompleted() {
                // client is done
             responseObserver.onNext(
                       BreadResponse.newBuilder()
                              .setBreadadded(breadadded)
                              .build()
               );
                responseObserver.onCompleted();
           }
       };


       return requestObserver;
    }
     
     

       @Override
        public void toastingBread(com.google.protobuf.Empty request,
                io.grpc.stub.StreamObserver<org.example.toaster.ToastLevel> responseObserver) {
            Timer t = new Timer();
            t.schedule(new RemindTask(responseObserver), 0, 5000);

        }
              class RemindTask extends TimerTask {

            StreamObserver<ToastLevel> o;

            public RemindTask(StreamObserver<ToastLevel> j) {
                o = j;
            }

            @Override
            public void run() {
                if (percentToastHot < 80) {
                    percentToastHot += 10;
                    ToastLevel status = ToastLevel.newBuilder().setToastCooked(percentToastHot).build();
                    ui.append("the toast level " + status.toString());
                    o.onNext(status);
                } else {
                    o.onCompleted();
                    ui.append("Toasting is done. Collect your toast" + percentToastHot);
                    this.cancel();
                }
            }
            
            
        }
   
   
   
}
}