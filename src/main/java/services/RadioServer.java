
/*

Author:Sean Cowley--x14484252
*/


package services;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import org.example.radio.RadioServiceGrpc;
import java.util.logging.Logger;
import org.example.radio.ChannelRequest;
import org.example.radio.ChannelResponse;
import org.example.radio.Radio;
import org.example.radio.RadioRequest;
import org.example.radio.RadioResponse;
import serviceui.Printer;
import serviceui.ServiceUI;

/**
 * Server that manages startup/shutdown of a {@code Greeter} server.
 */
public class RadioServer {

    private static final Logger logger = Logger.getLogger(RadioServer.class.getName());

    /* The port on which the server should run */
    private int port = 50055;
    private Server server;

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new RadioServiceImpl())
                .build()
                .start();
        JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Radio", "_radio._udp.local.", "", port);
        



        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                RadioServer.this.stop();
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
        final RadioServer server = new RadioServer();
        server.start();
        server.blockUntilShutdown();
    }
    
    

    private class RadioServiceImpl extends RadioServiceGrpc.RadioServiceImplBase {

        private Printer ui;
       

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
    public StreamObserver<ChannelRequest> channel1(StreamObserver<ChannelResponse> responseObserver) {
        // we create the requestObserver that we'll return in this function
        StreamObserver<ChannelRequest> requestObserver = new StreamObserver<ChannelRequest>() {

            String channel = "";

            @Override
            public void onNext(ChannelRequest value) {
                // client sends a message
                channel += "The current channel is " + value.getChannel().getChannel1() + "!";
                ui.append("The current channel is "+value.getChannel().getChannel1());
            }

            @Override
            public void onError(Throwable t) {
                // client sends an error
            }

            @Override
            public void onCompleted() {
                // client is done
                responseObserver.onNext(
                        ChannelResponse.newBuilder()
                                .setChannel(channel)
                                .build()
                        
                );
                responseObserver.onCompleted();
            }
        };


        return requestObserver;
    }
    
    
       @Override
    public StreamObserver<ChannelRequest> channel2(StreamObserver<ChannelResponse> responseObserver) {
        // we create the requestObserver that we'll return in this function
        StreamObserver<ChannelRequest> requestObserver = new StreamObserver<ChannelRequest>() {

            String channel = "";

            @Override
            public void onNext(ChannelRequest value) {
                // client sends a message
                channel += "The current channel is " + value.getChannel().getChannel2() + "!";
                ui.append("The current channel is "+value.getChannel().getChannel2());

            }

            @Override
            public void onError(Throwable t) {
                // client sends an error
            }

            @Override
            public void onCompleted() {
                // client is done
                responseObserver.onNext(
                        ChannelResponse.newBuilder()
                                .setChannel(channel)
                                .build()
                );
                responseObserver.onCompleted();
            }
        };


        return requestObserver;
    }
    
    
        @Override
    public StreamObserver<ChannelRequest> channel3(StreamObserver<ChannelResponse> responseObserver) {
        // we create the requestObserver that we'll return in this function
        StreamObserver<ChannelRequest> requestObserver = new StreamObserver<ChannelRequest>() {

            String channel = "";

            @Override
            public void onNext(ChannelRequest value) {
                // client sends a message
                channel += "The current channel is " + value.getChannel().getChannel3() + "!";
                ui.append("The current channel is "+value.getChannel().getChannel3());

            }

            @Override
            public void onError(Throwable t) {
                // client sends an error
            }

            @Override
            public void onCompleted() {
                // client is done
                responseObserver.onNext(
                        ChannelResponse.newBuilder()
                                .setChannel(channel)
                                .build()
                );
                responseObserver.onCompleted();
            }
        };


        return requestObserver;
    }
    
    
    
       @Override
    public StreamObserver<ChannelRequest> channel4(StreamObserver<ChannelResponse> responseObserver) {
        // we create the requestObserver that we'll return in this function
        StreamObserver<ChannelRequest> requestObserver = new StreamObserver<ChannelRequest>() {

            String channel = "";

            @Override
            public void onNext(ChannelRequest value) {
                // client sends a message
                channel += "The current channel is " + value.getChannel().getChannel4() + "!";
                ui.append("The current channel is "+value.getChannel().getChannel4());

            }

            @Override
            public void onError(Throwable t) {
                // client sends an error
            }

            @Override
            public void onCompleted() {
                // client is done
                responseObserver.onNext(
                        ChannelResponse.newBuilder()
                                .setChannel(channel)
                                .build()
                );
                responseObserver.onCompleted();
            }
        };


        return requestObserver;
    }
    
 

   
}
    
}