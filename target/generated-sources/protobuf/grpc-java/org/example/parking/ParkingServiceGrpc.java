package org.example.parking;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The parking service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: parking.proto")
public final class ParkingServiceGrpc {

  private ParkingServiceGrpc() {}

  public static final String SERVICE_NAME = "parking.ParkingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.parking.EngineRequest,
      org.example.parking.EngineResponse> getEngineOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EngineOn",
      requestType = org.example.parking.EngineRequest.class,
      responseType = org.example.parking.EngineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.parking.EngineRequest,
      org.example.parking.EngineResponse> getEngineOnMethod() {
    io.grpc.MethodDescriptor<org.example.parking.EngineRequest, org.example.parking.EngineResponse> getEngineOnMethod;
    if ((getEngineOnMethod = ParkingServiceGrpc.getEngineOnMethod) == null) {
      synchronized (ParkingServiceGrpc.class) {
        if ((getEngineOnMethod = ParkingServiceGrpc.getEngineOnMethod) == null) {
          ParkingServiceGrpc.getEngineOnMethod = getEngineOnMethod = 
              io.grpc.MethodDescriptor.<org.example.parking.EngineRequest, org.example.parking.EngineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "parking.ParkingService", "EngineOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.parking.EngineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.parking.EngineResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingServiceMethodDescriptorSupplier("EngineOn"))
                  .build();
          }
        }
     }
     return getEngineOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.parking.EngineRequest,
      org.example.parking.EngineResponse> getEngineOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EngineOff",
      requestType = org.example.parking.EngineRequest.class,
      responseType = org.example.parking.EngineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.parking.EngineRequest,
      org.example.parking.EngineResponse> getEngineOffMethod() {
    io.grpc.MethodDescriptor<org.example.parking.EngineRequest, org.example.parking.EngineResponse> getEngineOffMethod;
    if ((getEngineOffMethod = ParkingServiceGrpc.getEngineOffMethod) == null) {
      synchronized (ParkingServiceGrpc.class) {
        if ((getEngineOffMethod = ParkingServiceGrpc.getEngineOffMethod) == null) {
          ParkingServiceGrpc.getEngineOffMethod = getEngineOffMethod = 
              io.grpc.MethodDescriptor.<org.example.parking.EngineRequest, org.example.parking.EngineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "parking.ParkingService", "EngineOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.parking.EngineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.parking.EngineResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingServiceMethodDescriptorSupplier("EngineOff"))
                  .build();
          }
        }
     }
     return getEngineOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.parking.EngineRequest,
      org.example.parking.EngineResponse> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = org.example.parking.EngineRequest.class,
      responseType = org.example.parking.EngineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.parking.EngineRequest,
      org.example.parking.EngineResponse> getStopMethod() {
    io.grpc.MethodDescriptor<org.example.parking.EngineRequest, org.example.parking.EngineResponse> getStopMethod;
    if ((getStopMethod = ParkingServiceGrpc.getStopMethod) == null) {
      synchronized (ParkingServiceGrpc.class) {
        if ((getStopMethod = ParkingServiceGrpc.getStopMethod) == null) {
          ParkingServiceGrpc.getStopMethod = getStopMethod = 
              io.grpc.MethodDescriptor.<org.example.parking.EngineRequest, org.example.parking.EngineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "parking.ParkingService", "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.parking.EngineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.parking.EngineResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingServiceMethodDescriptorSupplier("Stop"))
                  .build();
          }
        }
     }
     return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.parking.SensorRequest,
      org.example.parking.SensorResponse> getSensorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sensor",
      requestType = org.example.parking.SensorRequest.class,
      responseType = org.example.parking.SensorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.parking.SensorRequest,
      org.example.parking.SensorResponse> getSensorMethod() {
    io.grpc.MethodDescriptor<org.example.parking.SensorRequest, org.example.parking.SensorResponse> getSensorMethod;
    if ((getSensorMethod = ParkingServiceGrpc.getSensorMethod) == null) {
      synchronized (ParkingServiceGrpc.class) {
        if ((getSensorMethod = ParkingServiceGrpc.getSensorMethod) == null) {
          ParkingServiceGrpc.getSensorMethod = getSensorMethod = 
              io.grpc.MethodDescriptor.<org.example.parking.SensorRequest, org.example.parking.SensorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "parking.ParkingService", "Sensor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.parking.SensorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.parking.SensorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingServiceMethodDescriptorSupplier("Sensor"))
                  .build();
          }
        }
     }
     return getSensorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.parking.DriveResponse> getDriveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Drive",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.parking.DriveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.parking.DriveResponse> getDriveMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.parking.DriveResponse> getDriveMethod;
    if ((getDriveMethod = ParkingServiceGrpc.getDriveMethod) == null) {
      synchronized (ParkingServiceGrpc.class) {
        if ((getDriveMethod = ParkingServiceGrpc.getDriveMethod) == null) {
          ParkingServiceGrpc.getDriveMethod = getDriveMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.parking.DriveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "parking.ParkingService", "Drive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.parking.DriveResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingServiceMethodDescriptorSupplier("Drive"))
                  .build();
          }
        }
     }
     return getDriveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.parking.ParkRequest,
      org.example.parking.ParkResponse> getAutoParkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AutoPark",
      requestType = org.example.parking.ParkRequest.class,
      responseType = org.example.parking.ParkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.parking.ParkRequest,
      org.example.parking.ParkResponse> getAutoParkMethod() {
    io.grpc.MethodDescriptor<org.example.parking.ParkRequest, org.example.parking.ParkResponse> getAutoParkMethod;
    if ((getAutoParkMethod = ParkingServiceGrpc.getAutoParkMethod) == null) {
      synchronized (ParkingServiceGrpc.class) {
        if ((getAutoParkMethod = ParkingServiceGrpc.getAutoParkMethod) == null) {
          ParkingServiceGrpc.getAutoParkMethod = getAutoParkMethod = 
              io.grpc.MethodDescriptor.<org.example.parking.ParkRequest, org.example.parking.ParkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "parking.ParkingService", "AutoPark"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.parking.ParkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.parking.ParkResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingServiceMethodDescriptorSupplier("AutoPark"))
                  .build();
          }
        }
     }
     return getAutoParkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.parking.IncreaseResponse> getIncreaseSpeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IncreaseSpeed",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.parking.IncreaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.parking.IncreaseResponse> getIncreaseSpeedMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.parking.IncreaseResponse> getIncreaseSpeedMethod;
    if ((getIncreaseSpeedMethod = ParkingServiceGrpc.getIncreaseSpeedMethod) == null) {
      synchronized (ParkingServiceGrpc.class) {
        if ((getIncreaseSpeedMethod = ParkingServiceGrpc.getIncreaseSpeedMethod) == null) {
          ParkingServiceGrpc.getIncreaseSpeedMethod = getIncreaseSpeedMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.parking.IncreaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "parking.ParkingService", "IncreaseSpeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.parking.IncreaseResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingServiceMethodDescriptorSupplier("IncreaseSpeed"))
                  .build();
          }
        }
     }
     return getIncreaseSpeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.parking.DecreaseResponse> getDecreaseSpeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DecreaseSpeed",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.parking.DecreaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.parking.DecreaseResponse> getDecreaseSpeedMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.parking.DecreaseResponse> getDecreaseSpeedMethod;
    if ((getDecreaseSpeedMethod = ParkingServiceGrpc.getDecreaseSpeedMethod) == null) {
      synchronized (ParkingServiceGrpc.class) {
        if ((getDecreaseSpeedMethod = ParkingServiceGrpc.getDecreaseSpeedMethod) == null) {
          ParkingServiceGrpc.getDecreaseSpeedMethod = getDecreaseSpeedMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.parking.DecreaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "parking.ParkingService", "DecreaseSpeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.parking.DecreaseResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingServiceMethodDescriptorSupplier("DecreaseSpeed"))
                  .build();
          }
        }
     }
     return getDecreaseSpeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.parking.DetailResponse> getShowdetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showdetails",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.parking.DetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.parking.DetailResponse> getShowdetailsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.parking.DetailResponse> getShowdetailsMethod;
    if ((getShowdetailsMethod = ParkingServiceGrpc.getShowdetailsMethod) == null) {
      synchronized (ParkingServiceGrpc.class) {
        if ((getShowdetailsMethod = ParkingServiceGrpc.getShowdetailsMethod) == null) {
          ParkingServiceGrpc.getShowdetailsMethod = getShowdetailsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.parking.DetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "parking.ParkingService", "showdetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.parking.DetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingServiceMethodDescriptorSupplier("showdetails"))
                  .build();
          }
        }
     }
     return getShowdetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ParkingServiceStub newStub(io.grpc.Channel channel) {
    return new ParkingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ParkingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ParkingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ParkingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ParkingServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The parking service definition.
   * </pre>
   */
  public static abstract class ParkingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void engineOn(org.example.parking.EngineRequest request,
        io.grpc.stub.StreamObserver<org.example.parking.EngineResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEngineOnMethod(), responseObserver);
    }

    /**
     */
    public void engineOff(org.example.parking.EngineRequest request,
        io.grpc.stub.StreamObserver<org.example.parking.EngineResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEngineOffMethod(), responseObserver);
    }

    /**
     */
    public void stop(org.example.parking.EngineRequest request,
        io.grpc.stub.StreamObserver<org.example.parking.EngineResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     *server stream
     * </pre>
     */
    public void sensor(org.example.parking.SensorRequest request,
        io.grpc.stub.StreamObserver<org.example.parking.SensorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSensorMethod(), responseObserver);
    }

    /**
     */
    public void drive(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.parking.DriveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDriveMethod(), responseObserver);
    }

    /**
     * <pre>
     *server stream
     * </pre>
     */
    public void autoPark(org.example.parking.ParkRequest request,
        io.grpc.stub.StreamObserver<org.example.parking.ParkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAutoParkMethod(), responseObserver);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void increaseSpeed(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.parking.IncreaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIncreaseSpeedMethod(), responseObserver);
    }

    /**
     */
    public void decreaseSpeed(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.parking.DecreaseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDecreaseSpeedMethod(), responseObserver);
    }

