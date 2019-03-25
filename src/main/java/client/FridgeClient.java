package client;

import javax.swing.JPanel;
import clientui.FridgeClientGUI;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.example.fridge.DispenseResponse;
import org.example.fridge.FridgeGrpc;
import org.example.fridge.FridgeLock;
import org.example.fridge.FridgeStates;
import org.example.fridge.LockingRequest;
import org.example.fridge.LockingResponse;
import org.example.fridge.StatusRequest;
import org.example.fridge.StatusResponse;



public class FridgeClient implements ServiceObserver {

    protected FridgeClientGUI ui;
    protected ServiceDescription current;
    private final String serviceType;
    private final String name;
    private static final Logger logger = Logger.getLogger(GRPCFridgeClient.class.getName());

    private ManagedChannel channel;
    private FridgeGrpc.FridgeBlockingStub blockingStub;

    /**
     * Constructor.
     */
    public FridgeClient() {
        serviceType = "_fridge._udp.local.";
        name = "Seans";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ui = new FridgeClientGUI(FridgeClient.this);
                ui.setVisible(true);
            }
        });
    }

    String getServiceType() {
        return serviceType;
    }

    void disable() {
        // no services exist for this client type
    }

    public List<String> serviceInterests() {
        List<String> interests = new ArrayList<String>();
        interests.add(serviceType);
        return interests;
    }

    public void serviceAdded(ServiceDescription service) {
        System.out.println("service added");
        current = service;
        channel = ManagedChannelBuilder.forAddress(service.getAddress(), service.getPort())
                .usePlaintext(true)
                .build();
        blockingStub = FridgeGrpc.newBlockingStub(channel);
    }

    public boolean interested(String type) {
        return serviceType.equals(type);
    }

    public String getName() {
        return name;
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

       public void turnthefridgeon() {

        // created a protocol buffer greeting message
        FridgeStates fridgestates = FridgeStates.newBuilder()
                .setTurnfridgeon("On")
                .build();

        // do the same for a GreetRequest
        StatusRequest statusRequest = StatusRequest.newBuilder()
                .setFridgestates(fridgestates)
                .build();

        // call the RPC and get back a GreetResponse (protocol buffers)
            StatusResponse statusResponse = blockingStub.fridgeStatus(statusRequest);
        // call the RPC and get back a GreetResponse (protocol buffers)
        
        System.out.println(statusResponse.getState());
        ui.append(statusResponse.getState());


    }
    
    public void turnthefridgeoff() {

          // Unary
        // created a protocol buffer greeting message
        FridgeStates fridgestates = FridgeStates.newBuilder()
                .setTurnfridgeoff("Off")
                .build();

        // do the same for a GreetRequest
        StatusRequest statusRequest = StatusRequest.newBuilder()
                .setFridgestates(fridgestates)
                .build();

        // call the RPC and get back a GreetResponse (protocol buffers)
            StatusResponse statusResponse = blockingStub.fridgeStatusOff(statusRequest);
        // call the RPC and get back a GreetResponse (protocol buffers)
        
        System.out.println(statusResponse.getState());
        ui.append(statusResponse.getState());

    }
        public void lockthefridge() {

          // Unary
        // created a protocol buffer greeting message
        FridgeLock fridgelock = FridgeLock.newBuilder()
                .setLock("Locked")
                .build();

        // do the same for a GreetRequest
        LockingRequest lockingRequest = LockingRequest.newBuilder()
                .setFridgelock(fridgelock)
                .build();

        // call the RPC and get back a GreetResponse (protocol buffers)
            LockingResponse lockingResponse = blockingStub.fridgeIceLock(lockingRequest);
        // call the RPC and get back a GreetResponse (protocol buffers)
        
        System.out.println(lockingResponse.getStatus());
        ui.append(lockingResponse.getStatus());

    }
        
        public void unlockthefridge() {

          // Unary
        // created a protocol buffer greeting message
        FridgeLock fridgelock = FridgeLock.newBuilder()
                .setUnlock("Unlocked")
                .build();

        // do the same for a GreetRequest
        LockingRequest lockingRequest = LockingRequest.newBuilder()
                .setFridgelock(fridgelock)
                .build();

        // call the RPC and get back a GreetResponse (protocol buffers)
            LockingResponse lockingResponse = blockingStub.fridgeIceUnlock(lockingRequest);
        // call the RPC and get back a GreetResponse (protocol buffers)
        
        System.out.println(lockingResponse.getStatus());
        ui.append(lockingResponse.getStatus());

    }
        
        
               
    public void dispenseIce() {
        try {

            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    Iterator<DispenseResponse> response = blockingStub.dispenseIce(request);
                    while (response.hasNext()) {
                        ui.append("the ice level is now "+response.next().toString());
                    }
                }
            }.start();

           

        } catch (RuntimeException e) {
            logger.log(Level.WARNING, "RPC failed", e);
            return;
        }
    }
 
        
    
    
    
    
    public void switchService(String name) {
        // TODO
    }

    public static void main(String[] args) {
        new FridgeClient();
    }

}
