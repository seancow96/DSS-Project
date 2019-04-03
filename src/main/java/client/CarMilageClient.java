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
import org.example.milage.DaysRequest;
import org.example.milage.MaxMileRequest;
import org.example.milage.MaxMileResponse;
import org.example.milage.MilageServiceGrpc;
import org.example.milage.TotalResponse;





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
        name = "Car";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
         java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {

             }
         });
        
    }
      
       private void run() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50056)
                .usePlaintext()
                .build();

         totalMiles(channel);
         averageMiles(channel);
         findMaximumViews(channel);
      

        System.out.println("Milage Service has completed");
        channel.shutdown();

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
 
    
      public void totalMiles (ManagedChannel channel ){
        // created a greet service client uranary
//passing the channel
        MilageServiceGrpc.MilageServiceBlockingStub stub = MilageServiceGrpc.newBlockingStub(channel);

  //takes in a sum request

            DaysRequest req = DaysRequest.newBuilder()
                .setMonday(69)
                .setTuesday(12)
                .setWednesday(89)
                .setThursday(34)

                .build();

        TotalResponse response = stub.totalMiles(req);
        
        System.out.println("The numbers are " + req.getMonday() + " and " + req.getTuesday() + " and " + req.getWednesday() + " and " + req.getThursday());
        System.out.println(req.getMonday() + " + " + req.getMonday()  + " + " + req.getTuesday() + " + " + req.getWednesday() + " = " + response.getResult());

    }

     
         
     public void averageMiles(ManagedChannel channel){
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
                System.out.println("Will now begin to process other calculations.Please stand by");
         
                
                 latch.countDown();
            }
        });
       
        requestObserver.onNext(DaysRequest.newBuilder()
        .setMonday(24)
        .build());
        
              
        requestObserver.onNext(DaysRequest.newBuilder()
        .setTuesday(45)
        .build());
        
              
        requestObserver.onNext(DaysRequest.newBuilder()
        .setWednesday(10)
        .build());
        
          requestObserver.onNext(DaysRequest.newBuilder()
        .setThursday(56)
        .build());
          
            requestObserver.onNext(DaysRequest.newBuilder()
        .setFriday(23)
        .build());
            
              requestObserver.onNext(DaysRequest.newBuilder()
        .setSaturday(19)
        .build());
              
         requestObserver.onNext(DaysRequest.newBuilder()
        .setSunday(34)
        .build());
              


        requestObserver.onCompleted();

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
     
     
         //does a bidirectional call  
     public void findMaximumViews(ManagedChannel channel){
        MilageServiceGrpc.MilageServiceStub asyncClient = MilageServiceGrpc.newStub(channel);

        final CountDownLatch latch = new CountDownLatch(1);



        StreamObserver<MaxMileRequest> requestObserver = asyncClient.findMaxMilesTravelled(new StreamObserver<MaxMileResponse>() {
            @Override    //anytime we receieve a response from the client we say
            public void onNext(MaxMileResponse value) {
                //gets new maximum from server
                System.out.println("Got new Maximum Viewed Song from Server: " + value.getMaxmiles());
            }

            @Override
            public void onError(Throwable t) {
                latch.countDown();
            }

            @Override
            //server completes sending messages
            public void onCompleted() {
                System.out.println("Views sending is completed");
            }
        });

//sending data to the request observer

        Arrays.asList(3, 5, 17).forEach(
                number -> {
                    System.out.println("Sending views : " + number);
                    requestObserver.onNext(MaxMileRequest.newBuilder()
                            .setNumber(number)
                            .build());
                    try {
                        Thread.sleep(600);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );

        requestObserver.onCompleted();

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
     
     
     
    
    
    public void switchService(String name) {
        // TODO
    }

    public static void main(String[] args) {
        CarMilageClient main = new CarMilageClient();
        main.run();

    }

}
