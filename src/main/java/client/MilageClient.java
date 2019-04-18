
/*

Author:Sean Cowley--x14484252
*/
package client;


import clientui.MilageGUI;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.example.milage.AverageMilesResponse;
import org.example.milage.CostResponse;
import org.example.milage.DaysRequest;
import org.example.milage.FuelLevelResponse;
import org.example.milage.MaxMilesRequest;
import org.example.milage.MaxMilesResponse;
import org.example.milage.MilageServiceGrpc;
import org.example.milage.TirePressureResponse;
import org.example.milage.TotalResponse;
import org.example.milage.Welcome;
import org.example.milage.WelcomeRequest;
import org.example.milage.WelcomeResponse;





public class MilageClient implements ServiceObserver {

    protected MilageGUI ui;
    protected ServiceDescription current;
    private final String serviceType;
    private final String name;
    private static final Logger logger = Logger.getLogger(MilageClient.class.getName());
    private ManagedChannel channel;
    private MilageServiceGrpc.MilageServiceBlockingStub blockingStub2;



    /**
     * Constructor.
     */
    public MilageClient() {
        serviceType = "_mile._udp.local.";
        name = "Seans";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             
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
        System.out.println("Milage Service added");
        channel = ManagedChannelBuilder.forAddress(service.getAddress(), service.getPort())
        .usePlaintext(true)
        .build();
        blockingStub2 = MilageServiceGrpc.newBlockingStub(channel);
        //runs the channels
        welcome();
        totalMiles();
        maximum();
        averageMiles();
        calculateCost();
        checkTirePressure();
        checkFuelLevel();
      
      
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

  
    
    
    public void welcome() {

         
        // created a protocol buffer greeting message
        Welcome welcome = Welcome.newBuilder()
                .setGreetuser("Sean")
                .build();

        // do the same for a GreetRequest
        WelcomeRequest welcomeRequest = WelcomeRequest.newBuilder()
                .setWelcome(welcome)
                .build();

        // call the RPC and get back a GreetResponse (protocol buffers)
            WelcomeResponse welcomeResponse = blockingStub2.welcome(welcomeRequest);
        // call the RPC and get back a GreetResponse (protocol buffers)
        
        System.out.println(welcomeResponse.getGreeteduser());

     try {
                      Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
    }
   
    
    
      public void totalMiles ( ){
        // created a greet service client uranary
//passing the channel
        MilageServiceGrpc.MilageServiceBlockingStub stub = MilageServiceGrpc.newBlockingStub(channel);

  //takes in a sum request

            DaysRequest req = DaysRequest.newBuilder()
                .setMonday(12.4)
                .setTuesday(22.4)
                .setWednesday(14.12)
                .setThursday(29.78)
                .setFriday(15.12)
                .setSaturday(27.12)
                .setSunday(26.45)
                .build();

        TotalResponse response = stub.totalMiles(req);
        
        System.out.println("The total miles travelled over 7 days was "+response.getResult());
        
             try {
                      Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
        
        
    }

      
       //does a bidirectional call  
     public void maximum(){
        MilageServiceGrpc.MilageServiceStub asyncClient = MilageServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);



        StreamObserver<MaxMilesRequest> requestObserver = asyncClient.maxMilesDriven(new StreamObserver<MaxMilesResponse>() {
            @Override    //anytime we receieve a response from the client we say
            public void onNext(MaxMilesResponse value) {
                //gets new maximum from server
                System.out.println("Got new value for maximum miles per day over 7 days" + value.getMaxmiles());
            }

            @Override
            public void onError(Throwable t) {
                latch.countDown();
            }

            @Override
            //server completes sending messages
            public void onCompleted() {
                System.out.println("Max miles completed");
            }
        });

//sending data to the request observer
//lamdasfunction


        Arrays.asList(12.4, 22.4, 14.12, 29.78, 15.12, 27.12, 26.45).forEach(
                number -> {
                    System.out.println("Sending miles per day : " + number);
                    requestObserver.onNext(MaxMilesRequest.newBuilder()
                            .setNumber(number)
                            .build());
                    
                    
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );

        requestObserver.onCompleted();
    }
      
      
     
         //client streaming
     public void averageMiles(){
        MilageServiceGrpc.MilageServiceStub asyncClient = MilageServiceGrpc.newStub(channel);

        final CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<DaysRequest> requestObserver = asyncClient.averageMiles(new StreamObserver<AverageMilesResponse>() {
            @Override
            public void onNext(AverageMilesResponse value) {
                System.out.println("Checking the average miles");
                System.out.println("The average number of miles travelled per day is" );
                System.out.println( value.getAverage());
                ui.append("The total cost in dollars is " + value.toString());
               
                
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("Average Miles completed");
         
                
                 latch.countDown();
            }
        });
        
        //setting the value of the miles travelled per day
       
        requestObserver.onNext(DaysRequest.newBuilder()
        .setMonday(12.4)
        .build());
        
              
        requestObserver.onNext(DaysRequest.newBuilder()
        .setTuesday(22.4)
        .build());
        
              
        requestObserver.onNext(DaysRequest.newBuilder()
        .setWednesday(14.12)
        .build());
        
          requestObserver.onNext(DaysRequest.newBuilder()
        .setThursday(29.78)
        .build());
          
            requestObserver.onNext(DaysRequest.newBuilder()
        .setFriday(15.12)
        .build());
            
              requestObserver.onNext(DaysRequest.newBuilder()
        .setSaturday(27.12)
        .build());
              
         requestObserver.onNext(DaysRequest.newBuilder()
        .setSunday(26.45)
        .build());
              

        requestObserver.onCompleted();

          try {
                      Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
    }
     
     //unary
    public void calculateCost ( ){
        // created a greet service client uranary
//passing the channel
        MilageServiceGrpc.MilageServiceBlockingStub stub = MilageServiceGrpc.newBlockingStub(channel);

  //takes in a sum request

            DaysRequest req = DaysRequest.newBuilder()
                .setMonday(12.4)
                .setTuesday(22.4)
                .setWednesday(14.12)
                .setThursday(29.78)
                .setFriday(15.12)
                .setSaturday(27.12)
                .setSunday(26.45)
                .setMpg(35)
                .setPrice(2.83)
    

                .build();

        CostResponse response = stub.calculateCost(req);
        
        System.out.println("Your cars mpg is 35 ");
        System.out.println("The cost of fuel is currently 2.83 litres per gallon");
        System.out.println("The total cost in dollars is " + response.getCost() / req.getMpg() *req.getPrice());

        
          try {
                      Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
        
    }
    

    
    
          //unary
        public void checkTirePressure ( ){
        MilageServiceGrpc.MilageServiceBlockingStub stub = MilageServiceGrpc.newBlockingStub(channel);
        
        Empty request = Empty.newBuilder().build();
        //normal pressure for tires is 35
        int normalpressure=35;
        int tirepressure = 35;

    
        if(tirepressure<normalpressure){
          System.out.println("Tire pressure is below normal  ");
        }
        else if(tirepressure==normalpressure){
            System.out.println("Tire pressure is normal  ");
        }

        TirePressureResponse response = stub.checkTirePressure(request);
        
        System.out.println("The current pressure is "+ response.getCurrentpressure());
        
        
          try {
                      Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

    }
           
   //unary
        public void checkFuelLevel ( ){
        MilageServiceGrpc.MilageServiceBlockingStub stub = MilageServiceGrpc.newBlockingStub(channel);
        
        Empty request = Empty.newBuilder().build();
        double fuellevel = 4.5; 
        double normalfuellevel = 8.0;
        
   /// Fuelchecks
    
        if(fuellevel<normalfuellevel){
          System.out.println("Fuel is below normal");

        }
        else if(fuellevel==normalfuellevel){
            System.out.println("Fuel is normal");
        }

       FuelLevelResponse response = stub.checkFuelLevel(request);
        
        System.out.println("The current fuel is "+ response.getCurrentfuellevel());

        
        
        
    }
        
    
    
    
        
 
    public void switchService(String name) {
        // TODO
    }

    public static void main(String[] args) {
        new MilageClient();
    }

}