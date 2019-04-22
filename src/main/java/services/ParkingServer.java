
/*

Author:Sean Cowley--x14484252
*/

package services;

import com.google.protobuf.Empty;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.example.parking.DecreaseResponse;
import org.example.parking.Detail;
import org.example.parking.DetailResponse;
import org.example.parking.DriveResponse;
import org.example.parking.Engine;
import org.example.parking.EngineRequest;
import org.example.parking.EngineResponse;
import org.example.parking.IncreaseResponse;
import org.example.parking.ParkRequest;
import org.example.parking.ParkResponse;
import org.example.parking.ParkingServiceGrpc;
import org.example.parking.SensorRequest;
import org.example.parking.SensorResponse;
import serviceui.Printer;
import serviceui.ServiceUI;

/**
 * Server that manages startup/shutdown of a {@code Greeter} server.
 */
public class ParkingServer {

    private static final Logger logger = Logger.getLogger(ParkingServer.class.getName());

    /* The port on which the server should run */
    private int port = 50057;
    private Server server;

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new ParkingServiceImpl())
                .build()
                .start();
       JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Park", "_parking._udp.local.", "", port);





        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                ParkingServer.this.stop();
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
        final ParkingServer server = new ParkingServer();
        server.start();
        server.blockUntilShutdown();
    }
   
    
    
    
    
        private class ParkingServiceImpl extends ParkingServiceGrpc.ParkingServiceImplBase {
            
           private List<Detail> details;


        private Printer ui;
           int Speed =0;
            int MaxSpeed =15;
            int MinSpeed = 5;

        
          public ParkingServiceImpl() {
          String name = "Park";
            String serviceType = "_parking._udp.local.";
            ui = new ServiceUI(name + serviceType);
            
       
                   
            ///arraylist of contacts
            details = new ArrayList<Detail>();
            Detail car = Detail.newBuilder()
                    .setType("Smart Fortwo")
                    .setWheelbase("73.5 inches")
                    .setLength("61.4 inches")
                    .setHeight("60.7 inches")
                    .build();
                   details.add(car);
            


 }

    
     @Override
    public void increaseSpeed(Empty Request, StreamObserver<IncreaseResponse> responseObserver) {
        //increase the speed
       
        if(Speed < MaxSpeed){
            Speed +=5;
        }else if(Speed == MaxSpeed){
          ui.append("You have reached the restricted speed for parking"+MaxSpeed);


        }
           
        IncreaseResponse increaseResponse = IncreaseResponse.newBuilder()
                .setCurrentspeed(Speed)
                .build();
                 ui.append("Increasing Speed");
                 ui.append(increaseResponse.toString());
                 
        
        //sends the response

        responseObserver.onNext(increaseResponse);
        // rpc call is completed
        responseObserver.onCompleted();

    }   
        
   
          
      @Override
    public void decreaseSpeed(Empty Request, StreamObserver<DecreaseResponse> responseObserver) {
        //increase the speed
       
        if(Speed > MinSpeed){
            Speed -=5;
        }else if(Speed == MinSpeed){
          ui.append("You have reached the minimum speed for parking"+MinSpeed);


        }
       
       
        DecreaseResponse decreaseResponse = DecreaseResponse.newBuilder()
                .setCurrentspeed(Speed)
                .build();
                 ui.append("Increasing Speed");
                 ui.append(decreaseResponse.toString());
                 
        
        //sends the response

        responseObserver.onNext(decreaseResponse);
        // rpc call is completed
        responseObserver.onCompleted();

    }   
      
    
    
    
    
         @Override
    public void engineOn(EngineRequest request, StreamObserver<EngineResponse> responseObserver) {
        // extract the fields we need
      Engine engine= request.getEngine(); 
        String TurnEngineOn = engine.getTurnengineon();
        
        
      
       
        // create the response
         String enginestatus = "The car engine has been turned " + TurnEngineOn;
        EngineResponse response = EngineResponse.newBuilder()
                .setEnginestatus(enginestatus)
                .build();
                 ui.append(response.toString());


        // send the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }
    
    
     @Override
    public void drive(Empty Request, StreamObserver<DriveResponse> responseObserver) {
        //increase the speed
       
        if(Speed > MinSpeed){
            Speed = Speed;
        }
        else {
       
        }
       
       
        DriveResponse driveResponse = DriveResponse.newBuilder()
                .setCurrentspeed(Speed)
                .build();
                 ui.append("The car is driving");
                 ui.append(driveResponse.toString());
                 
        
        //sends the response

        responseObserver.onNext(driveResponse);
        // rpc call is completed
        responseObserver.onCompleted();

    }   
        
    
    
    
    

          @Override
    public void engineOff(EngineRequest request, StreamObserver<EngineResponse> responseObserver) {
        // extract the fields we need
        Engine engine = request.getEngine(); 
        String TurnEngineOff = engine.getTurnengineoff();



         // create the response
        String enginestatus = "The car engine has been turned " + TurnEngineOff;
        EngineResponse response = EngineResponse.newBuilder()
                .setEnginestatus(enginestatus)
                .build();
                 ui.append(response.toString());

        // send the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }

    
           @Override
    public void stop(EngineRequest request, StreamObserver<EngineResponse> responseObserver) {
        // extract the fields we need
        Engine engine = request.getEngine(); 
        String Stop = engine.getStop();
        


        // create the response
        String enginestatus = "The car has been " + Stop;
        EngineResponse response = EngineResponse.newBuilder()
                .setEnginestatus(enginestatus)
                .build();
                 ui.append(response.toString());

        // send the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }
    
    @Override
    public void sensor(SensorRequest request, StreamObserver<SensorResponse> responseObserver) {
        String Park = request.getSensors().getPark();
       
        try {
            for (int i = 0; i < 5; i++) {
                String result = "Detecting places to " + Park;
                         SensorResponse response = SensorResponse.newBuilder()
                        .setResult(result)
                        .build();
                         ui.append(response.toString());


                responseObserver.onNext(response);
                Thread.sleep(1000L);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            responseObserver.onCompleted();
           ui.append("Found parking  spot ");

            
        }
    }
    
        @Override
    public void autoPark(ParkRequest request, StreamObserver<ParkResponse> responseObserver) {
        String Parked = request.getPark().getParked();
       
        try {
            for (int i = 0; i < 5; i++) {
                String result = "Beginning to " + Parked;
                         ParkResponse response = ParkResponse.newBuilder()
                        .setResult(result)
                        .build();
                         ui.append(response.toString());



                responseObserver.onNext(response);
                Thread.sleep(1000L);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            responseObserver.onCompleted();
            ui.append("Car has been parked ");

        }
    }
    
    
          @Override
        public void showdetails(Empty request,
                StreamObserver<DetailResponse> responseObserver) {
            DetailResponse all = DetailResponse.newBuilder().addAllDetails(details).build();
            responseObserver.onNext(all);
            ui.append(all.toString());
            responseObserver.onCompleted();
            
        }
        

    
    
   
     
  
        }
    
   
    
}