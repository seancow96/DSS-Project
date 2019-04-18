/*

Author:Sean Cowley--x14484252
*/

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
import org.example.milage.CostResponse;
import org.example.milage.DaysRequest;
import org.example.milage.FuelLevelResponse;
import org.example.milage.MilageServiceGrpc;
import org.example.milage.TirePressureResponse;
import org.example.milage.TotalResponse;
import org.example.milage.Welcome;
import org.example.milage.WelcomeRequest;
import org.example.milage.WelcomeResponse;
import serviceui.Printer;
import serviceui.ServiceUI;

/**
 * Server that manages startup/shutdown of a {@code Greeter} server.
 */
public class MilageServer {

    private static final Logger logger = Logger.getLogger(MilageServer.class.getName());

    /* The port on which the server should run */
    private int port = 50056;
    private Server server;

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new MilageServiceImpl())
                .build()
                .start();
        //jdns
        JmDNSRegistrationHelper helper2 = new JmDNSRegistrationHelper("Seans", "_mile._udp.local.", "", port);
    




        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                MilageServer.this.stop();
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
        final MilageServer server = new MilageServer();
        server.start();
        server.blockUntilShutdown();
    }
    
    
        private class MilageServiceImpl extends MilageServiceGrpc.MilageServiceImplBase {
            
            
   //jdns
        private Printer ui;
        int tirepressure =35; 
        int normalpressure = 35;
        double fuellevel = 4.5; 
        double normalfuellevel = 8.0;
        
        
          public MilageServiceImpl() {
          String name = "Seans";
            String serviceType = "_mile._udp.local.";
            ui = new ServiceUI(name + serviceType);
           
            
             
 }

         
   @Override
    public void welcome(WelcomeRequest request, StreamObserver<WelcomeResponse> responseObserver) {
        // extract the fields we need
        Welcome welcome = request.getWelcome(); 
        String GreetUser = welcome.getGreetuser();

        // creates the response to the user
        String greeteduser = "Welcome to the milage service " + GreetUser;
        WelcomeResponse response = WelcomeResponse.newBuilder()
                .setGreeteduser(greeteduser)
                .build();
                 ui.append("Welcome to the milage service");

        // sends the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }   
          
          //https://learn.eartheasy.com/guides/how-to-calculate-gas-mileage/ ---formula for milages service
          //http://fuel-economy.co.uk/calc.html
    
    
          
  //uranary
   @Override
    public void totalMiles(DaysRequest req, StreamObserver<TotalResponse> responseObserver) {
        

        TotalResponse totalResponse = TotalResponse.newBuilder()
        // Gets the sum of all the miles driven per week by the car
                .setResult(req.getMonday() + req.getTuesday() + req.getWednesday() + req.getThursday()
                          + req.getFriday() + req.getSaturday() + req.getSunday())
                .build();
        
        
        //sends the response

        responseObserver.onNext(totalResponse);
         ui.append("the total miles travelled per day was "+totalResponse.toString());
        // rpc call is completed
        responseObserver.onCompleted();

    }
    
    
    
//client streaming 
       
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
                               ui.append("Checking the average  miles ");
                               ui.append("The average number of miles travelled per day is "+average);



                                //tells the client we are done 
                responseObserver.onCompleted();
            }
        };

        return requestObserver;
    }
    
   
    
    //uranary
   @Override
    public void calculateCost(DaysRequest req, StreamObserver<CostResponse> responseObserver) {
        
           
            
        CostResponse costResponse = CostResponse.newBuilder()
        // Gets the sum of all the miles driven per week by the car
                .setCost(req.getMonday() + req.getTuesday() + req.getWednesday() + req.getThursday()
                          + req.getFriday() + req.getSaturday() + req.getSunday()) 
                .build();
        
                        
        
        //sends the response
        ui.append("Your cars mpg is 35");
        responseObserver.onNext(costResponse);
        ui.append("The cost of fuel is currently 2.83 litres per gallon");
        ui.append("The total cost in dollars is " + costResponse.toString());


        // rpc call is completed
        responseObserver.onCompleted();

    }
    
    
    @Override
    public void checkTirePressure(Empty Request, StreamObserver<TirePressureResponse> responseObserver) {
      
        
       
        TirePressureResponse tirepressureResponse = TirePressureResponse.newBuilder()
                .setCurrentpressure(tirepressure)
                .build();
                 ui.append("The current tire pressure is "+tirepressureResponse.toString());
        
        //sends the response

        responseObserver.onNext(tirepressureResponse);
        // rpc call is completed
        responseObserver.onCompleted();

    }
    
    
       
    @Override
    public void checkFuelLevel(Empty Request, StreamObserver<FuelLevelResponse> responseObserver) {
      
        
       
        FuelLevelResponse fuellevelResponse = FuelLevelResponse.newBuilder()
                .setCurrentfuellevel(fuellevel)
                .build();
                 ui.append("The current fuel is  " +fuellevelResponse.toString());
        
        //sends the response

        responseObserver.onNext(fuellevelResponse);
        // rpc call is completed
        responseObserver.onCompleted();

    }
    
    
}
}