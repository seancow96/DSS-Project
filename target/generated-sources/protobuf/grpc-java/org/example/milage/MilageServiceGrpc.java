package org.example.milage;

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
 * The milage service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: milage.proto")
public final class MilageServiceGrpc {

  private MilageServiceGrpc() {}

  public static final String SERVICE_NAME = "milage.MilageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.milage.WelcomeRequest,
      org.example.milage.WelcomeResponse> getWelcomeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Welcome",
      requestType = org.example.milage.WelcomeRequest.class,
      responseType = org.example.milage.WelcomeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.milage.WelcomeRequest,
      org.example.milage.WelcomeResponse> getWelcomeMethod() {
    io.grpc.MethodDescriptor<org.example.milage.WelcomeRequest, org.example.milage.WelcomeResponse> getWelcomeMethod;
    if ((getWelcomeMethod = MilageServiceGrpc.getWelcomeMethod) == null) {
      synchronized (MilageServiceGrpc.class) {
        if ((getWelcomeMethod = MilageServiceGrpc.getWelcomeMethod) == null) {
          MilageServiceGrpc.getWelcomeMethod = getWelcomeMethod = 
              io.grpc.MethodDescriptor.<org.example.milage.WelcomeRequest, org.example.milage.WelcomeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "milage.MilageService", "Welcome"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.milage.WelcomeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.milage.WelcomeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MilageServiceMethodDescriptorSupplier("Welcome"))
                  .build();
          }
        }
     }
     return getWelcomeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.milage.DaysRequest,
      org.example.milage.TotalResponse> getTotalMilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalMiles",
      requestType = org.example.milage.DaysRequest.class,
      responseType = org.example.milage.TotalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.milage.DaysRequest,
      org.example.milage.TotalResponse> getTotalMilesMethod() {
    io.grpc.MethodDescriptor<org.example.milage.DaysRequest, org.example.milage.TotalResponse> getTotalMilesMethod;
    if ((getTotalMilesMethod = MilageServiceGrpc.getTotalMilesMethod) == null) {
      synchronized (MilageServiceGrpc.class) {
        if ((getTotalMilesMethod = MilageServiceGrpc.getTotalMilesMethod) == null) {
          MilageServiceGrpc.getTotalMilesMethod = getTotalMilesMethod = 
              io.grpc.MethodDescriptor.<org.example.milage.DaysRequest, org.example.milage.TotalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "milage.MilageService", "TotalMiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.milage.DaysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.milage.TotalResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MilageServiceMethodDescriptorSupplier("TotalMiles"))
                  .build();
          }
        }
     }
     return getTotalMilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.milage.DaysRequest,
      org.example.milage.AverageMilesResponse> getAverageMilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AverageMiles",
      requestType = org.example.milage.DaysRequest.class,
      responseType = org.example.milage.AverageMilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.milage.DaysRequest,
      org.example.milage.AverageMilesResponse> getAverageMilesMethod() {
    io.grpc.MethodDescriptor<org.example.milage.DaysRequest, org.example.milage.AverageMilesResponse> getAverageMilesMethod;
    if ((getAverageMilesMethod = MilageServiceGrpc.getAverageMilesMethod) == null) {
      synchronized (MilageServiceGrpc.class) {
        if ((getAverageMilesMethod = MilageServiceGrpc.getAverageMilesMethod) == null) {
          MilageServiceGrpc.getAverageMilesMethod = getAverageMilesMethod = 
              io.grpc.MethodDescriptor.<org.example.milage.DaysRequest, org.example.milage.AverageMilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "milage.MilageService", "AverageMiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.milage.DaysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.milage.AverageMilesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MilageServiceMethodDescriptorSupplier("AverageMiles"))
                  .build();
          }
        }
     }
     return getAverageMilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.milage.FindMaximumRequest,
      org.example.milage.FindMaximumResponse> getFindMaximumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindMaximum",
      requestType = org.example.milage.FindMaximumRequest.class,
      responseType = org.example.milage.FindMaximumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.milage.FindMaximumRequest,
      org.example.milage.FindMaximumResponse> getFindMaximumMethod() {
    io.grpc.MethodDescriptor<org.example.milage.FindMaximumRequest, org.example.milage.FindMaximumResponse> getFindMaximumMethod;
    if ((getFindMaximumMethod = MilageServiceGrpc.getFindMaximumMethod) == null) {
      synchronized (MilageServiceGrpc.class) {
        if ((getFindMaximumMethod = MilageServiceGrpc.getFindMaximumMethod) == null) {
          MilageServiceGrpc.getFindMaximumMethod = getFindMaximumMethod = 
              io.grpc.MethodDescriptor.<org.example.milage.FindMaximumRequest, org.example.milage.FindMaximumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "milage.MilageService", "FindMaximum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.milage.FindMaximumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.milage.FindMaximumResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MilageServiceMethodDescriptorSupplier("FindMaximum"))
                  .build();
          }
        }
     }
     return getFindMaximumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.milage.DaysRequest,
      org.example.milage.CostResponse> getCalculateCostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateCost",
      requestType = org.example.milage.DaysRequest.class,
      responseType = org.example.milage.CostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.milage.DaysRequest,
      org.example.milage.CostResponse> getCalculateCostMethod() {
    io.grpc.MethodDescriptor<org.example.milage.DaysRequest, org.example.milage.CostResponse> getCalculateCostMethod;
    if ((getCalculateCostMethod = MilageServiceGrpc.getCalculateCostMethod) == null) {
      synchronized (MilageServiceGrpc.class) {
        if ((getCalculateCostMethod = MilageServiceGrpc.getCalculateCostMethod) == null) {
          MilageServiceGrpc.getCalculateCostMethod = getCalculateCostMethod = 
              io.grpc.MethodDescriptor.<org.example.milage.DaysRequest, org.example.milage.CostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "milage.MilageService", "CalculateCost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.milage.DaysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.milage.CostResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MilageServiceMethodDescriptorSupplier("CalculateCost"))
                  .build();
          }
        }
     }
     return getCalculateCostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.milage.TirePressureResponse> getCheckTirePressureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckTirePressure",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.milage.TirePressureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.milage.TirePressureResponse> getCheckTirePressureMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.milage.TirePressureResponse> getCheckTirePressureMethod;
    if ((getCheckTirePressureMethod = MilageServiceGrpc.getCheckTirePressureMethod) == null) {
      synchronized (MilageServiceGrpc.class) {
        if ((getCheckTirePressureMethod = MilageServiceGrpc.getCheckTirePressureMethod) == null) {
          MilageServiceGrpc.getCheckTirePressureMethod = getCheckTirePressureMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.milage.TirePressureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "milage.MilageService", "CheckTirePressure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.milage.TirePressureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MilageServiceMethodDescriptorSupplier("CheckTirePressure"))
                  .build();
          }
        }
     }
     return getCheckTirePressureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.milage.FuelLevelResponse> getCheckFuelLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckFuelLevel",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.milage.FuelLevelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.milage.FuelLevelResponse> getCheckFuelLevelMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.milage.FuelLevelResponse> getCheckFuelLevelMethod;
    if ((getCheckFuelLevelMethod = MilageServiceGrpc.getCheckFuelLevelMethod) == null) {
      synchronized (MilageServiceGrpc.class) {
        if ((getCheckFuelLevelMethod = MilageServiceGrpc.getCheckFuelLevelMethod) == null) {
          MilageServiceGrpc.getCheckFuelLevelMethod = getCheckFuelLevelMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.milage.FuelLevelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "milage.MilageService", "CheckFuelLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.milage.FuelLevelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MilageServiceMethodDescriptorSupplier("CheckFuelLevel"))
                  .build();
          }
        }
     }
     return getCheckFuelLevelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MilageServiceStub newStub(io.grpc.Channel channel) {
    return new MilageServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MilageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MilageServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MilageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MilageServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The milage service definition.
   * </pre>
   */
  public static abstract class MilageServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public void welcome(org.example.milage.WelcomeRequest request,
        io.grpc.stub.StreamObserver<org.example.milage.WelcomeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWelcomeMethod(), responseObserver);
    }

    /**
     */
    public void totalMiles(org.example.milage.DaysRequest request,
        io.grpc.stub.StreamObserver<org.example.milage.TotalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTotalMilesMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.milage.DaysRequest> averageMiles(
        io.grpc.stub.StreamObserver<org.example.milage.AverageMilesResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAverageMilesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.milage.FindMaximumRequest> findMaximum(
        io.grpc.stub.StreamObserver<org.example.milage.FindMaximumResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFindMaximumMethod(), responseObserver);
    }

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public void calculateCost(org.example.milage.DaysRequest request,
        io.grpc.stub.StreamObserver<org.example.milage.CostResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCalculateCostMethod(), responseObserver);
    }

    /**
     */
    public void checkTirePressure(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.milage.TirePressureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckTirePressureMethod(), responseObserver);
    }

    /**
     */
    public void checkFuelLevel(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.milage.FuelLevelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckFuelLevelMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWelcomeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.milage.WelcomeRequest,
                org.example.milage.WelcomeResponse>(
                  this, METHODID_WELCOME)))
          .addMethod(
            getTotalMilesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.milage.DaysRequest,
                org.example.milage.TotalResponse>(
                  this, METHODID_TOTAL_MILES)))
          .addMethod(
            getAverageMilesMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.example.milage.DaysRequest,
                org.example.milage.AverageMilesResponse>(
                  this, METHODID_AVERAGE_MILES)))
          .addMethod(
            getFindMaximumMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.example.milage.FindMaximumRequest,
                org.example.milage.FindMaximumResponse>(
                  this, METHODID_FIND_MAXIMUM)))
          .addMethod(
            getCalculateCostMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.milage.DaysRequest,
                org.example.milage.CostResponse>(
                  this, METHODID_CALCULATE_COST)))
          .addMethod(
            getCheckTirePressureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.milage.TirePressureResponse>(
                  this, METHODID_CHECK_TIRE_PRESSURE)))
          .addMethod(
            getCheckFuelLevelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.milage.FuelLevelResponse>(
                  this, METHODID_CHECK_FUEL_LEVEL)))
          .build();
    }
  }

  /**
   * <pre>
   * The milage service definition.
   * </pre>
   */
  public static final class MilageServiceStub extends io.grpc.stub.AbstractStub<MilageServiceStub> {
    private MilageServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MilageServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MilageServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MilageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public void welcome(org.example.milage.WelcomeRequest request,
        io.grpc.stub.StreamObserver<org.example.milage.WelcomeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWelcomeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void totalMiles(org.example.milage.DaysRequest request,
        io.grpc.stub.StreamObserver<org.example.milage.TotalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTotalMilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.milage.DaysRequest> averageMiles(
        io.grpc.stub.StreamObserver<org.example.milage.AverageMilesResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAverageMilesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.milage.FindMaximumRequest> findMaximum(
        io.grpc.stub.StreamObserver<org.example.milage.FindMaximumResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFindMaximumMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public void calculateCost(org.example.milage.DaysRequest request,
        io.grpc.stub.StreamObserver<org.example.milage.CostResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCalculateCostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkTirePressure(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.milage.TirePressureResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckTirePressureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkFuelLevel(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.milage.FuelLevelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckFuelLevelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The milage service definition.
   * </pre>
   */
  public static final class MilageServiceBlockingStub extends io.grpc.stub.AbstractStub<MilageServiceBlockingStub> {
    private MilageServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MilageServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MilageServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MilageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public org.example.milage.WelcomeResponse welcome(org.example.milage.WelcomeRequest request) {
      return blockingUnaryCall(
          getChannel(), getWelcomeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.milage.TotalResponse totalMiles(org.example.milage.DaysRequest request) {
      return blockingUnaryCall(
          getChannel(), getTotalMilesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public org.example.milage.CostResponse calculateCost(org.example.milage.DaysRequest request) {
      return blockingUnaryCall(
          getChannel(), getCalculateCostMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.milage.TirePressureResponse checkTirePressure(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getCheckTirePressureMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.milage.FuelLevelResponse checkFuelLevel(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getCheckFuelLevelMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The milage service definition.
   * </pre>
   */
  public static final class MilageServiceFutureStub extends io.grpc.stub.AbstractStub<MilageServiceFutureStub> {
    private MilageServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MilageServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MilageServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MilageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.milage.WelcomeResponse> welcome(
        org.example.milage.WelcomeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWelcomeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.milage.TotalResponse> totalMiles(
        org.example.milage.DaysRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTotalMilesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.milage.CostResponse> calculateCost(
        org.example.milage.DaysRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCalculateCostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.milage.TirePressureResponse> checkTirePressure(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckTirePressureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.milage.FuelLevelResponse> checkFuelLevel(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckFuelLevelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WELCOME = 0;
  private static final int METHODID_TOTAL_MILES = 1;
  private static final int METHODID_CALCULATE_COST = 2;
  private static final int METHODID_CHECK_TIRE_PRESSURE = 3;
  private static final int METHODID_CHECK_FUEL_LEVEL = 4;
  private static final int METHODID_AVERAGE_MILES = 5;
  private static final int METHODID_FIND_MAXIMUM = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MilageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MilageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WELCOME:
          serviceImpl.welcome((org.example.milage.WelcomeRequest) request,
              (io.grpc.stub.StreamObserver<org.example.milage.WelcomeResponse>) responseObserver);
          break;
        case METHODID_TOTAL_MILES:
          serviceImpl.totalMiles((org.example.milage.DaysRequest) request,
              (io.grpc.stub.StreamObserver<org.example.milage.TotalResponse>) responseObserver);
          break;
        case METHODID_CALCULATE_COST:
          serviceImpl.calculateCost((org.example.milage.DaysRequest) request,
              (io.grpc.stub.StreamObserver<org.example.milage.CostResponse>) responseObserver);
          break;
        case METHODID_CHECK_TIRE_PRESSURE:
          serviceImpl.checkTirePressure((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.milage.TirePressureResponse>) responseObserver);
          break;
        case METHODID_CHECK_FUEL_LEVEL:
          serviceImpl.checkFuelLevel((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.milage.FuelLevelResponse>) responseObserver);
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
        case METHODID_AVERAGE_MILES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.averageMiles(
              (io.grpc.stub.StreamObserver<org.example.milage.AverageMilesResponse>) responseObserver);
        case METHODID_FIND_MAXIMUM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.findMaximum(
              (io.grpc.stub.StreamObserver<org.example.milage.FindMaximumResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MilageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MilageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.milage.MilageProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MilageService");
    }
  }

  private static final class MilageServiceFileDescriptorSupplier
      extends MilageServiceBaseDescriptorSupplier {
    MilageServiceFileDescriptorSupplier() {}
  }

  private static final class MilageServiceMethodDescriptorSupplier
      extends MilageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MilageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MilageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MilageServiceFileDescriptorSupplier())
              .addMethod(getWelcomeMethod())
              .addMethod(getTotalMilesMethod())
              .addMethod(getAverageMilesMethod())
              .addMethod(getFindMaximumMethod())
              .addMethod(getCalculateCostMethod())
              .addMethod(getCheckTirePressureMethod())
              .addMethod(getCheckFuelLevelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
