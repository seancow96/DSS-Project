package main

import (
	"context"
	"fmt"
	"log"
	"net"
	"strconv"
	"time"
	"grpc-go-service/carheating/carheatingpb"
	"google.golang.org/grpc"
)
//points to the server
func (*server) Welcome(ctx context.Context, req *carheatingpb.WelcomeRequest) (*carheatingpb.WelcomeResponse, error) {
//implementing context
	fmt.Printf("Welcoming user %v\n", req)
	//extracting information for request
	Name := req.GetWelcome().GetName()
	result := "Hello " + Name
	res := &carheatingpb.WelcomeResponse{
		Result: result,
	}
	//returns the response
	return res, nil
}


func (*server) HeatSeat1(req *carheatingpb.HeatingRequest, stream carheatingpb.HeatService_HeatSeat1Server) error {
	fmt.Printf("Car seat heating function was invoked with %v\n", req)
	Seat := req.GetHeating().GetSeat()
	// i takes value zero i less than 25 increment the count
	for i := 0; i < 25; i++ {  //converts integer to a string
		result := "The passenger " + Seat + " is heating to " + strconv.Itoa(i) + "degrees"
		res := &carheatingpb.HeatingResponse{
			Result: result,
		}
		//sends response
		stream.Send(res)
		//sleeps one second everytime // show server streaming
		time.Sleep(1000 * time.Millisecond)
	}
	//return no error
	return nil
}

func (*server) HeatSeat2(req *carheatingpb.HeatingRequest, stream carheatingpb.HeatService_HeatSeat2Server) error {
	fmt.Printf("Car seat heating function was invoked with %v\n", req)
		// i takes value zero i less than 25 increment the count
	Seat2 := req.GetHeating().GetSeat2()
	for i := 0; i < 25; i++ {
		result := "The passenger " + Seat2 + " is heating to " + strconv.Itoa(i) + "degrees"
		res := &carheatingpb.HeatingResponse{
			Result: result,
		}
 	//sends response

		stream.Send(res)
				//sleeps one second everytime // show server streaming
		time.Sleep(1000 * time.Millisecond)
	}
		//return no error
	return nil
}


func (*server) HeatSeat3(req *carheatingpb.HeatingRequest, stream carheatingpb.HeatService_HeatSeat3Server) error {
	fmt.Printf("Car seat heating function was invoked with %v\n", req)
	Seat3:= req.GetHeating().GetSeat3()
		// i takes value zero i less than 25 increment the count
	for i := 0; i < 25; i++ {
		result := "The passenger " + Seat3 + " is heating to " + strconv.Itoa(i) + "degrees"
		res := &carheatingpb.HeatingResponse{
			Result: result,
		}
		 	//sends response
		stream.Send(res)
		time.Sleep(1000 * time.Millisecond)
	}
	return nil
}


func (*server) HeatSeat4(req *carheatingpb.HeatingRequest, stream carheatingpb.HeatService_HeatSeat4Server) error {
	fmt.Printf("Car seat heating function was invoked with %v\n", req)
	Seat4 := req.GetHeating().GetSeat4()
	for i := 0; i < 25; i++ {
		result := "The passenger " + Seat4 + " is heating to " + strconv.Itoa(i) + "degrees"
		res := &carheatingpb.HeatingResponse{
			Result: result,
		}
		stream.Send(res)
	//sleeps one second everytime // show server streaming
		time.Sleep(1000 * time.Millisecond)
	}
	return nil
}


//points to the server
func (*server) Complete(ctx context.Context, req *carheatingpb.CompleteRequest) (*carheatingpb.CompleteResponse, error) {
	//implementing context
		fmt.Printf("Heating seating completing %v\n", req)
		//extracting information for request
		Finish := req.GetComplete().GetFinal()
		finish := "Service" + Finish
		res := &carheatingpb.CompleteResponse{
			Finish: finish,
		}
		//returns the response
		return res, nil
	}



type server struct{}

func main() {
fmt.Println("Welcome to the heating service")
lis, err := net.Listen("tcp", "0.0.0.0:50051")
if err !=nil {
	log.Fatalf("failed to listen: %v",err)
}
s := grpc.NewServer()
carheatingpb.RegisterHeatServiceServer(s, &server{})

if err := s.Serve(lis); err != nil {
	log.Fatalf("failed to serve: %v",err)
}
}