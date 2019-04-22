package client;

import javax.swing.JPanel;
import clientui.RadioClientGUI;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.example.radio.Channel;
import org.example.radio.ChannelRequest;
import org.example.radio.ChannelResponse;
import org.example.radio.Radio;
import org.example.radio.RadioRequest;
import org.example.radio.RadioResponse;
import org.example.radio.RadioServiceGrpc;
import org.example.radio.VolumeDownResponse;
import org.example.radio.VolumeUpResponse;




public class RadioClient implements ServiceObserver {

    protected RadioClientGUI ui;
    protected ServiceDescription current;
    private final String serviceType;
    private final String name;
    private static final Logger logger = Logger.getLogger(RadioClient.class.getName());
    private ManagedChannel channel;
    private RadioServiceGrpc.RadioServiceBlockingStub blockingStub;




    /**
     * Constructor.
     */
    public RadioClient() {
        serviceType = "_radio._udp.local.";
        name = "Radio";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ui = new RadioClientGUI(RadioClient.this);
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
        System.out.println("Found radio service");
        channel = ManagedChannelBuilder.forAddress(service.getAddress(), service.getPort())
                .usePlaintext(true)
                .build();
        blockingStub = RadioServiceGrpc.newBlockingStub(channel);
        
 
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

   
    
    

    
        
        
       public void turnradioon() {

        // created a protocol buffer greeting message
        Radio radio = Radio.newBuilder()
                .setTurnradioon("On")
                .build();

        // do the same for a GreetRequest
        RadioRequest radioRequest = RadioRequest.newBuilder()
                .setRadio(radio)
                .build();

        // call the RPC and get back a GreetResponse (protocol buffers)
            RadioResponse radioResponse = blockingStub.radioOn(radioRequest);
        // call the RPC and get back a GreetResponse (protocol buffers)
        
        System.out.println(radioResponse.getRadiostate());
        ui.append(radioResponse.getRadiostate());
        
     


    }
    
    public void turntheradiooff() {

          // Unary
        // created a protocol buffer greeting message
       Radio radio = Radio.newBuilder()
                .setTurnradiooff("Off")
                .build();

        // do the same for a GreetRequest
        RadioRequest radioRequest = RadioRequest.newBuilder()
                .setRadio(radio)
                .build();

        // call the RPC and get back a GreetResponse (protocol buffers)
            RadioResponse radioResponse = blockingStub.radioOff(radioRequest);
        // call the RPC and get back a GreetResponse (protocol buffers)
        
        System.out.println(radioResponse.getRadiostate());
        ui.append(radioResponse.getRadiostate());
        
        
    

    }
 
    
    
      public void channel1() {
        // create an asynchronous client
       RadioServiceGrpc.RadioServiceStub asyncClient = RadioServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<ChannelRequest> requestObserver = asyncClient.channel1(new StreamObserver<ChannelResponse>() {
            @Override
            public void onNext(ChannelResponse value) {
                // we get a response from the server
                System.out.println("Channel is changing");
                 ui.append("Channel is changing");
                System.out.println(value.getChannel());

                // onNext will be called only once
            }

            @Override
            public void onError(Throwable t) {
                // we get an error from the server
            }

            @Override
            public void onCompleted() {
                
                System.out.println("FM 104");
                ui.append("FM 104");
                latch.countDown();
            }
        });

        System.out.println("Preparing to change channel");
        ui.append("Preparing to change channel");
        requestObserver.onNext(ChannelRequest.newBuilder()
                .setChannel(Channel.newBuilder()
                        .setChannel1("FM 104")
                        .build())
                .build());

        requestObserver.onCompleted();

    }
    
     
      
         public void channel2() {
        // create an asynchronous client
       RadioServiceGrpc.RadioServiceStub asyncClient = RadioServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<ChannelRequest> requestObserver = asyncClient.channel2(new StreamObserver<ChannelResponse>() {
            @Override
            public void onNext(ChannelResponse value) {
                // we get a response from the server
                System.out.println("Channel is changing");
                ui.append("Channel is changing");
                System.out.println(value.getChannel());
                // onNext will be called only once
            }

            @Override
            public void onError(Throwable t) {
                // we get an error from the server
            }

            @Override
            public void onCompleted() {
                
                System.out.println("Radio Nova");
                ui.append("Radio Nova");
                latch.countDown();
            }
        });

        System.out.println("Preparing to change channel");
        ui.append("Preparing to change channel");
        requestObserver.onNext(ChannelRequest.newBuilder()
                .setChannel(Channel.newBuilder()
                        .setChannel2("Radio Nova")
                        .build())
                .build());

        requestObserver.onCompleted();

    }
         
         
             public void channel3() {
        // create an asynchronous client
       RadioServiceGrpc.RadioServiceStub asyncClient = RadioServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<ChannelRequest> requestObserver = asyncClient.channel3(new StreamObserver<ChannelResponse>() {
            @Override
            public void onNext(ChannelResponse value) {
                // we get a response from the server
                System.out.println("Channel is changing");
                System.out.println(value.getChannel());
                // onNext will be called only once
            }

            @Override
            public void onError(Throwable t) {
                // we get an error from the server
            }

            @Override
            public void onCompleted() {
                
                System.out.println("Near FM");
                ui.append("Near FM");
                latch.countDown();
            }
        });

        System.out.println("Preparing to change channel");
        ui.append("Preparing to change channel");
        requestObserver.onNext(ChannelRequest.newBuilder()
                .setChannel(Channel.newBuilder()
                        .setChannel3("Near FM")
                        .build())
                .build());

        requestObserver.onCompleted();

    }
    
     
        
             public void channel4() {
        // create an asynchronous client
       RadioServiceGrpc.RadioServiceStub asyncClient = RadioServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<ChannelRequest> requestObserver = asyncClient.channel4(new StreamObserver<ChannelResponse>() {
            @Override
            public void onNext(ChannelResponse value) {
                // we get a response from the server
                System.out.println("Channel is changing");
                ui.append("Channel is changing");
                System.out.println(value.getChannel());
                // onNext will be called only once
            }

            @Override
            public void onError(Throwable t) {
                // we get an error from the server
            }

            @Override
            public void onCompleted() {
                
                System.out.println("98FM");
                ui.append("98FM");
                latch.countDown();
            }
        });

        System.out.println("Preparing to change channel");
        ui.append("Preparing to change channel");
        requestObserver.onNext(ChannelRequest.newBuilder()
                .setChannel(Channel.newBuilder()
                        .setChannel4("98FM")
                        .build())
                .build());

        requestObserver.onCompleted();

       
    }
    
     
             
                  
         public void volumeUp ( ){
        RadioServiceGrpc.RadioServiceBlockingStub stub = RadioServiceGrpc.newBlockingStub(channel);

        
            Empty request = Empty.newBuilder().build();

    

        VolumeUpResponse response = stub.volumeUp(request);
        ui.append("Increasing Volume");
        System.out.println("Increasing Volume");

        System.out.println("The current volume is "+ response.getCurrentvolume()+ " decibels ");
        ui.append("The current volume is "+response.getCurrentvolume() + " decibels");

    }
           
           
           
        public void volumeDown ( ){
        RadioServiceGrpc.RadioServiceBlockingStub stub = RadioServiceGrpc.newBlockingStub(channel);


        
            Empty request = Empty.newBuilder().build();

    

        VolumeDownResponse response = stub.volumeDown(request);
        
        System.out.println("Decreasing Volume");
        ui.append("Decreasing Volume");
        System.out.println("The current volume is "+ response.getCurrentvolume() + " decibels ");
        ui.append("The current volume is "+response.getCurrentvolume() + " decibels ");

        
        
    }
         
    
     
     
     
    
        
    
    public void switchService(String name) {

    }

    public static void main(String[] args) {
        new RadioClient();
    }

}