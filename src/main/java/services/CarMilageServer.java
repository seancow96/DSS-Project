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
import java.util.logging.Logger;
import org.example.milage.AverageMilesResponse;
import org.example.milage.DaysRequest;
import org.example.milage.MilageServiceGrpc;
import org.example.milage.TotalResponse;
import org.example.phone.FindMaximumRequest;
import org.example.phone.FindMaximumResponse;
import serviceui.Printer;
import serviceui.ServiceUI;

/**
 * Server that manages startup/shutdown of a {@code Greeter} server.
 */
public class CarMilageServer {

    private static final Logger logger = Logger.getLogger(CarMilageServer.class.getName());

    /* The port on which the server should run */
    private int port = 50056;
    private Server server;

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new MilageServiceImpl())
                .build()
                .start();
        JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Seans", "_milage._udp.local.", "", port);
 



        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                CarMilageServer.this.stop();
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
        final CarMilageServer server = new CarMilageServer();
        server.start();
        server.blockUntilShutdown();
    }
    
    
        private class MilageServiceImpl extends MilageServiceGrpc.MilageServiceImplBase {
            

        private Printer ui;
        
          public MilageServiceImpl() {
          String name = "Seans";
            String serviceType = "_milage._udp.local.";
            ui = new ServiceUI(name + serviceType);

             
 }
          
  //uranary
   @Override
    public void totalMiles(DaysRequest req, StreamObserver<TotalResponse> responseObserver) {
        

        TotalResponse totalResponse = TotalResponse.newBuilder()
        // gets 1st, 2nd ,3rd and 4th number from request and add them up
                .setResult(req.getMonday() + req.getTuesday() + req.getWednesday() + req.getThursday())
                .build();

        responseObserver.onNext(totalResponse);

        responseObserver.onCompleted();

    }
    

        
             @Override
    public StreamObserver<DaysRequest> averageMiles(final StreamObserver<AverageMilesResponse> responseObserver) {

        StreamObserver<DaysRequest> requestObserver = new StreamObserver<DaysRequest>() {
            // run sum and count
            // everytime we recieve a request we increment the sum and the count
            int sum = 0;
            int count = 0;
      //for every message we get, we get the sum and the count and increment it 
            @Override
            public void onNext(DaysRequest value) {
                // increments the sum
               sum += value.getMonday();
               sum += value.getTuesday();
               sum += value.getWednesday();
               sum += value.getThursday();
               sum += value.getFriday();
               sum += value.getSaturday();
               sum += value.getSunday();

          

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
                        AverageMilesResponse.newBuilder().setAverage(average)
                                .build());
                                //tell the client we are done
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
  
     
    
        }
  
    
}   