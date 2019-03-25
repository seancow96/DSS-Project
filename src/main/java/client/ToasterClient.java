package client;

import javax.swing.JPanel;
import clientui.ToasterClientGUI;
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
import org.example.toaster.Bread;
import org.example.toaster.BreadRequest;
import org.example.toaster.BreadResponse;
import org.example.toaster.StateRequest;
import org.example.toaster.StateResponse;
import org.example.toaster.ToastLevel;
import org.example.toaster.ToasterServiceGrpc;
import org.example.toaster.Toasting;



public class ToasterClient implements ServiceObserver {

    protected ToasterClientGUI ui;
    protected ServiceDescription current;
    private final String serviceType;
    private final String name;
    private static final Logger logger = Logger.getLogger(GRPCToasterClient.class.getName());

    private ManagedChannel channel;
    private ToasterServiceGrpc.ToasterServiceBlockingStub blockingStub;

    /**
     * Constructor.
     */
    public ToasterClient() {
        serviceType = "_toaster._udp.local.";
        name = "Seans";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ui = new ToasterClientGUI(ToasterClient.this);
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
        blockingStub = ToasterServiceGrpc.newBlockingStub(channel);
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

       public void toaststatus() {

        // Unary
        // created a protocol buffer greeting message
        Toasting toasting = Toasting.newBuilder()
                .setOn("On")
                .build();

        // do the same for a GreetRequest
        StateRequest stateRequest = StateRequest.newBuilder()
                .setToasting(toasting)
                .build();

        // call the RPC and get back a GreetResponse (protocol buffers)
            StateResponse stateResponse = blockingStub.toasterStatus(stateRequest);
        // call the RPC and get back a GreetResponse (protocol buffers)
        
        System.out.println(stateResponse.getState());
        ui.append(stateResponse.getState());


    }
    
    
    public void toaststatusoff() {

        // Unary
        // created a protocol buffer greeting message
        Toasting toasting = Toasting.newBuilder()
                .setOn("Off")
                .build();

        // do the same for a ToastRequest
        StateRequest stateRequest = StateRequest.newBuilder()
                .setToasting(toasting)
                .build();

        // call the RPC and get back a GreetResponse (protocol buffers)
            StateResponse stateResponse = blockingStub.toasterStatus(stateRequest);
        // call the RPC and get back a GreetResponse (protocol buffers)
        
        System.out.println(stateResponse.getState());
        ui.append(stateResponse.getState());


    }
    
    
    public void addingbread() {
        // create an asynchronous client
        ToasterServiceGrpc.ToasterServiceStub asyncClient = ToasterServiceGrpc.newStub(channel);

        final CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<BreadRequest> requestObserver = asyncClient.addBread(new StreamObserver<BreadResponse>() {
            @Override
            public void onNext(BreadResponse value) {
                // we get a response from the server
                System.out.println("Adding bread");
                System.out.println(value.getBreadadded());
                 ui.append(value.getBreadadded());

                // onNext will be called only once
            }

            @Override
            public void onError(Throwable t) {
                // we get an error from the server
            }

            @Override
            public void onCompleted() {
                // the server is done sending us data
                // onCompleted will be called right after onNext()
                 ui.append("Ready to toast. Press The toast button");
                latch.countDown();
            }
        });

        requestObserver.onNext(BreadRequest.newBuilder()
                .setBread(Bread.newBuilder()
                        .setToastbread("")
                        .build())
                        .build());
                         ui.append("Added bread!");

        // we tell the server that the client is done sending data
        requestObserver.onCompleted();

        try {
            latch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

           
    public void toastingBread() {
        try {

            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    Iterator<ToastLevel> response = blockingStub.toastingBread(request);
                    while (response.hasNext()) {
                        ui.append("the toast level is now "+response.next().toString());
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
        new ToasterClient();
    }

}
