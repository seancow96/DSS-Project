package services;

import com.google.protobuf.Empty;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Timer;
import java.util.TimerTask;

import org.example.radio.RadioServiceGrpc;
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
import serviceui.Printer;
import serviceui.ServiceUI;

/**
 * Server that manages startup/shutdown of a {@code Greeter} server.
 */
public class PhoneServer {

    private static final Logger logger = Logger.getLogger(PhoneServer.class.getName());

    /* The port on which the server should run */
    private int port = 50056;
    private Server server;

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new PhoneServiceImpl())
                .build()
                .start();
       JmDNSRegistrationHelper helper2 = new JmDNSRegistrationHelper("Seans", "_phone._udp.local.", "", port);
      // JmDNSRegistrationHelper helper2 = new JmDNSRegistrationHelper("Seans", "_radio._udp.local.", "", port);




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
            
            
   
        private List<Song> songs;
        private Printer ui;
        
          public PhoneServiceImpl() {
          String name = "Seans";
            String serviceType = "_phone._udp.local.";
            ui = new ServiceUI(name + serviceType);
           
             
            songs = new ArrayList<Song>();
            Song welcometothejungle = Song.newBuilder().setArtist("Guns N Roses").setGenre("Rock").build();
            songs.add(welcometothejungle);
            

          
 }
          
            @Override
    public void volumeUp(VolumeUpRequest req, StreamObserver<VolumeUpResponse> responseObserver) {
        
         int Temp = 15;
         int MaxTemp =20;
        // Gets the sum of all the miles driven per week by the car
       
        if(Temp < MaxTemp){
            Temp ++;
        }else if(Temp>MaxTemp){
         System.out.println("We have hit the max");

        }
       
        VolumeUpResponse volumeupResponse = VolumeUpResponse.newBuilder()
                .setCurrenttemp(Temp)
                .build();
        
        //sends the response

        responseObserver.onNext(volumeupResponse);
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
     public StreamObserver<BluetoothRequest> bluetooth(final StreamObserver<BluetoothResponse> responseObserver) {
        // we create the requestObserver that we'll return in this function
       StreamObserver<BluetoothRequest> requestObserver = new StreamObserver<BluetoothRequest>() {

            String connected = "";

           @Override
           public void onNext(BluetoothRequest value) {
                // client sends a message
               connected += "Preparing to turn on bluetooth " + value.getPhone().getBluetooth();

               
           }

           @Override
          public void onError(Throwable t) {
                // client sends an error
          }

         @Override
          public void onCompleted() {
                // client is done
             responseObserver.onNext(
                       BluetoothResponse.newBuilder()
                              .setBluetoothon(connected)
                              .build()

               );
                 ui.append(connected.toString());

                responseObserver.onCompleted();
           }
       };


       return requestObserver;
    }
    
    
    
        @Override
     public StreamObserver<DeviceRequest> connectDevice(final StreamObserver<DeviceResponse> responseObserver) {
        // we create the requestObserver that we'll return in this function
       StreamObserver<DeviceRequest> requestObserver = new StreamObserver<DeviceRequest>() {

            String connected = "";

           @Override
           public void onNext(DeviceRequest value) {
                // client sends a message
               connected += "Preparing to connect device " + value.getPhone().getConnectspeaker();
               ui.append(value.getPhone().getConnectspeaker().toString());

               
           }

           @Override
          public void onError(Throwable t) {
                // client sends an error
          }

         @Override
          public void onCompleted() {
                // client is done
             responseObserver.onNext(
                       DeviceResponse.newBuilder()
                              .setConnected(connected)
                              .build()

               );
                 ui.append(connected.toString());

                responseObserver.onCompleted();
           }
       };


       return requestObserver;
    }
    
         @Override
        public void getAllSongs(Empty request,
                StreamObserver<PlaylistSongs> responseObserver) {
            PlaylistSongs all = PlaylistSongs.newBuilder().addAllSongs(songs).build();
            responseObserver.onNext(all);
            responseObserver.onCompleted();
            
        }
  
        }
    
   
    
}