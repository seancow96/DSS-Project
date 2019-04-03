package client;

import javax.swing.JPanel;
import clientui.PhoneClientGUI;
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
import org.example.phone.AverageRequest;
import org.example.phone.AverageResponse;
import org.example.phone.DeviceRequest;
import org.example.phone.DeviceResponse;
import org.example.phone.FindMaximumRequest;
import org.example.phone.FindMaximumResponse;
import org.example.phone.Phone;
import org.example.phone.PhoneRequest;
import org.example.phone.PhoneResponse;
import org.example.phone.PhoneServiceGrpc;
import org.example.phone.PlaylistSongs;
import org.example.phone.Song;
import org.example.radio.Radio;
import org.example.radio.RadioRequest;
import org.example.radio.RadioResponse;
import org.example.radio.RadioServiceGrpc;
import org.example.radio.VolumeRequest;
import org.example.radio.VolumeResponse;
import org.example.radio.VolumeRequest;
import org.example.radio.VolumeResponse;




public class PhoneClient implements ServiceObserver {

    protected PhoneClientGUI ui;
    protected ServiceDescription current;
    private final String serviceType;
    private final String name;
    private static final Logger logger = Logger.getLogger(PhoneClient.class.getName());
    private ManagedChannel channel;
    private RadioServiceGrpc.RadioServiceBlockingStub blockingStub;
    private PhoneServiceGrpc.PhoneServiceBlockingStub blockingStub2;



    /**
     * Constructor.
     */
    public PhoneClient() {
        serviceType = "_radio._udp.local.";
        name = "Seans";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ui = new PhoneClientGUI(PhoneClient.this);
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
        channel = ManagedChannelBuilder.forAddress(service.getAddress(), service.getPort())
                .usePlaintext(true)
                .build();
        blockingStub = RadioServiceGrpc.newBlockingStub(channel);
        
        channel = ManagedChannelBuilder.forAddress(service.getAddress(), service.getPort())
        .usePlaintext(true)
        .build();
        blockingStub2 = PhoneServiceGrpc.newBlockingStub(channel);
        getAllSongs();
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

    
    
    public void getAllSongs() {
      
            Empty request = Empty.newBuilder().build();
            System.out.println("Get Song");
            PlaylistSongs usermusic = blockingStub2.getAllSongs(request);
            List<Song> usermusicSongs = usermusic.getSongsList();
            for (Song son : usermusicSongs) {
                ui.append(son.toString());

            }
    }
       
    
    
        public void turnphoneon() {

        // Unary
        // created a protocol buffer greeting message
        Phone phone = Phone.newBuilder()
                .setTurnphoneon("On")
                .build();

        // do the same for a GreetRequest
        PhoneRequest phoneRequest = PhoneRequest.newBuilder()
                .setPhone(phone)
                .build();

        // call the RPC and get back a GreetResponse (protocol buffers)
            PhoneResponse phoneResponse = blockingStub2.phoneOn(phoneRequest);
        // call the RPC and get back a GreetResponse (protocol buffers)
        
        System.out.println(phoneResponse.getPhonestate());
        ui.append(phoneResponse.getPhonestate());


    }
    
    
     
           public void turnphoneoff() {

        // Unary
        // created a protocol buffer greeting message
        Phone phone = Phone.newBuilder()
                .setTurnphoneoff("Off")
                .build();

        // do the same for a GreetRequest
        PhoneRequest phoneRequest = PhoneRequest.newBuilder()
                .setPhone(phone)
                .build();

        // call the RPC and get back a GreetResponse (protocol buffers)
            PhoneResponse phoneResponse = blockingStub2.phoneOff(phoneRequest);
        // call the RPC and get back a GreetResponse (protocol buffers)
        
        System.out.println(phoneResponse.getPhonestate());
        ui.append(phoneResponse.getPhonestate());


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
 
    
    
       public void volumeUp(){
        RadioServiceGrpc.RadioServiceStub asyncClient = RadioServiceGrpc.newStub(channel);

        final CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<VolumeRequest> requestObserver = asyncClient.volumeUp(new StreamObserver<VolumeResponse>() {
            @Override
            public void onNext(VolumeResponse value) {
                System.out.println("Received a response from the server");
                System.out.println("The average number of views 67,12,38 is" );
                System.out.println( value.getCurrentvolume());
                ui.append("Received a response from the server");
                ui.append("The average number of views 67,12,38 is");
                ui.append(value.toString());



                
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("Server has completed sending us data");
                ui.append("Server has completed sending us data");

                
                 latch.countDown();
            }
        });
       
        requestObserver.onNext(VolumeRequest.newBuilder()
        .setNumber(3)
        .build());
        
              
    

        requestObserver.onCompleted();

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    
    
    
    
    
    
     public void connectdevice() {
        // create an asynchronous client
        PhoneServiceGrpc.PhoneServiceStub asyncClient = PhoneServiceGrpc.newStub(channel);

        final CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<DeviceRequest> requestObserver = asyncClient.connectDevice(new StreamObserver<DeviceResponse>() {
            @Override
            public void onNext(DeviceResponse value) {
                // we get a response from the server
                System.out.println("Preparing to connect device");
                System.out.println(value.getConnected());
                ui.append("Preparing to connect device ");


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
                .setPhone(Phone.newBuilder()
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
        PhoneServiceGrpc.PhoneServiceStub asyncClient = PhoneServiceGrpc.newStub(channel);

        final CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<AverageRequest> requestObserver = asyncClient.averageViews(new StreamObserver<AverageResponse>() {
            @Override
            public void onNext(AverageResponse value) {
                System.out.println("Received a response from the server");
                System.out.println("The average number of views 67,12,38 is" );
                System.out.println( value.getAverage());
                ui.append("Received a response from the server");
                ui.append("The average number of views 67,12,38 is");
                ui.append(value.toString());



                
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("Server has completed sending us data");
                ui.append("Server has completed sending us data");

                
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
        PhoneServiceGrpc.PhoneServiceStub asyncClient = PhoneServiceGrpc.newStub(channel);

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
        new PhoneClient();
    }

}
