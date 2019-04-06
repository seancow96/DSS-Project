package client;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.example.milage.AverageMilesResponse;
import org.example.milage.CostResponse;
import org.example.milage.DaysRequest;
import org.example.milage.MaxMileRequest;
import org.example.milage.MaxMileResponse;
import org.example.milage.MilageServiceGrpc;
import org.example.milage.TotalResponse;
import org.example.milage.Welcome;
import org.example.milage.WelcomeRequest;
import org.example.milage.WelcomeResponse;





public class CarMilageClient implements ServiceObserver {

    protected ServiceDescription current;
    private final String serviceType;
    private final String name;
    private ManagedChannel channel;
    private MilageServiceGrpc.MilageServiceBlockingStub blockingStub;



    /**
     * Constructor.
     */
      public CarMilageClient() {
        serviceType = "_milage._udp.local.";
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
          channel = ManagedChannelBuilder.forAddress(service.getAddress(), service.getPort())
                .usePlaintext(true)
                .build();
        blockingStub = MilageServiceGrpc.newBlockingStub(channel);
        welcome();
        totalMiles();
        averageMiles();
      
      
        
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
            WelcomeResponse welcomeResponse = blockingStub.welcome(welcomeRequest);
        // call the RPC and get back a GreetResponse (protocol buffers)
        
        System.out.println(welcomeResponse.getGreeteduser());


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
        
        System.out.println("The total miles per day are " + req.getMonday() + " and " + req.getTuesday() + " and " + req.getWednesday() + " and " + req.getThursday());
        System.out.println(req.getMonday() + " + " + req.getMonday()  + " + " + req.getTuesday() + " + " + req.getWednesday() + " = " + response.getResult());

    }

     
         
     public void averageMiles(){
        MilageServiceGrpc.MilageServiceStub asyncClient = MilageServiceGrpc.newStub(channel);

        final CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<DaysRequest> requestObserver = asyncClient.averageMiles(new StreamObserver<AverageMilesResponse>() {
            @Override
            public void onNext(AverageMilesResponse value) {
                System.out.println("Checking the average miles");
                System.out.println("The average number of miles travelled over 7 days is" );
                System.out.println( value.getAverage());
               
                
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("That is alot of driving");
         
                
                 latch.countDown();
            }
        });
       
        requestObserver.onNext(DaysRequest.newBuilder()
        .setMonday(69)
        .build());
        
              
        requestObserver.onNext(DaysRequest.newBuilder()
        .setTuesday(12)
        .build());
        
              
        requestObserver.onNext(DaysRequest.newBuilder()
        .setWednesday(89)
        .build());
        
          requestObserver.onNext(DaysRequest.newBuilder()
        .setThursday(34)
        .build());
          
            requestObserver.onNext(DaysRequest.newBuilder()
        .setFriday(45)
        .build());
            
              requestObserver.onNext(DaysRequest.newBuilder()
        .setSaturday(37)
        .build());
              
         requestObserver.onNext(DaysRequest.newBuilder()
        .setSunday(56)
        .build());
              

        requestObserver.onCompleted();

          try {
                      Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
    }
     
     
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
    

                .build();

        CostResponse response = stub.calculateCost(req);
        
        System.out.println("The total miles per day are " + req.getMonday() + " and " + req.getTuesday() + " and " + req.getWednesday() + " and " + req.getThursday());
        System.out.println(req.getMonday() + " + " + req.getMonday()  + " + " + req.getTuesday() + " + " + req.getWednesday() + " = " + response.getCost());

    }
    
     
     
    
    public void switchService(String name) {
        // TODO
    }

    public static void main(String[] args) {
        new CarMilageClient();

    }

}