    /**
     */
    public void showdetails(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.parking.DetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowdetailsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEngineOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.parking.EngineRequest,
                org.example.parking.EngineResponse>(
                  this, METHODID_ENGINE_ON)))
          .addMethod(
            getEngineOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.parking.EngineRequest,
                org.example.parking.EngineResponse>(
                  this, METHODID_ENGINE_OFF)))
          .addMethod(
            getStopMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.parking.EngineRequest,
                org.example.parking.EngineResponse>(
                  this, METHODID_STOP)))
          .addMethod(
            getSensorMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.example.parking.SensorRequest,
                org.example.parking.SensorResponse>(
                  this, METHODID_SENSOR)))
          .addMethod(
            getDriveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.parking.DriveResponse>(
                  this, METHODID_DRIVE)))
          .addMethod(
            getAutoParkMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.example.parking.ParkRequest,
                org.example.parking.ParkResponse>(
                  this, METHODID_AUTO_PARK)))
          .addMethod(
            getIncreaseSpeedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.parking.IncreaseResponse>(
                  this, METHODID_INCREASE_SPEED)))
          .addMethod(
            getDecreaseSpeedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.parking.DecreaseResponse>(
                  this, METHODID_DECREASE_SPEED)))
          .addMethod(
            getShowdetailsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.parking.DetailResponse>(
                  this, METHODID_SHOWDETAILS)))
          .build();
    }
  }

  /**
   * <pre>
   * The parking service definition.
   * </pre>
   */
  public static final class ParkingServiceStub extends io.grpc.stub.AbstractStub<ParkingServiceStub> {
    private ParkingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void engineOn(org.example.parking.EngineRequest request,
        io.grpc.stub.StreamObserver<org.example.parking.EngineResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEngineOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void engineOff(org.example.parking.EngineRequest request,
        io.grpc.stub.StreamObserver<org.example.parking.EngineResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEngineOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stop(org.example.parking.EngineRequest request,
        io.grpc.stub.StreamObserver<org.example.parking.EngineResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server stream
     * </pre>
     */
    public void sensor(org.example.parking.SensorRequest request,
        io.grpc.stub.StreamObserver<org.example.parking.SensorResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSensorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void drive(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.parking.DriveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDriveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server stream
     * </pre>
     */
    public void autoPark(org.example.parking.ParkRequest request,
        io.grpc.stub.StreamObserver<org.example.parking.ParkResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAutoParkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void increaseSpeed(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.parking.IncreaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIncreaseSpeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void decreaseSpeed(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.parking.DecreaseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDecreaseSpeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void showdetails(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.parking.DetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowdetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The parking service definition.
   * </pre>
   */
  public static final class ParkingServiceBlockingStub extends io.grpc.stub.AbstractStub<ParkingServiceBlockingStub> {
    private ParkingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public org.example.parking.EngineResponse engineOn(org.example.parking.EngineRequest request) {
      return blockingUnaryCall(
          getChannel(), getEngineOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.parking.EngineResponse engineOff(org.example.parking.EngineRequest request) {
      return blockingUnaryCall(
          getChannel(), getEngineOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.parking.EngineResponse stop(org.example.parking.EngineRequest request) {
      return blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server stream
     * </pre>
     */
    public java.util.Iterator<org.example.parking.SensorResponse> sensor(
        org.example.parking.SensorRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSensorMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.parking.DriveResponse drive(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getDriveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server stream
     * </pre>
     */
    public java.util.Iterator<org.example.parking.ParkResponse> autoPark(
        org.example.parking.ParkRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getAutoParkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public org.example.parking.IncreaseResponse increaseSpeed(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getIncreaseSpeedMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.parking.DecreaseResponse decreaseSpeed(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getDecreaseSpeedMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.parking.DetailResponse showdetails(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getShowdetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The parking service definition.
   * </pre>
   */
  public static final class ParkingServiceFutureStub extends io.grpc.stub.AbstractStub<ParkingServiceFutureStub> {
    private ParkingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.parking.EngineResponse> engineOn(
        org.example.parking.EngineRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEngineOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.parking.EngineResponse> engineOff(
        org.example.parking.EngineRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEngineOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.parking.EngineResponse> stop(
        org.example.parking.EngineRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.parking.DriveResponse> drive(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getDriveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.parking.IncreaseResponse> increaseSpeed(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getIncreaseSpeedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.parking.DecreaseResponse> decreaseSpeed(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getDecreaseSpeedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.parking.DetailResponse> showdetails(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getShowdetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENGINE_ON = 0;
  private static final int METHODID_ENGINE_OFF = 1;
  private static final int METHODID_STOP = 2;
  private static final int METHODID_SENSOR = 3;
  private static final int METHODID_DRIVE = 4;
  private static final int METHODID_AUTO_PARK = 5;
  private static final int METHODID_INCREASE_SPEED = 6;
  private static final int METHODID_DECREASE_SPEED = 7;
  private static final int METHODID_SHOWDETAILS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ParkingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ParkingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENGINE_ON:
          serviceImpl.engineOn((org.example.parking.EngineRequest) request,
              (io.grpc.stub.StreamObserver<org.example.parking.EngineResponse>) responseObserver);
          break;
        case METHODID_ENGINE_OFF:
          serviceImpl.engineOff((org.example.parking.EngineRequest) request,
              (io.grpc.stub.StreamObserver<org.example.parking.EngineResponse>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((org.example.parking.EngineRequest) request,
              (io.grpc.stub.StreamObserver<org.example.parking.EngineResponse>) responseObserver);
          break;
        case METHODID_SENSOR:
          serviceImpl.sensor((org.example.parking.SensorRequest) request,
              (io.grpc.stub.StreamObserver<org.example.parking.SensorResponse>) responseObserver);
          break;
        case METHODID_DRIVE:
          serviceImpl.drive((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.parking.DriveResponse>) responseObserver);
          break;
        case METHODID_AUTO_PARK:
          serviceImpl.autoPark((org.example.parking.ParkRequest) request,
              (io.grpc.stub.StreamObserver<org.example.parking.ParkResponse>) responseObserver);
          break;
        case METHODID_INCREASE_SPEED:
          serviceImpl.increaseSpeed((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.parking.IncreaseResponse>) responseObserver);
          break;
        case METHODID_DECREASE_SPEED:
          serviceImpl.decreaseSpeed((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.parking.DecreaseResponse>) responseObserver);
          break;
        case METHODID_SHOWDETAILS:
          serviceImpl.showdetails((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.parking.DetailResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ParkingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ParkingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.parking.ParkingProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ParkingService");
    }
  }

  private static final class ParkingServiceFileDescriptorSupplier
      extends ParkingServiceBaseDescriptorSupplier {
    ParkingServiceFileDescriptorSupplier() {}
  }

  private static final class ParkingServiceMethodDescriptorSupplier
      extends ParkingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ParkingServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ParkingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ParkingServiceFileDescriptorSupplier())
              .addMethod(getEngineOnMethod())
              .addMethod(getEngineOffMethod())
              .addMethod(getStopMethod())
              .addMethod(getSensorMethod())
              .addMethod(getDriveMethod())
              .addMethod(getAutoParkMethod())
              .addMethod(getIncreaseSpeedMethod())
              .addMethod(getDecreaseSpeedMethod())
              .addMethod(getShowdetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
