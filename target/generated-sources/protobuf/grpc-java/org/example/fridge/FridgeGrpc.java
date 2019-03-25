package org.example.fridge;

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
 * The fridge service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: fridge.proto")
public final class FridgeGrpc {

  private FridgeGrpc() {}

  public static final String SERVICE_NAME = "fridge.Fridge";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.fridge.StatusRequest,
      org.example.fridge.StatusResponse> getFridgeStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FridgeStatus",
      requestType = org.example.fridge.StatusRequest.class,
      responseType = org.example.fridge.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.fridge.StatusRequest,
      org.example.fridge.StatusResponse> getFridgeStatusMethod() {
    io.grpc.MethodDescriptor<org.example.fridge.StatusRequest, org.example.fridge.StatusResponse> getFridgeStatusMethod;
    if ((getFridgeStatusMethod = FridgeGrpc.getFridgeStatusMethod) == null) {
      synchronized (FridgeGrpc.class) {
        if ((getFridgeStatusMethod = FridgeGrpc.getFridgeStatusMethod) == null) {
          FridgeGrpc.getFridgeStatusMethod = getFridgeStatusMethod = 
              io.grpc.MethodDescriptor.<org.example.fridge.StatusRequest, org.example.fridge.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "fridge.Fridge", "FridgeStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.fridge.StatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.fridge.StatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FridgeMethodDescriptorSupplier("FridgeStatus"))
                  .build();
          }
        }
     }
     return getFridgeStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.fridge.StatusRequest,
      org.example.fridge.StatusResponse> getFridgeStatusOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FridgeStatusOff",
      requestType = org.example.fridge.StatusRequest.class,
      responseType = org.example.fridge.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.fridge.StatusRequest,
      org.example.fridge.StatusResponse> getFridgeStatusOffMethod() {
    io.grpc.MethodDescriptor<org.example.fridge.StatusRequest, org.example.fridge.StatusResponse> getFridgeStatusOffMethod;
    if ((getFridgeStatusOffMethod = FridgeGrpc.getFridgeStatusOffMethod) == null) {
      synchronized (FridgeGrpc.class) {
        if ((getFridgeStatusOffMethod = FridgeGrpc.getFridgeStatusOffMethod) == null) {
          FridgeGrpc.getFridgeStatusOffMethod = getFridgeStatusOffMethod = 
              io.grpc.MethodDescriptor.<org.example.fridge.StatusRequest, org.example.fridge.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "fridge.Fridge", "FridgeStatusOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.fridge.StatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.fridge.StatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FridgeMethodDescriptorSupplier("FridgeStatusOff"))
                  .build();
          }
        }
     }
     return getFridgeStatusOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.fridge.LockingRequest,
      org.example.fridge.LockingResponse> getFridgeIceLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FridgeIceLock",
      requestType = org.example.fridge.LockingRequest.class,
      responseType = org.example.fridge.LockingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.fridge.LockingRequest,
      org.example.fridge.LockingResponse> getFridgeIceLockMethod() {
    io.grpc.MethodDescriptor<org.example.fridge.LockingRequest, org.example.fridge.LockingResponse> getFridgeIceLockMethod;
    if ((getFridgeIceLockMethod = FridgeGrpc.getFridgeIceLockMethod) == null) {
      synchronized (FridgeGrpc.class) {
        if ((getFridgeIceLockMethod = FridgeGrpc.getFridgeIceLockMethod) == null) {
          FridgeGrpc.getFridgeIceLockMethod = getFridgeIceLockMethod = 
              io.grpc.MethodDescriptor.<org.example.fridge.LockingRequest, org.example.fridge.LockingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "fridge.Fridge", "FridgeIceLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.fridge.LockingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.fridge.LockingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FridgeMethodDescriptorSupplier("FridgeIceLock"))
                  .build();
          }
        }
     }
     return getFridgeIceLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.fridge.LockingRequest,
      org.example.fridge.LockingResponse> getFridgeIceUnlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FridgeIceUnlock",
      requestType = org.example.fridge.LockingRequest.class,
      responseType = org.example.fridge.LockingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.fridge.LockingRequest,
      org.example.fridge.LockingResponse> getFridgeIceUnlockMethod() {
    io.grpc.MethodDescriptor<org.example.fridge.LockingRequest, org.example.fridge.LockingResponse> getFridgeIceUnlockMethod;
    if ((getFridgeIceUnlockMethod = FridgeGrpc.getFridgeIceUnlockMethod) == null) {
      synchronized (FridgeGrpc.class) {
        if ((getFridgeIceUnlockMethod = FridgeGrpc.getFridgeIceUnlockMethod) == null) {
          FridgeGrpc.getFridgeIceUnlockMethod = getFridgeIceUnlockMethod = 
              io.grpc.MethodDescriptor.<org.example.fridge.LockingRequest, org.example.fridge.LockingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "fridge.Fridge", "FridgeIceUnlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.fridge.LockingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.fridge.LockingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FridgeMethodDescriptorSupplier("FridgeIceUnlock"))
                  .build();
          }
        }
     }
     return getFridgeIceUnlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.fridge.DispenseResponse> getDispenseIceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DispenseIce",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.fridge.DispenseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.fridge.DispenseResponse> getDispenseIceMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.fridge.DispenseResponse> getDispenseIceMethod;
    if ((getDispenseIceMethod = FridgeGrpc.getDispenseIceMethod) == null) {
      synchronized (FridgeGrpc.class) {
        if ((getDispenseIceMethod = FridgeGrpc.getDispenseIceMethod) == null) {
          FridgeGrpc.getDispenseIceMethod = getDispenseIceMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.fridge.DispenseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "fridge.Fridge", "DispenseIce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.fridge.DispenseResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FridgeMethodDescriptorSupplier("DispenseIce"))
                  .build();
          }
        }
     }
     return getDispenseIceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FridgeStub newStub(io.grpc.Channel channel) {
    return new FridgeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FridgeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FridgeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FridgeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FridgeFutureStub(channel);
  }

  /**
   * <pre>
   * The fridge service definition.
   * </pre>
   */
  public static abstract class FridgeImplBase implements io.grpc.BindableService {

    /**
     */
    public void fridgeStatus(org.example.fridge.StatusRequest request,
        io.grpc.stub.StreamObserver<org.example.fridge.StatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFridgeStatusMethod(), responseObserver);
    }

    /**
     */
    public void fridgeStatusOff(org.example.fridge.StatusRequest request,
        io.grpc.stub.StreamObserver<org.example.fridge.StatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFridgeStatusOffMethod(), responseObserver);
    }

    /**
     */
    public void fridgeIceLock(org.example.fridge.LockingRequest request,
        io.grpc.stub.StreamObserver<org.example.fridge.LockingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFridgeIceLockMethod(), responseObserver);
    }

    /**
     */
    public void fridgeIceUnlock(org.example.fridge.LockingRequest request,
        io.grpc.stub.StreamObserver<org.example.fridge.LockingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFridgeIceUnlockMethod(), responseObserver);
    }

    /**
     */
    public void dispenseIce(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.fridge.DispenseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDispenseIceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFridgeStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.fridge.StatusRequest,
                org.example.fridge.StatusResponse>(
                  this, METHODID_FRIDGE_STATUS)))
          .addMethod(
            getFridgeStatusOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.fridge.StatusRequest,
                org.example.fridge.StatusResponse>(
                  this, METHODID_FRIDGE_STATUS_OFF)))
          .addMethod(
            getFridgeIceLockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.fridge.LockingRequest,
                org.example.fridge.LockingResponse>(
                  this, METHODID_FRIDGE_ICE_LOCK)))
          .addMethod(
            getFridgeIceUnlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.fridge.LockingRequest,
                org.example.fridge.LockingResponse>(
                  this, METHODID_FRIDGE_ICE_UNLOCK)))
          .addMethod(
            getDispenseIceMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.fridge.DispenseResponse>(
                  this, METHODID_DISPENSE_ICE)))
          .build();
    }
  }

  /**
   * <pre>
   * The fridge service definition.
   * </pre>
   */
  public static final class FridgeStub extends io.grpc.stub.AbstractStub<FridgeStub> {
    private FridgeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FridgeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FridgeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FridgeStub(channel, callOptions);
    }

    /**
     */
    public void fridgeStatus(org.example.fridge.StatusRequest request,
        io.grpc.stub.StreamObserver<org.example.fridge.StatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFridgeStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fridgeStatusOff(org.example.fridge.StatusRequest request,
        io.grpc.stub.StreamObserver<org.example.fridge.StatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFridgeStatusOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fridgeIceLock(org.example.fridge.LockingRequest request,
        io.grpc.stub.StreamObserver<org.example.fridge.LockingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFridgeIceLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fridgeIceUnlock(org.example.fridge.LockingRequest request,
        io.grpc.stub.StreamObserver<org.example.fridge.LockingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFridgeIceUnlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dispenseIce(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.fridge.DispenseResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getDispenseIceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The fridge service definition.
   * </pre>
   */
  public static final class FridgeBlockingStub extends io.grpc.stub.AbstractStub<FridgeBlockingStub> {
    private FridgeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FridgeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FridgeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FridgeBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.fridge.StatusResponse fridgeStatus(org.example.fridge.StatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getFridgeStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.fridge.StatusResponse fridgeStatusOff(org.example.fridge.StatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getFridgeStatusOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.fridge.LockingResponse fridgeIceLock(org.example.fridge.LockingRequest request) {
      return blockingUnaryCall(
          getChannel(), getFridgeIceLockMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.fridge.LockingResponse fridgeIceUnlock(org.example.fridge.LockingRequest request) {
      return blockingUnaryCall(
          getChannel(), getFridgeIceUnlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.example.fridge.DispenseResponse> dispenseIce(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getDispenseIceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The fridge service definition.
   * </pre>
   */
  public static final class FridgeFutureStub extends io.grpc.stub.AbstractStub<FridgeFutureStub> {
    private FridgeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FridgeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FridgeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FridgeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.fridge.StatusResponse> fridgeStatus(
        org.example.fridge.StatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFridgeStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.fridge.StatusResponse> fridgeStatusOff(
        org.example.fridge.StatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFridgeStatusOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.fridge.LockingResponse> fridgeIceLock(
        org.example.fridge.LockingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFridgeIceLockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.fridge.LockingResponse> fridgeIceUnlock(
        org.example.fridge.LockingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFridgeIceUnlockMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FRIDGE_STATUS = 0;
  private static final int METHODID_FRIDGE_STATUS_OFF = 1;
  private static final int METHODID_FRIDGE_ICE_LOCK = 2;
  private static final int METHODID_FRIDGE_ICE_UNLOCK = 3;
  private static final int METHODID_DISPENSE_ICE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FridgeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FridgeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FRIDGE_STATUS:
          serviceImpl.fridgeStatus((org.example.fridge.StatusRequest) request,
              (io.grpc.stub.StreamObserver<org.example.fridge.StatusResponse>) responseObserver);
          break;
        case METHODID_FRIDGE_STATUS_OFF:
          serviceImpl.fridgeStatusOff((org.example.fridge.StatusRequest) request,
              (io.grpc.stub.StreamObserver<org.example.fridge.StatusResponse>) responseObserver);
          break;
        case METHODID_FRIDGE_ICE_LOCK:
          serviceImpl.fridgeIceLock((org.example.fridge.LockingRequest) request,
              (io.grpc.stub.StreamObserver<org.example.fridge.LockingResponse>) responseObserver);
          break;
        case METHODID_FRIDGE_ICE_UNLOCK:
          serviceImpl.fridgeIceUnlock((org.example.fridge.LockingRequest) request,
              (io.grpc.stub.StreamObserver<org.example.fridge.LockingResponse>) responseObserver);
          break;
        case METHODID_DISPENSE_ICE:
          serviceImpl.dispenseIce((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.fridge.DispenseResponse>) responseObserver);
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

  private static abstract class FridgeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FridgeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.fridge.FridgeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Fridge");
    }
  }

  private static final class FridgeFileDescriptorSupplier
      extends FridgeBaseDescriptorSupplier {
    FridgeFileDescriptorSupplier() {}
  }

  private static final class FridgeMethodDescriptorSupplier
      extends FridgeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FridgeMethodDescriptorSupplier(String methodName) {
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
      synchronized (FridgeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FridgeFileDescriptorSupplier())
              .addMethod(getFridgeStatusMethod())
              .addMethod(getFridgeStatusOffMethod())
              .addMethod(getFridgeIceLockMethod())
              .addMethod(getFridgeIceUnlockMethod())
              .addMethod(getDispenseIceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
