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
import org.example.phone.BluetoothRequest;
import org.example.phone.BluetoothResponse;
import org.example.phone.DeviceRequest;
import org.example.phone.DeviceResponse;
import org.example.phone.Phone;
import org.example.phone.PhoneRequest;
import org.example.phone.PhoneResponse;
import org.example.phone.PhoneServiceGrpc;
import org.example.phone.PlaylistSongs;
import org.example.phone.Song;
import org.example.phone.VolumeUpRequest;
import org.example.phone.VolumeUpResponse;




public class PhoneClient implements ServiceObserver {

    protected PhoneClientGUI ui;
    protected ServiceDescription current;
    private final String serviceType;
    private final String name;
    private static final Logger logger = Logger.getLogger(PhoneClient.class.getName());
    private ManagedChannel channel;
    private PhoneServiceGrpc.PhoneServiceBlockingStub blockingStub2;



    /**
     * Constructor.
     */
    public PhoneClient() {
        serviceType = "_phone._udp.local.";
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
        System.out.println("Found phone service");
        channel = ManagedChannelBuilder.forAddress(service.getAddress(), service.getPort())
                .usePlaintext(true)
                .build();
         blockingStub2 = PhoneServiceGrpc.newBlockingStub(channel);

      
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
            System.out.println("Playing song through internal speakers");
            ui.append("Playing song through internal speakers");
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
        
        System.out.println(phoneResponse.getPhonestatus());
        ui.append(phoneResponse.getPhonestatus());


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
        
        System.out.println(phoneResponse.getPhonestatus());
        ui.append(phoneResponse.getPhonestatus());


    }
           
           
           
         public void volumeUp ( ){
        // created a greet service client uranary
//passing the channel
        PhoneServiceGrpc.PhoneServiceBlockingStub stub = PhoneServiceGrpc.newBlockingStub(channel);


        
            VolumeUpRequest req = VolumeUpRequest.newBuilder()
               // .setTemp(0)

    

                .build();

        VolumeUpResponse response = stub.volumeUp(req);
        
        System.out.println(req.getTemp() + response.getCurrenttemp());

    }
           
           
           
           
           
           
           
           
       public void pause() {

        // Unary
        // created a protocol buffer greeting message
        Phone phone = Phone.newBuilder()
                .setPause("Paused")
                .build();

        // do the same for a GreetRequest
        PhoneRequest phoneRequest = PhoneRequest.newBuilder()
                .setPhone(phone)
                .build();

        // call the RPC and get back a GreetResponse (protocol buffers)
         PhoneResponse phoneResponse = blockingStub2.pause(phoneRequest);
        // call the RPC and get back a GreetResponse (protocol buffers)
        
        System.out.println(phoneResponse.getPhonestatus());
        ui.append(phoneResponse.getPhonestatus());


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
                latch.countDown();
            }
        });

        requestObserver.onNext(DeviceRequest.newBuilder()
                .setPhone(Phone.newBuilder()
                        .setConnectspeaker("")
                        .build())
                        .build());

        // we tell the server that the client is done sending data
        requestObserver.onCompleted();

   try {
                         Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
    }

     
     
        public void bluetooth() {
        // create an asynchronous client
        PhoneServiceGrpc.PhoneServiceStub asyncClient = PhoneServiceGrpc.newStub(channel);

        final CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<BluetoothRequest> requestObserver = asyncClient.bluetooth(new StreamObserver<BluetoothResponse>() {
            @Override
            public void onNext(BluetoothResponse value) {
                // we get a response from the server
                System.out.println("Preparing to connect device");
                System.out.println(value.getBluetoothon());
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
                latch.countDown();
            }
        });

        requestObserver.onNext(BluetoothRequest.newBuilder()
                .setPhone(Phone.newBuilder()
                        .setBluetooth("")
                        .build())
                        .build());

        // we tell the server that the client is done sending data
        requestObserver.onCompleted();

   try {
                         Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
    }

 
    
    public void switchService(String name) {

    }

    public static void main(String[] args) {
        new PhoneClient();
    }

}