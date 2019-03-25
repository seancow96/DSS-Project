package services;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import io.grpc.stub.StreamObserver;
import java.util.Timer;
import java.util.TimerTask;

import org.example.speaker.SpeakerServiceGrpc;
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
import serviceui.Printer;
import serviceui.ServiceUI;

/**
 * Server that manages startup/shutdown of a {@code Greeter} server.
 */
public class SpeakerServer {

    private static final Logger logger = Logger.getLogger(ToasterServer.class.getName());

    /* The port on which the server should run */
    private int port = 50056;
    private Server server;

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new SpeakerServiceImpl())
                .build()
                .start();
        JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Seans", "_speaker._udp.local.", "", port);
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                SpeakerServer.this.stop();
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
        final SpeakerServer server = new SpeakerServer();
        server.start();
        server.blockUntilShutdown();
    }

    private class SpeakerServiceImpl extends SpeakerServiceGrpc.SpeakerServiceImplBase {

        private Printer ui;

        public SpeakerServiceImpl() {
            String name = "Seans";
            String serviceType = "_toaster._udp.local.";
            ui = new ServiceUI(name + serviceType);
        }

         @Override
    public void speakerOn(SpeakerRequest request, StreamObserver<SpeakerResponse> responseObserver) {
        // extract the fields we need
        Speaker speaker = request.getSpeaker(); 
        String TurnSpeakerOn = speaker.getTurnspeakeron();

        // create the response
        String speakerstate = "The speaker is " + TurnSpeakerOn;
        SpeakerResponse response = SpeakerResponse.newBuilder()
                .setSpeakerstate(speakerstate)
                .build();
                 ui.append(response.toString());

        // send the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }
    
           @Override
    public void speakerOff(SpeakerRequest request, StreamObserver<SpeakerResponse> responseObserver) {
        // extract the fields we need
        Speaker speaker = request.getSpeaker(); 
        String TurnSpeakerOff = speaker.getTurnspeakeroff();

        // create the response
        String speakerstate = "The speaker is " + TurnSpeakerOff;
        SpeakerResponse response = SpeakerResponse.newBuilder()
                .setSpeakerstate(speakerstate)
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
               connected += "Preparing to connect device " + value.getSpeaker().getConnectspeaker();
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
                responseObserver.onCompleted();
           }
       };


       return requestObserver;
    }
     
     
     
       public StreamObserver<FindMaximumRequest> findMaximumViews(final StreamObserver<FindMaximumResponse> responseObserver) {

        return new StreamObserver<FindMaximumRequest>() {
            // current maximum is zero - assumes the number is positive 
            int currentMaximum = 0;

            @Override
            public void onNext(FindMaximumRequest value) {
                int currentNumber = value.getNumber();
                 //if new number is great than current maxium
                if (currentNumber > currentMaximum) {
                    // current maxium has a new value
                    currentMaximum = currentNumber;
                    responseObserver.onNext(
                            FindMaximumResponse.newBuilder()
                                    .setMaximum(currentNumber)
                                    .build()
                                    // anytime we recieve a current number that is greater than current maximum
                                    //we will increase the current maximum and send back the response
                    );
                } else {
                }
            }

            @Override //close request
            public void onError(Throwable t) {
                responseObserver.onCompleted();
            }

            @Override
            public void onCompleted() {
                // send the current last maximum
                responseObserver.onNext(
                        FindMaximumResponse.newBuilder()
                                .setMaximum(currentMaximum)
                                .build());
            
                //send the last current maxium
                // the server is done sending data
                responseObserver.onCompleted();
            }
        };

    }
     
     
    
         @Override
    public StreamObserver<AverageRequest> averageViews(final StreamObserver<AverageResponse> responseObserver) {

        StreamObserver<AverageRequest> requestObserver = new StreamObserver<AverageRequest>() {
            // run sum and count
            // everytime we recieve a request we increment the sum and the count
            int sum = 0;
            int count = 0;
      //for every message we get, we get the sum and the count and increment it 
            @Override
            public void onNext(AverageRequest value) {
                // increments the sum
               sum += value.getFirstSong();
               sum += value.getSecondSong();
               sum += value.getThirdSong();
          

                // increments the count
                count += 1;
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                // computes average sum divided by count
                double average = (double) sum / count;
                //computed average and send the response
                responseObserver.onNext(
                        AverageResponse.newBuilder().setAverage(average)
                                .build());
                                //tell the client we are done
                responseObserver.onCompleted();
            }
        };

        return requestObserver;
    }
     
  
    
    
    
   
}
}