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
 * The speaker service definition.
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

  private static volatile io.grpc.MethodDescriptor<org.example.milage.MaxMileRequest,
      org.example.milage.MaxMileResponse> getFindMaxMilesTravelledMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindMaxMilesTravelled",
      requestType = org.example.milage.MaxMileRequest.class,
      responseType = org.example.milage.MaxMileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.milage.MaxMileRequest,
      org.example.milage.MaxMileResponse> getFindMaxMilesTravelledMethod() {
    io.grpc.MethodDescriptor<org.example.milage.MaxMileRequest, org.example.milage.MaxMileResponse> getFindMaxMilesTravelledMethod;
    if ((getFindMaxMilesTravelledMethod = MilageServiceGrpc.getFindMaxMilesTravelledMethod) == null) {
      synchronized (MilageServiceGrpc.class) {
        if ((getFindMaxMilesTravelledMethod = MilageServiceGrpc.getFindMaxMilesTravelledMethod) == null) {
          MilageServiceGrpc.getFindMaxMilesTravelledMethod = getFindMaxMilesTravelledMethod = 
              io.grpc.MethodDescriptor.<org.example.milage.MaxMileRequest, org.example.milage.MaxMileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "milage.MilageService", "FindMaxMilesTravelled"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.milage.MaxMileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.milage.MaxMileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MilageServiceMethodDescriptorSupplier("FindMaxMilesTravelled"))
                  .build();
          }
        }
     }
     return getFindMaxMilesTravelledMethod;
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
   * The speaker service definition.
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
     * <pre>
     *bidi streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.milage.MaxMileRequest> findMaxMilesTravelled(
        io.grpc.stub.StreamObserver<org.example.milage.MaxMileResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFindMaxMilesTravelledMethod(), responseObserver);
    }

    /**
     */
    public void calculateCost(org.example.milage.DaysRequest request,
        io.grpc.stub.StreamObserver<org.example.milage.CostResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCalculateCostMethod(), responseObserver);
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
            getFindMaxMilesTravelledMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.example.milage.MaxMileRequest,
                org.example.milage.MaxMileResponse>(
                  this, METHODID_FIND_MAX_MILES_TRAVELLED)))
          .addMethod(
            getCalculateCostMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.milage.DaysRequest,
                org.example.milage.CostResponse>(
                  this, METHODID_CALCULATE_COST)))
          .build();
    }
  }

  /**
   * <pre>
   * The speaker service definition.
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
     * <pre>
     *bidi streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.milage.MaxMileRequest> findMaxMilesTravelled(
        io.grpc.stub.StreamObserver<org.example.milage.MaxMileResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFindMaxMilesTravelledMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void calculateCost(org.example.milage.DaysRequest request,
        io.grpc.stub.StreamObserver<org.example.milage.CostResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCalculateCostMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The speaker service definition.
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
     */
    public org.example.milage.CostResponse calculateCost(org.example.milage.DaysRequest request) {
      return blockingUnaryCall(
          getChannel(), getCalculateCostMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The speaker service definition.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.milage.CostResponse> calculateCost(
        org.example.milage.DaysRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCalculateCostMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WELCOME = 0;
  private static final int METHODID_TOTAL_MILES = 1;
  private static final int METHODID_CALCULATE_COST = 2;
  private static final int METHODID_AVERAGE_MILES = 3;
  private static final int METHODID_FIND_MAX_MILES_TRAVELLED = 4;

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
        case METHODID_FIND_MAX_MILES_TRAVELLED:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.findMaxMilesTravelled(
              (io.grpc.stub.StreamObserver<org.example.milage.MaxMileResponse>) responseObserver);
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
              .addMethod(getFindMaxMilesTravelledMethod())
              .addMethod(getCalculateCostMethod())
              .build();
        }
      }
    }
    return result;
  }
}
