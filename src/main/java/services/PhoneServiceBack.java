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
import org.example.radio.VolumeRequest;
import org.example.radio.VolumeResponse;
import serviceui.Printer;
import serviceui.ServiceUI;

/**
 * Server that manages startup/shutdown of a {@code Greeter} server.
 */
public class PhoneServiceBack {

    private static final Logger logger = Logger.getLogger(PhoneServiceBack.class.getName());

    /* The port on which the server should run */
    private int port = 50056;
    private Server server;

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new PhoneServiceImpl())
                .addService(new RadioServiceImpl())
                .build()
                .start();
        JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Seans", "_phone._udp.local.", "", port);
        JmDNSRegistrationHelper helper2 = new JmDNSRegistrationHelper("Seans", "_radio._udp.local.", "", port);




        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                PhoneServiceBack.this.stop();
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
        final PhoneServiceBack server = new PhoneServiceBack();
        server.start();
        server.blockUntilShutdown();
    }
    
    
        private class PhoneServiceImpl extends PhoneServiceGrpc.PhoneServiceImplBase {
            
            
        String nextStation;
        String previousStation;
        private List<Song> songs;
        private Printer ui;
        
          public PhoneServiceImpl() {
          String name = "Seans";
            String serviceType = "_phone._udp.local.";
            ui = new ServiceUI(name + serviceType);
           
            
             
            songs = new ArrayList<Song>();
            Song welcometothejungle = Song.newBuilder().setArtist("Guns N Roses").setGenre("Rock").build();
            Song lovegun = Song.newBuilder().setArtist("Kiss").setGenre("Glam rock").build();
            Song entersandman = Song.newBuilder().setArtist("Metallica").setGenre("Heavy Metal").build();
            songs.add(welcometothejungle);
            songs.add(lovegun);
            songs.add(entersandman);
 }

         @Override
    public void phoneOn(PhoneRequest request, StreamObserver<PhoneResponse> responseObserver) {
        // extract the fields we need
        Phone phone = request.getPhone(); 
        String TurnPhoneOn = phone.getTurnphoneon();

        // create the response
        String phonestate = "The phone is " + TurnPhoneOn;
        PhoneResponse response = PhoneResponse.newBuilder()
                .setPhonestate(phonestate)
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
        String phonestate = "The phone is " + TurnPhoneOff;
        PhoneResponse response = PhoneResponse.newBuilder()
                .setPhonestate(phonestate)
                .build();
                 ui.append(response.toString());

        // send the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
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
    
    

    private class RadioServiceImpl extends RadioServiceGrpc.RadioServiceImplBase {

        private Printer ui;
        private int count;
       

        public RadioServiceImpl() {
         
            String name = "Seans";
            String serviceType = "_radio._udp.local.";
            ui = new ServiceUI(name + serviceType);
           

        }


         @Override
    public void radioOn(RadioRequest request, StreamObserver<RadioResponse> responseObserver) {
        // extract the fields we need
        Radio radio = request.getRadio(); 
        String TurnRadioOn = radio.getTurnradioon();

        // create the response
        String radiostate = "The radio is " + TurnRadioOn;
        RadioResponse response = RadioResponse.newBuilder()
                .setRadiostate(radiostate)
                .build();
                 ui.append(response.toString());

        // send the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }
    
           @Override
    public void radioOff(RadioRequest request, StreamObserver<RadioResponse> responseObserver) {
        // extract the fields we need
        Radio radio = request.getRadio(); 
        String TurnRadioOff = radio.getTurnradiooff();

        // create the response
        String radiostate = "The radio is " + TurnRadioOff;
        RadioResponse response = RadioResponse.newBuilder()
                .setRadiostate(radiostate)
                .build();
                 ui.append(response.toString());

        // send the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }
    
    
       @Override
    public StreamObserver<VolumeRequest> volumeUp(final StreamObserver<VolumeResponse> responseObserver) {

        StreamObserver<VolumeRequest> requestObserver = new StreamObserver<VolumeRequest>() {
            // run sum and count
            // everytime we recieve a request we increment the sum and the count
            int sum = 0;
            int count = 0;
      //for every message we get, we get the sum and the count and increment it 
            @Override
            public void onNext(VolumeRequest value) {
                // increments the sum
               sum += value.getNumber();
               
               if (sum < 10) {
                   sum += 1;
            }
            }
           

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                // computes average sum divided by count
                double currentvolume =  sum+=1 ;
                //computed average and send the response
                responseObserver.onNext(
                        VolumeResponse.newBuilder().setCurrentvolume(currentvolume)
                                .build());
                                //tell the client we are done
                responseObserver.onCompleted();
            }
        };

        return requestObserver;
    }
    
 

   
}
    
}