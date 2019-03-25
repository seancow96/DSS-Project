package org.dominic.example.bed;

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
 * The bed service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: bed.proto")
public final class BedGrpc {

  private BedGrpc() {}

  public static final String SERVICE_NAME = "bed.Bed";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.dominic.example.bed.BedStatus> getWarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Warm",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.dominic.example.bed.BedStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.dominic.example.bed.BedStatus> getWarmMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.dominic.example.bed.BedStatus> getWarmMethod;
    if ((getWarmMethod = BedGrpc.getWarmMethod) == null) {
      synchronized (BedGrpc.class) {
        if ((getWarmMethod = BedGrpc.getWarmMethod) == null) {
          BedGrpc.getWarmMethod = getWarmMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.dominic.example.bed.BedStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "bed.Bed", "Warm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dominic.example.bed.BedStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new BedMethodDescriptorSupplier("Warm"))
                  .build();
          }
        }
     }
     return getWarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.dominic.example.bed.BedStatus> getGetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStatus",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.dominic.example.bed.BedStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.dominic.example.bed.BedStatus> getGetStatusMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.dominic.example.bed.BedStatus> getGetStatusMethod;
    if ((getGetStatusMethod = BedGrpc.getGetStatusMethod) == null) {
      synchronized (BedGrpc.class) {
        if ((getGetStatusMethod = BedGrpc.getGetStatusMethod) == null) {
          BedGrpc.getGetStatusMethod = getGetStatusMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.dominic.example.bed.BedStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bed.Bed", "getStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dominic.example.bed.BedStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new BedMethodDescriptorSupplier("getStatus"))
                  .build();
          }
        }
     }
     return getGetStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BedStub newStub(io.grpc.Channel channel) {
    return new BedStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BedBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BedBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BedFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BedFutureStub(channel);
  }

  /**
   * <pre>
   * The bed service definition.
   * </pre>
   */
  public static abstract class BedImplBase implements io.grpc.BindableService {

    /**
     */
    public void warm(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.dominic.example.bed.BedStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getWarmMethod(), responseObserver);
    }

    /**
     */
    public void getStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.dominic.example.bed.BedStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWarmMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.dominic.example.bed.BedStatus>(
                  this, METHODID_WARM)))
          .addMethod(
            getGetStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.dominic.example.bed.BedStatus>(
                  this, METHODID_GET_STATUS)))
          .build();
    }
  }

  /**
   * <pre>
   * The bed service definition.
   * </pre>
   */
  public static final class BedStub extends io.grpc.stub.AbstractStub<BedStub> {
    private BedStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BedStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BedStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BedStub(channel, callOptions);
    }

    /**
     */
    public void warm(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.dominic.example.bed.BedStatus> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStatus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.dominic.example.bed.BedStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The bed service definition.
   * </pre>
   */
  public static final class BedBlockingStub extends io.grpc.stub.AbstractStub<BedBlockingStub> {
    private BedBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BedBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BedBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BedBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<org.dominic.example.bed.BedStatus> warm(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getWarmMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.dominic.example.bed.BedStatus getStatus(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The bed service definition.
   * </pre>
   */
  public static final class BedFutureStub extends io.grpc.stub.AbstractStub<BedFutureStub> {
    private BedFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BedFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BedFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BedFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dominic.example.bed.BedStatus> getStatus(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WARM = 0;
  private static final int METHODID_GET_STATUS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BedImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BedImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WARM:
          serviceImpl.warm((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.dominic.example.bed.BedStatus>) responseObserver);
          break;
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.dominic.example.bed.BedStatus>) responseObserver);
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

  private static abstract class BedBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BedBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.dominic.example.bed.BedProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Bed");
    }
  }

  private static final class BedFileDescriptorSupplier
      extends BedBaseDescriptorSupplier {
    BedFileDescriptorSupplier() {}
  }

  private static final class BedMethodDescriptorSupplier
      extends BedBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BedMethodDescriptorSupplier(String methodName) {
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
      synchronized (BedGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BedFileDescriptorSupplier())
              .addMethod(getWarmMethod())
              .addMethod(getGetStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
