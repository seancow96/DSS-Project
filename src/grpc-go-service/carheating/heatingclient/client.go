package main

import (
	"context"
	"fmt"
	"log"
	"grpc-go-service/carheating/carheatingpb"
	"google.golang.org/grpc"
	"io"

)


//client is created on port 50051
func main(){

	fmt.Println("Hello I'm a client")
	cc, err := grpc.Dial("localhost:50051", grpc.WithInsecure())
	if err != nil {
		log.Fatalf("could not connect: %v",err)
	}
	defer cc.Close()

   c := carheatingpb.NewHeatServiceClient(cc)
//isolates the functions//channels
   welcome(c)
   heatseat1(c)
   heatseat2(c)
   heatseat3(c)
   heatseat4(c)
   complete(c)



}

   func welcome(c carheatingpb.HeatServiceClient) {
	fmt.Println("Welcome user")
	// creates the request
	req := &carheatingpb.WelcomeRequest{
		Welcome: &carheatingpb.Welcome{
			Name: "Sean",
		},
	}
	res, err := c.Welcome(context.Background(), req)
	if err != nil {
		//logging error
		log.Fatalf("error while calling RPC: %v", err)
	}          //pass in the response the prints welcome
	           //getting from the struct
	log.Printf("Response from Welcome request: %v", res.Result)
}


func heatseat1(c carheatingpb.HeatServiceClient) {
	//tells the user what we are about to do
	fmt.Println("Heating seat 1")

	//create request
	req := &carheatingpb.HeatingRequest{
		Heating: &carheatingpb.Heating{
			Seat: "Seat 1",
		},
	}
    //result stream
	resStream, err := c.HeatSeat1(context.Background(), req)
	if err != nil {  //logging error
		log.Fatalf("error while calling heating seat 1 RPC: %v", err)
	}
	for {
		msg, err := resStream.Recv()
		if err == io.EOF {
			// we've reached the end of the stream
			break//break loop
		}
		//logging error
		if err != nil {
			log.Fatalf("error while reading stream: %v", err)
		}
		//get result from heat seats 1
		log.Printf("Response from Heating: %v", msg.GetResult())
	}

}

func heatseat2(c carheatingpb.HeatServiceClient) {
	fmt.Println("Heating Seat 2")

	req := &carheatingpb.HeatingRequest{
		Heating: &carheatingpb.Heating{
			Seat2: "Seat 2",
		},
	}

	resStream, err := c.HeatSeat2(context.Background(), req)
	if err != nil {
		log.Fatalf("error while calling heat seat 2 RPC: %v", err)
	}
	for {
		msg, err := resStream.Recv()
		if err == io.EOF {
			// we've reached the end of the stream
			break
		}
		if err != nil {
			log.Fatalf("error while reading stream: %v", err)
		}
		log.Printf("Response from Heating: %v", msg.GetResult())
	}

}

func heatseat3(c carheatingpb.HeatServiceClient) {
	fmt.Println("Heating Seat 3")

	req := &carheatingpb.HeatingRequest{
		Heating: &carheatingpb.Heating{
			Seat3: "Seat 3",
		},
	}

	resStream, err := c.HeatSeat3(context.Background(), req)
	if err != nil {
		log.Fatalf("error while calling heat seat 3: %v", err)
	}
	for {
		msg, err := resStream.Recv()
		if err == io.EOF {
			// we've reached the end of the stream
			break
		}
		if err != nil {
			log.Fatalf("error while reading stream: %v", err)
		}
		log.Printf("Response from Heating: %v", msg.GetResult())
	}

}

func heatseat4(c carheatingpb.HeatServiceClient) {
	fmt.Println("Heating seat 4")

	req := &carheatingpb.HeatingRequest{
		Heating: &carheatingpb.Heating{
			Seat4: "Seat 4",
		},
	}

	resStream, err := c.HeatSeat4(context.Background(), req)
	if err != nil {
		log.Fatalf("error while calling heat seat 4 RPC: %v", err)
	}
	for {
		msg, err := resStream.Recv()
		if err == io.EOF {
			// we've reached the end of the stream
			break
		}
		if err != nil {
			log.Fatalf("error while reading stream: %v", err)
		}
		log.Printf("Response from Heating: %v", msg.GetResult())
	}

}


func complete(c carheatingpb.HeatServiceClient) {
	fmt.Println("The heating service has completed")
	// creates the request
	req := &carheatingpb.CompleteRequest{
		Complete: &carheatingpb.Complete{
			Final: "Complete",
		},
	}
	res, err := c.Complete(context.Background(), req)
	if err != nil {
		//logging error
		log.Fatalf("error while calling RPC: %v", err)
	}          //pass in the response the prints welcome
	           //getting from the struct
	log.Printf("Response from Welcome request: %v", res.Finish)
}
