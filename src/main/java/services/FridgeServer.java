package services;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import io.grpc.stub.StreamObserver;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;
import org.example.fridge.DispenseResponse;
import org.example.fridge.FridgeGrpc;
import org.example.fridge.FridgeLock;
import org.example.fridge.FridgeStates;
import org.example.fridge.LockingRequest;
import org.example.fridge.LockingResponse;
import org.example.fridge.StatusRequest;
import org.example.fridge.StatusResponse;
import serviceui.Printer;
import serviceui.ServiceUI;

/**
 * Server that manages startup/shutdown of a {@code Greeter} server.
 */
public class FridgeServer {

    private static final Logger logger = Logger.getLogger(FridgeServer.class.getName());

    /* The port on which the server should run */
    private int port = 50054;
    private Server server;

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new FridgeImpl())
                .build()
                .start();
        JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Seans", "_fridge._udp.local.", "", port);
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                FridgeServer.this.stop();
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
        final FridgeServer server = new FridgeServer();
        server.start();
        server.blockUntilShutdown();
    }

    private class FridgeImpl extends FridgeGrpc.FridgeImplBase {

        private Printer ui;
        private int iceLevel = 0;


        public FridgeImpl() {
            String name = "Seans";
            String serviceType = "_fridge._udp.local.";
            ui = new ServiceUI(name + serviceType);
        }

         @Override
    public void fridgeStatus(StatusRequest request, StreamObserver<StatusResponse> responseObserver) {
        // extract the fields we need
        FridgeStates fridgestates = request.getFridgestates(); 
        String TurnFridgeOn = fridgestates.getTurnfridgeon();

        // create the response
        String state = "The fridge is " + TurnFridgeOn;
        StatusResponse response = StatusResponse.newBuilder()
                .setState(state)
                .build();
                 ui.append(response.toString());

        // send the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }
    
           @Override
    public void fridgeStatusOff(StatusRequest request, StreamObserver<StatusResponse> responseObserver) {
        // extract the fields we need
        FridgeStates fridgestates = request.getFridgestates(); 
        String TurnFridgeOff = fridgestates.getTurnfridgeoff();

        // create the response
        String state = "The Fridge is " + TurnFridgeOff;
        StatusResponse response = StatusResponse.newBuilder()
                .setState(state)
                .build();
                 ui.append(response.toString());

        // send the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }
    
     @Override
    public void fridgeIceLock(LockingRequest request, StreamObserver<LockingResponse> responseObserver) {
        // extract the fields we need
        FridgeLock fridgelock = request.getFridgelock(); 
        String Lock = fridgelock.getLock();

        // create the response
        String status = "The Ice is " + Lock;
        LockingResponse response = LockingResponse.newBuilder()
                .setStatus(status)
                .build();
                 ui.append(response.toString());

        // send the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }
      
        @Override
    public void fridgeIceUnlock(LockingRequest request, StreamObserver<LockingResponse> responseObserver) {
        // extract the fields we need
        FridgeLock fridgelock = request.getFridgelock(); 
        String Unlock = fridgelock.getUnlock();

        // create the response
        String status = "The Ice is " + Unlock;
        LockingResponse response = LockingResponse.newBuilder()
                .setStatus(status)
                .build();
                 ui.append(response.toString());

        // send the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }
    
    
    
    
    
    
    
         @Override
        public void dispenseIce(com.google.protobuf.Empty request,
                io.grpc.stub.StreamObserver<org.example.fridge.DispenseResponse> responseObserver) {
            Timer t = new Timer();
            t.schedule(new RemindTask(responseObserver), 0, 2000);

        }
              class RemindTask extends TimerTask {

            StreamObserver<DispenseResponse> o;

            public RemindTask(StreamObserver<DispenseResponse> j) {
                o = j;
            }

            @Override
            public void run() {
                if (iceLevel < 4) {
                    iceLevel += 1;

                    DispenseResponse status = DispenseResponse.newBuilder().setIceDispensed(iceLevel).build();
                    ui.append("the ice level " + status.toString());
                    o.onNext(status);
                } else {
                    o.onCompleted();
                    ui.append("Get Ice" + iceLevel);
                    this.cancel();
                }
            }
            
            
        }
      
   
   
}
}