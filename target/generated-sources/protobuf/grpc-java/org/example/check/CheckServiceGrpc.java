package org.example.check;

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
    comments = "Source: checks.proto")
public final class CheckServiceGrpc {

  private CheckServiceGrpc() {}

  public static final String SERVICE_NAME = "check.CheckService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.check.WelcomeRequest,
      org.example.check.WelcomeResponse> getWelcomeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Welcome",
      requestType = org.example.check.WelcomeRequest.class,
      responseType = org.example.check.WelcomeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.check.WelcomeRequest,
      org.example.check.WelcomeResponse> getWelcomeMethod() {
    io.grpc.MethodDescriptor<org.example.check.WelcomeRequest, org.example.check.WelcomeResponse> getWelcomeMethod;
    if ((getWelcomeMethod = CheckServiceGrpc.getWelcomeMethod) == null) {
      synchronized (CheckServiceGrpc.class) {
        if ((getWelcomeMethod = CheckServiceGrpc.getWelcomeMethod) == null) {
          CheckServiceGrpc.getWelcomeMethod = getWelcomeMethod = 
              io.grpc.MethodDescriptor.<org.example.check.WelcomeRequest, org.example.check.WelcomeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "check.CheckService", "Welcome"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.check.WelcomeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.check.WelcomeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CheckServiceMethodDescriptorSupplier("Welcome"))
                  .build();
          }
        }
     }
     return getWelcomeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.check.DaysRequest,
      org.example.check.TotalResponse> getTotalMilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalMiles",
      requestType = org.example.check.DaysRequest.class,
      responseType = org.example.check.TotalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.check.DaysRequest,
      org.example.check.TotalResponse> getTotalMilesMethod() {
    io.grpc.MethodDescriptor<org.example.check.DaysRequest, org.example.check.TotalResponse> getTotalMilesMethod;
    if ((getTotalMilesMethod = CheckServiceGrpc.getTotalMilesMethod) == null) {
      synchronized (CheckServiceGrpc.class) {
        if ((getTotalMilesMethod = CheckServiceGrpc.getTotalMilesMethod) == null) {
          CheckServiceGrpc.getTotalMilesMethod = getTotalMilesMethod = 
              io.grpc.MethodDescriptor.<org.example.check.DaysRequest, org.example.check.TotalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "check.CheckService", "TotalMiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.check.DaysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.check.TotalResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CheckServiceMethodDescriptorSupplier("TotalMiles"))
                  .build();
          }
        }
     }
     return getTotalMilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.check.DaysRequest,
      org.example.check.AverageMilesResponse> getAverageMilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AverageMiles",
      requestType = org.example.check.DaysRequest.class,
      responseType = org.example.check.AverageMilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.check.DaysRequest,
      org.example.check.AverageMilesResponse> getAverageMilesMethod() {
    io.grpc.MethodDescriptor<org.example.check.DaysRequest, org.example.check.AverageMilesResponse> getAverageMilesMethod;
    if ((getAverageMilesMethod = CheckServiceGrpc.getAverageMilesMethod) == null) {
      synchronized (CheckServiceGrpc.class) {
        if ((getAverageMilesMethod = CheckServiceGrpc.getAverageMilesMethod) == null) {
          CheckServiceGrpc.getAverageMilesMethod = getAverageMilesMethod = 
              io.grpc.MethodDescriptor.<org.example.check.DaysRequest, org.example.check.AverageMilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "check.CheckService", "AverageMiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.check.DaysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.check.AverageMilesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CheckServiceMethodDescriptorSupplier("AverageMiles"))
                  .build();
          }
        }
     }
     return getAverageMilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.check.MaxMilesRequest,
      org.example.check.MaxMilesResponse> getMaxMilesDrivenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MaxMilesDriven",
      requestType = org.example.check.MaxMilesRequest.class,
      responseType = org.example.check.MaxMilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.check.MaxMilesRequest,
      org.example.check.MaxMilesResponse> getMaxMilesDrivenMethod() {
    io.grpc.MethodDescriptor<org.example.check.MaxMilesRequest, org.example.check.MaxMilesResponse> getMaxMilesDrivenMethod;
    if ((getMaxMilesDrivenMethod = CheckServiceGrpc.getMaxMilesDrivenMethod) == null) {
      synchronized (CheckServiceGrpc.class) {
        if ((getMaxMilesDrivenMethod = CheckServiceGrpc.getMaxMilesDrivenMethod) == null) {
          CheckServiceGrpc.getMaxMilesDrivenMethod = getMaxMilesDrivenMethod = 
              io.grpc.MethodDescriptor.<org.example.check.MaxMilesRequest, org.example.check.MaxMilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "check.CheckService", "MaxMilesDriven"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.check.MaxMilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.check.MaxMilesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CheckServiceMethodDescriptorSupplier("MaxMilesDriven"))
                  .build();
          }
        }
     }
     return getMaxMilesDrivenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.check.DaysRequest,
      org.example.check.CostResponse> getCalculateCostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateCost",
      requestType = org.example.check.DaysRequest.class,
      responseType = org.example.check.CostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.check.DaysRequest,
      org.example.check.CostResponse> getCalculateCostMethod() {
    io.grpc.MethodDescriptor<org.example.check.DaysRequest, org.example.check.CostResponse> getCalculateCostMethod;
    if ((getCalculateCostMethod = CheckServiceGrpc.getCalculateCostMethod) == null) {
      synchronized (CheckServiceGrpc.class) {
        if ((getCalculateCostMethod = CheckServiceGrpc.getCalculateCostMethod) == null) {
          CheckServiceGrpc.getCalculateCostMethod = getCalculateCostMethod = 
              io.grpc.MethodDescriptor.<org.example.check.DaysRequest, org.example.check.CostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "check.CheckService", "CalculateCost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.check.DaysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.check.CostResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CheckServiceMethodDescriptorSupplier("CalculateCost"))
                  .build();
          }
        }
     }
     return getCalculateCostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.check.TirePressureResponse> getCheckTirePressureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckTirePressure",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.check.TirePressureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.check.TirePressureResponse> getCheckTirePressureMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.check.TirePressureResponse> getCheckTirePressureMethod;
    if ((getCheckTirePressureMethod = CheckServiceGrpc.getCheckTirePressureMethod) == null) {
      synchronized (CheckServiceGrpc.class) {
        if ((getCheckTirePressureMethod = CheckServiceGrpc.getCheckTirePressureMethod) == null) {
          CheckServiceGrpc.getCheckTirePressureMethod = getCheckTirePressureMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.check.TirePressureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "check.CheckService", "CheckTirePressure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.check.TirePressureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CheckServiceMethodDescriptorSupplier("CheckTirePressure"))
                  .build();
          }
        }
     }
     return getCheckTirePressureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.check.FuelLevelResponse> getCheckFuelLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckFuelLevel",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.check.FuelLevelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.check.FuelLevelResponse> getCheckFuelLevelMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.check.FuelLevelResponse> getCheckFuelLevelMethod;
    if ((getCheckFuelLevelMethod = CheckServiceGrpc.getCheckFuelLevelMethod) == null) {
      synchronized (CheckServiceGrpc.class) {
        if ((getCheckFuelLevelMethod = CheckServiceGrpc.getCheckFuelLevelMethod) == null) {
          CheckServiceGrpc.getCheckFuelLevelMethod = getCheckFuelLevelMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.check.FuelLevelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "check.CheckService", "CheckFuelLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.check.FuelLevelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CheckServiceMethodDescriptorSupplier("CheckFuelLevel"))
                  .build();
          }
        }
     }
     return getCheckFuelLevelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CheckServiceStub newStub(io.grpc.Channel channel) {
    return new CheckServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CheckServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CheckServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CheckServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CheckServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The milage service definition.
   * </pre>
   */
  public static abstract class CheckServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void welcome(org.example.check.WelcomeRequest request,
        io.grpc.stub.StreamObserver<org.example.check.WelcomeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWelcomeMethod(), responseObserver);
    }

    /**
     */
    public void totalMiles(org.example.check.DaysRequest request,
        io.grpc.stub.StreamObserver<org.example.check.TotalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTotalMilesMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.check.DaysRequest> averageMiles(
        io.grpc.stub.StreamObserver<org.example.check.AverageMilesResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAverageMilesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.check.MaxMilesRequest> maxMilesDriven(
        io.grpc.stub.StreamObserver<org.example.check.MaxMilesResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getMaxMilesDrivenMethod(), responseObserver);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void calculateCost(org.example.check.DaysRequest request,
        io.grpc.stub.StreamObserver<org.example.check.CostResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCalculateCostMethod(), responseObserver);
    }

    /**
     */
    public void checkTirePressure(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.check.TirePressureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckTirePressureMethod(), responseObserver);
    }

    /**
     */
    public void checkFuelLevel(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.check.FuelLevelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckFuelLevelMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWelcomeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.check.WelcomeRequest,
                org.example.check.WelcomeResponse>(
                  this, METHODID_WELCOME)))
          .addMethod(
            getTotalMilesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.check.DaysRequest,
                org.example.check.TotalResponse>(
                  this, METHODID_TOTAL_MILES)))
          .addMethod(
            getAverageMilesMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.example.check.DaysRequest,
                org.example.check.AverageMilesResponse>(
                  this, METHODID_AVERAGE_MILES)))
          .addMethod(
            getMaxMilesDrivenMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.example.check.MaxMilesRequest,
                org.example.check.MaxMilesResponse>(
                  this, METHODID_MAX_MILES_DRIVEN)))
          .addMethod(
            getCalculateCostMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.check.DaysRequest,
                org.example.check.CostResponse>(
                  this, METHODID_CALCULATE_COST)))
          .addMethod(
            getCheckTirePressureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.check.TirePressureResponse>(
                  this, METHODID_CHECK_TIRE_PRESSURE)))
          .addMethod(
            getCheckFuelLevelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.check.FuelLevelResponse>(
                  this, METHODID_CHECK_FUEL_LEVEL)))
          .build();
    }
  }

  /**
   * <pre>
   * The milage service definition.
   * </pre>
   */
  public static final class CheckServiceStub extends io.grpc.stub.AbstractStub<CheckServiceStub> {
    private CheckServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CheckServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CheckServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void welcome(org.example.check.WelcomeRequest request,
        io.grpc.stub.StreamObserver<org.example.check.WelcomeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWelcomeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void totalMiles(org.example.check.DaysRequest request,
        io.grpc.stub.StreamObserver<org.example.check.TotalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTotalMilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.check.DaysRequest> averageMiles(
        io.grpc.stub.StreamObserver<org.example.check.AverageMilesResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAverageMilesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.check.MaxMilesRequest> maxMilesDriven(
        io.grpc.stub.StreamObserver<org.example.check.MaxMilesResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getMaxMilesDrivenMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void calculateCost(org.example.check.DaysRequest request,
        io.grpc.stub.StreamObserver<org.example.check.CostResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCalculateCostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkTirePressure(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.check.TirePressureResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckTirePressureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkFuelLevel(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.check.FuelLevelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckFuelLevelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The milage service definition.
   * </pre>
   */
  public static final class CheckServiceBlockingStub extends io.grpc.stub.AbstractStub<CheckServiceBlockingStub> {
    private CheckServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CheckServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CheckServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public org.example.check.WelcomeResponse welcome(org.example.check.WelcomeRequest request) {
      return blockingUnaryCall(
          getChannel(), getWelcomeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.check.TotalResponse totalMiles(org.example.check.DaysRequest request) {
      return blockingUnaryCall(
          getChannel(), getTotalMilesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public org.example.check.CostResponse calculateCost(org.example.check.DaysRequest request) {
      return blockingUnaryCall(
          getChannel(), getCalculateCostMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.check.TirePressureResponse checkTirePressure(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getCheckTirePressureMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.check.FuelLevelResponse checkFuelLevel(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getCheckFuelLevelMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The milage service definition.
   * </pre>
   */
  public static final class CheckServiceFutureStub extends io.grpc.stub.AbstractStub<CheckServiceFutureStub> {
    private CheckServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CheckServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CheckServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.check.WelcomeResponse> welcome(
        org.example.check.WelcomeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWelcomeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.check.TotalResponse> totalMiles(
        org.example.check.DaysRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTotalMilesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.check.CostResponse> calculateCost(
        org.example.check.DaysRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCalculateCostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.check.TirePressureResponse> checkTirePressure(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckTirePressureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.check.FuelLevelResponse> checkFuelLevel(
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
  private static final int METHODID_MAX_MILES_DRIVEN = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CheckServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CheckServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WELCOME:
          serviceImpl.welcome((org.example.check.WelcomeRequest) request,
              (io.grpc.stub.StreamObserver<org.example.check.WelcomeResponse>) responseObserver);
          break;
        case METHODID_TOTAL_MILES:
          serviceImpl.totalMiles((org.example.check.DaysRequest) request,
              (io.grpc.stub.StreamObserver<org.example.check.TotalResponse>) responseObserver);
          break;
        case METHODID_CALCULATE_COST:
          serviceImpl.calculateCost((org.example.check.DaysRequest) request,
              (io.grpc.stub.StreamObserver<org.example.check.CostResponse>) responseObserver);
          break;
        case METHODID_CHECK_TIRE_PRESSURE:
          serviceImpl.checkTirePressure((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.check.TirePressureResponse>) responseObserver);
          break;
        case METHODID_CHECK_FUEL_LEVEL:
          serviceImpl.checkFuelLevel((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.check.FuelLevelResponse>) responseObserver);
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
              (io.grpc.stub.StreamObserver<org.example.check.AverageMilesResponse>) responseObserver);
        case METHODID_MAX_MILES_DRIVEN:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.maxMilesDriven(
              (io.grpc.stub.StreamObserver<org.example.check.MaxMilesResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CheckServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CheckServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.check.CheckProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CheckService");
    }
  }

  private static final class CheckServiceFileDescriptorSupplier
      extends CheckServiceBaseDescriptorSupplier {
    CheckServiceFileDescriptorSupplier() {}
  }

  private static final class CheckServiceMethodDescriptorSupplier
      extends CheckServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CheckServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CheckServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CheckServiceFileDescriptorSupplier())
              .addMethod(getWelcomeMethod())
              .addMethod(getTotalMilesMethod())
              .addMethod(getAverageMilesMethod())
              .addMethod(getMaxMilesDrivenMethod())
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
