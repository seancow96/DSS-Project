/*
Author:Sean Cowley--x14484252
*/
package client;


import clientui.AutoParkGUI;
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
import org.example.parking.DecreaseResponse;
import org.example.parking.Detail;
import org.example.parking.DetailResponse;
import org.example.parking.DriveResponse;
import org.example.parking.Engine;
import org.example.parking.EngineRequest;
import org.example.parking.EngineResponse;
import org.example.parking.IncreaseResponse;
import org.example.parking.Park;
import org.example.parking.ParkRequest;
import org.example.parking.ParkingServiceGrpc;
import org.example.parking.SensorRequest;
import org.example.parking.Sensors;







public class ParkingClient implements ServiceObserver {

    protected AutoParkGUI ui;
    protected ServiceDescription current;
    private final String serviceType;
    private final String name;
    private static final Logger logger = Logger.getLogger(ParkingClient.class.getName());
    private ManagedChannel channel;
    private ParkingServiceGrpc.ParkingServiceBlockingStub blockingStub2;



    /**
     * Constructor.
     */
    public ParkingClient() {
        serviceType = "_parking._udp.local.";
        name = "Park";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ui = new AutoParkGUI(ParkingClient.this);
                ui.setVisible(true);
             
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
        //jmdns
        System.out.println("Parking Service added");
        channel = ManagedChannelBuilder.forAddress(service.getAddress(), service.getPort())
        .usePlaintext(true)
        .build();
        blockingStub2 = ParkingServiceGrpc.newBlockingStub(channel);
  
      
      
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

  
    
    public void turnengineon() {

          // Unary
        // created a protocol buffer greeting message
       Engine engine = Engine.newBuilder()
                .setTurnengineon("On")
                .build();

        // do the same for a GreetRequest
        EngineRequest engineRequest = EngineRequest.newBuilder()
                .setEngine(engine)
                .build();

        // call the RPC and get back a GreetResponse (protocol buffers)
            EngineResponse engineResponse = blockingStub2.engineOn(engineRequest);
        // call the RPC and get back a GreetResponse (protocol buffers)
        
        System.out.println(engineResponse.getEnginestatus());
        ui.append(engineResponse.getEnginestatus());
        
        
    

    }
        
    
    
               
         public void drive ( ){
        ParkingServiceGrpc.ParkingServiceBlockingStub stub = ParkingServiceGrpc.newBlockingStub(channel);

        
            Empty request = Empty.newBuilder().build();

    

        DriveResponse response = stub.drive(request);
        ui.append("The car is driving");
        System.out.println("The car is driving");


        System.out.println("The current speed is "+ response.getCurrentspeed()+ " miles per hour ");
        ui.append("The current speed is "+response.getCurrentspeed() + " miles per hour ");

    }

    
    
                  
         public void increasespeed ( ){
        ParkingServiceGrpc.ParkingServiceBlockingStub stub = ParkingServiceGrpc.newBlockingStub(channel);

        
            Empty request = Empty.newBuilder().build();

    

        IncreaseResponse response = stub.increaseSpeed(request);
        ui.append("Increasing Speed");
        System.out.println("Increasing Speed");

        System.out.println("The current speed is "+ response.getCurrentspeed()+ " miles per hour ");
        ui.append("The current volume is "+response.getCurrentspeed() + " miles per hour ");

    }
           
           
           
        public void decreasespeed ( ){
        ParkingServiceGrpc.ParkingServiceBlockingStub stub = ParkingServiceGrpc.newBlockingStub(channel);


        
            Empty request = Empty.newBuilder().build();

    

        DecreaseResponse response = stub.decreaseSpeed(request);
        
        System.out.println("Decreasing Speed");
        ui.append("Decreasing speed");
        System.out.println("The current speed is "+ response.getCurrentspeed() + " miles per hour ");
        ui.append("The current speed is "+response.getCurrentspeed() + " miles ");


        
    }
         
    
    
    
    


           
    
    public void turnengineoff() {

          // Unary
        // created a protocol buffer greeting message
       Engine engine = Engine.newBuilder()
                .setTurnengineoff("Off")
                .build();

        // do the same for a GreetRequest
        EngineRequest engineRequest = EngineRequest.newBuilder()
                .setEngine(engine)
                .build();

        // call the RPC and get back a GreetResponse (protocol buffers)
            EngineResponse engineResponse = blockingStub2.engineOff(engineRequest);
        // call the RPC and get back a GreetResponse (protocol buffers)
        
        System.out.println(engineResponse.getEnginestatus());
        ui.append(engineResponse.getEnginestatus());
        
        
    

    }
    
    
     
        
        
    
      
    public void stop() {

          // Unary
        // created a protocol buffer greeting message
       Engine engine = Engine.newBuilder()
                .setStop("Stopped")
                .build();

        // do the same for a GreetRequest
        EngineRequest engineRequest = EngineRequest.newBuilder()
                .setEngine(engine)
                .build();

        // call the RPC and get back a GreetResponse (protocol buffers)
            EngineResponse engineResponse = blockingStub2.stop(engineRequest);
        // call the RPC and get back a GreetResponse (protocol buffers)
        
        System.out.println(engineResponse.getEnginestatus());
        ui.append(engineResponse.getEnginestatus());
        
        
    

    }
   
    
    public void sensor() {
       ParkingServiceGrpc.ParkingServiceBlockingStub parkingClient = ParkingServiceGrpc.newBlockingStub(channel);

        // Server Streaming
        // we prepare the request
        SensorRequest sensorRequest =
                SensorRequest.newBuilder()
                        .setSensors(Sensors.newBuilder().setPark("park car"))
                        .build();

        // we stream the responses (in a blocking manner)
        parkingClient.sensor(sensorRequest)

       // blockingStub2.sensor(sensorRequest)
                .forEachRemaining(sensorResponse -> {
                    System.out.println(sensorResponse.getResult());
                      ui.append(sensorResponse.getResult());


                    
                });
                System.out.println("Found parking spot");
                ui.append("Found parking  spot ");

    }
    
       public void autopark() {

        // Server Streaming
        // we prepare the request
        ParkRequest parkRequest =
               ParkRequest.newBuilder()
                        .setPark(Park.newBuilder().setParked("park car"))
                        .build();


        // we stream the responses (in a blocking manner)
        blockingStub2.autoPark(parkRequest)
                .forEachRemaining(parkResponse -> {
                    ui.append(parkResponse.getResult());
                    System.out.println(parkResponse.getResult());
                    
                    
                    
                });
                System.out.println("Car has been parked");
                ui.append("Car has been parked ");

    }
      
       

       
        public void showdetails() {
      
            Empty request = Empty.newBuilder().build();
             System.out.println("Car Details");
            ui.append("Car Details");

            DetailResponse detailslist = blockingStub2.showdetails(request);
            List<Detail> detailslistDetails = detailslist.getDetailsList();
            for (Detail con : detailslistDetails) {
               ui.append(con.toString());
                System.out.println(con);

            }
    }
     

   
         
 
    public void switchService(String name) {
        // TODO
    }

    public static void main(String[] args) {
        new ParkingClient();
    }

}