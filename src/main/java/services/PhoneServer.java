
/*

Author:Sean Cowley--x14484252
*/

package services;

import com.google.protobuf.Empty;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;
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
import serviceui.Printer;
import serviceui.ServiceUI;

/**
 * Server that manages startup/shutdown of a {@code Greeter} server.
 */
public class PhoneServer {

    private static final Logger logger = Logger.getLogger(PhoneServer.class.getName());

    /* The port on which the server should run */
    private int port = 50054;
    private Server server;

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new PhoneServiceImpl())
                .build()
                .start();
       JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Seans", "_phone._udp.local.", "", port);





        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                PhoneServer.this.stop();
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
        final PhoneServer server = new PhoneServer();
        server.start();
        server.blockUntilShutdown();
    }
    
    
    
        private class PhoneServiceImpl extends PhoneServiceGrpc.PhoneServiceImplBase {
            
            
        private List<Contact> contacts;
        private List<Song> songs;
        private Printer ui;
        int Vol =0;
        int MaxVol =10;
        int MinVol = 0;
        int phoneStatus = 0;

       

        
          public PhoneServiceImpl() {
          String name = "Seans";
            String serviceType = "_phone._udp.local.";
            ui = new ServiceUI(name + serviceType);
           
             //playlingsong
            songs = new ArrayList<Song>();
            Song welcometothejungle = Song.newBuilder().setArtist("Guns N Roses").setGenre("Rock").build();
            songs.add(welcometothejungle);
            
            
            ///arraylist of contacts
            contacts = new ArrayList<Contact>();
            Contact peter = Contact.newBuilder()
                    .setName("Peter")
                    .setLastname("House")
                    .setAddress("123 OakMount Avenue")
                    .setPhonenumber("085,689,2384")
                    .build();
                   contacts.add(peter);
            
              Contact jack = Contact.newBuilder()
                    .setName("Jack")
                    .setLastname("Doyle")
                    .setAddress("345 Snowterrace Avenue")
                    .setPhonenumber("085,567,2347")
                    .build();
                    contacts.add(jack);
                    
                    Contact eve = Contact.newBuilder()
                    .setName("Eve")
                    .setLastname("breslin")
                    .setAddress("234 Terrace Avenue")
                    .setPhonenumber("085,567,3454")
                    .build();
                    contacts.add(eve);
                    
                    Contact tim = Contact.newBuilder()
                    .setName("Tim")
                    .setLastname("groves")
                    .setAddress("15 Wigwam way")
                    .setPhonenumber("086,124,4562")
                    .build();
                    contacts.add(tim);
                    
                    Contact linda = Contact.newBuilder()
                    .setName("Linda")
                    .setLastname("Carrol")
                    .setAddress("33 ridgeway Avenue")
                    .setPhonenumber("087,563,2371")
                    .build();
                    contacts.add(linda);

 }
          
          
          
          
          
    @Override
    public void volumeUp(Empty Request, StreamObserver<VolumeUpResponse> responseObserver) {
        //increase the volume by 1 decibel
       
        if(Vol < MaxVol){
            Vol +=1;
        }else if(Vol == MaxVol){
          ui.append("You have reached the max volume"+MaxVol);


        }
       
       
        VolumeUpResponse volumeupResponse = VolumeUpResponse.newBuilder()
                .setCurrentvolume(Vol)
                .build();
                 ui.append("Increasing Volume");
                 ui.append(volumeupResponse.toString());
                 
        
        //sends the response

        responseObserver.onNext(volumeupResponse);
        // rpc call is completed
        responseObserver.onCompleted();

    }
          
    
    
    
    
            @Override
    public void volumeDown(Empty Request, StreamObserver<VolumeDownResponse> responseObserver) {
        
       
        if(Vol > MinVol){
            Vol -=1;
        }else if(Vol == MinVol){
          ui.append("You have reached the min volume"+MinVol);


        }
       
       
        VolumeDownResponse volumedownResponse = VolumeDownResponse.newBuilder()
                .setCurrentvolume(Vol)
                .build();
                 ui.append("Decreasing Volume");
                 ui.append(volumedownResponse.toString());

        
        //sends the response

        responseObserver.onNext(volumedownResponse);
        // rpc call is completed
        responseObserver.onCompleted();

    }  
    
  
    
    
          
          
    
         @Override
    public void phoneOn(PhoneRequest request, StreamObserver<PhoneResponse> responseObserver) {
        // extract the fields we need
      Phone phone = request.getPhone(); 
        String TurnPhoneOn = phone.getTurnphoneon();
        
        
      
       
        // create the response
         String phonestatus = "The phone is " + TurnPhoneOn;
        PhoneResponse response = PhoneResponse.newBuilder()
                .setPhonestatus(phonestatus)
                .build();
                 ui.append(response.toString());


        // send the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }
    
    

          @Override
    public void phoneOff(PhoneRequest request, StreamObserver<PhoneResponse> responseObserver) {
        // extract the fields we need
        Phone phone = request.getPhone(); 
        String TurnPhoneOff = phone.getTurnphoneoff();



         // create the response
        String phonestatus = "The phone is " + TurnPhoneOff;
        PhoneResponse response = PhoneResponse.newBuilder()
                .setPhonestatus(phonestatus)
                .build();
                 ui.append(response.toString());

        // send the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }

    
           @Override
    public void pause(PhoneRequest request, StreamObserver<PhoneResponse> responseObserver) {
        // extract the fields we need
        Phone phone = request.getPhone(); 
        String Pause = phone.getPause();
        


        // create the response
        String phonestatus = "The song has been " + Pause;
        PhoneResponse response = PhoneResponse.newBuilder()
                .setPhonestatus(phonestatus)
                .build();
                 ui.append(response.toString());

        // send the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }
    
    
        
        
         @Override
        public void showcontacts(Empty request,
                StreamObserver<ContactResponse> responseObserver) {
            ContactResponse all = ContactResponse.newBuilder().addAllContacts(contacts).build();
            responseObserver.onNext(all);
            ui.append(all.toString());
            responseObserver.onCompleted();
            
        }

         @Override
        public void playSong(Empty request,
                StreamObserver<PlaylistSongs> responseObserver) {
            PlaylistSongs all = PlaylistSongs.newBuilder().addAllSongs(songs).build();
            responseObserver.onNext(all);
            ui.append("Playing Song");
            ui.append(all.toString());
            responseObserver.onCompleted();
            
        }
  
        }
    
   
    
}