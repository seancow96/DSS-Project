package client;

import javax.swing.JPanel;
import clientui.SpeakerClientGUI;
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
import org.example.speaker.AverageRequest;
import org.example.speaker.AverageResponse;
import org.example.speaker.DeviceRequest;
import org.example.speaker.DeviceResponse;
import org.example.speaker.FindMaximumRequest;
import org.example.speaker.FindMaximumResponse;
import org.example.speaker.Speaker;
import org.example.speaker.SpeakerRequest;
import org.example.speaker.SpeakerResponse;
import org.example.speaker.SpeakerServiceGrpc;




public class SpeakerClient implements ServiceObserver {

    protected SpeakerClientGUI ui;
    protected ServiceDescription current;
    private final String serviceType;
    private final String name;
    private static final Logger logger = Logger.getLogger(GRPCSpeakerClient.class.getName());

    private ManagedChannel channel;
    private SpeakerServiceGrpc.SpeakerServiceBlockingStub blockingStub;

    /**
     * Constructor.
     */
    public SpeakerClient() {
        serviceType = "_speaker._udp.local.";
        name = "Seans";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ui = new SpeakerClientGUI(SpeakerClient.this);
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
        blockingStub = SpeakerServiceGrpc.newBlockingStub(channel);
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

       public void turnspeakeron() {

        // created a protocol buffer greeting message
        Speaker speaker = Speaker.newBuilder()
                .setTurnspeakeron("On")
                .build();

        // do the same for a GreetRequest
        SpeakerRequest speakerRequest = SpeakerRequest.newBuilder()
                .setSpeaker(speaker)
                .build();

        // call the RPC and get back a GreetResponse (protocol buffers)
            SpeakerResponse speakerResponse = blockingStub.speakerOn(speakerRequest);
        // call the RPC and get back a GreetResponse (protocol buffers)
        
        System.out.println(speakerResponse.getSpeakerstate());
        ui.append(speakerResponse.getSpeakerstate());


    }
    
    public void turnthespeakeroff() {

          // Unary
        // created a protocol buffer greeting message
        Speaker speaker = Speaker.newBuilder()
                .setTurnspeakeroff("Off")
                .build();

        // do the same for a GreetRequest
        SpeakerRequest speakerRequest = SpeakerRequest.newBuilder()
                .setSpeaker(speaker)
                .build();

        // call the RPC and get back a GreetResponse (protocol buffers)
            SpeakerResponse speakerResponse = blockingStub.speakerOff(speakerRequest);
        // call the RPC and get back a GreetResponse (protocol buffers)
        
        System.out.println(speakerResponse.getSpeakerstate());
        ui.append(speakerResponse.getSpeakerstate());

    }
 
    
    
     public void connectdevice() {
        // create an asynchronous client
        SpeakerServiceGrpc.SpeakerServiceStub asyncClient = SpeakerServiceGrpc.newStub(channel);

        final CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<DeviceRequest> requestObserver = asyncClient.connectDevice(new StreamObserver<DeviceResponse>() {
            @Override
            public void onNext(DeviceResponse value) {
                // we get a response from the server
                System.out.println("Preparing to connect device");
                System.out.println(value.getConnected());
                 ui.append(value.getConnected());

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
                 ui.append("Connected!");
                latch.countDown();
            }
        });

        requestObserver.onNext(DeviceRequest.newBuilder()
                .setSpeaker(Speaker.newBuilder()
                        .setConnectspeaker("")
                        .build())
                        .build());
                         ui.append("Preparing to Connect ");

        // we tell the server that the client is done sending data
        requestObserver.onCompleted();

        try {
            latch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

     
     
         
     public void averageViews(){
        SpeakerServiceGrpc.SpeakerServiceStub asyncClient = SpeakerServiceGrpc.newStub(channel);

        final CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<AverageRequest> requestObserver = asyncClient.averageViews(new StreamObserver<AverageResponse>() {
            @Override
            public void onNext(AverageResponse value) {
                System.out.println("Received a response from the server");
                System.out.println("The average number of views 67,12,38 is" );
                System.out.println( value.getAverage());
                
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("Server has completed sending us data");
                 latch.countDown();
            }
        });
       
        requestObserver.onNext(AverageRequest.newBuilder()
        .setFirstSong(20)
        .build());
        
              
        requestObserver.onNext(AverageRequest.newBuilder()
        .setSecondSong(12)
        .build());
        
              
        requestObserver.onNext(AverageRequest.newBuilder()
        .setThirdSong(38)
        .build());
              


        requestObserver.onCompleted();

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
     
     
         //does a bidirectional call  
     public void findMaximum(){
        SpeakerServiceGrpc.SpeakerServiceStub asyncClient = SpeakerServiceGrpc.newStub(channel);

        final CountDownLatch latch = new CountDownLatch(1);



        StreamObserver<FindMaximumRequest> requestObserver = asyncClient.findMaximumViews(new StreamObserver<FindMaximumResponse>() {
            @Override    //anytime we receieve a response from the client we say
            public void onNext(FindMaximumResponse value) {
                //gets new maximum from server
                System.out.println("Got new Maximum Viewed Song from Server: " + value.getMaximum());
            }

            @Override
            public void onError(Throwable t) {
                latch.countDown();
            }

            @Override
            //server completes sending messages
            public void onCompleted() {
                System.out.println("Views sending is completed");
            }
        });

//sending data to the request observer

        Arrays.asList(3, 5, 17).forEach(
                number -> {
                    System.out.println("Sending views : " + number);
                    requestObserver.onNext(FindMaximumRequest.newBuilder()
                            .setNumber(number)
                            .build());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );

        requestObserver.onCompleted();

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
     
     
     
        
    
    public void switchService(String name) {
        // TODO
    }

    public static void main(String[] args) {
        new SpeakerClient();
    }

}
