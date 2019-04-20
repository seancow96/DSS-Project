package client;

import clientui.PhoneClientGUI;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.example.phone.Contact;
import org.example.phone.ContactResponse;
import org.example.phone.Phone;
import org.example.phone.PhoneRequest;
import org.example.phone.PhoneResponse;
import org.example.phone.PhoneServiceGrpc;
import org.example.phone.PlaylistSongs;
import org.example.phone.Song;
import org.example.phone.VolumeDownResponse;
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

    
    
    public void playSong() {
      
            Empty request = Empty.newBuilder().build();
            System.out.println("Playing song through internal speakers");
            ui.append("Playing song through internal speakers");
            PlaylistSongs usermusic = blockingStub2.playSong(request);
            List<Song> usermusicSongs = usermusic.getSongsList();
            for (Song son : usermusicSongs) {
                ui.append(son.toString());
                System.out.println(son);

            }
    }
       
    
      public void showcontacts() {
      
            Empty request = Empty.newBuilder().build();
            System.out.println("ListingContacts");
            ui.append("Listing Contacts");
            ContactResponse contactslist = blockingStub2.showcontacts(request);
            List<Contact> contactslistContacts = contactslist.getContactsList();
            for (Contact con : contactslistContacts) {
                ui.append(con.toString());
                System.out.println(con);

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
        PhoneServiceGrpc.PhoneServiceBlockingStub stub = PhoneServiceGrpc.newBlockingStub(channel);

        
            Empty request = Empty.newBuilder().build();

    

        VolumeUpResponse response = stub.volumeUp(request);
        ui.append("Increasing Volume");
        System.out.println("Increasing Volume");

        System.out.println("The current volume is "+ response.getCurrentvolume()+ " decibels ");
        ui.append("The current volume is "+response.getCurrentvolume() + " decibels");

    }
           
           
           
        public void volumeDown ( ){
        PhoneServiceGrpc.PhoneServiceBlockingStub stub = PhoneServiceGrpc.newBlockingStub(channel);


        
            Empty request = Empty.newBuilder().build();

    

        VolumeDownResponse response = stub.volumeDown(request);
        
        System.out.println("Decreasing Volume");
        ui.append("Decreasing Volume");
        System.out.println("The current volume is "+ response.getCurrentvolume() + " decibels ");
        ui.append("The current volume is "+response.getCurrentvolume() + " decibels ");

        
        
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
       

     
    
    
    public void switchService(String name) {

    }

    public static void main(String[] args) {
        new PhoneClient();
    }

}