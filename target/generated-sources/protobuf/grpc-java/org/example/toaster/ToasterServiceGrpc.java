package org.example.toaster;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: toaster.proto")
public final class ToasterServiceGrpc {

  private ToasterServiceGrpc() {}

  public static final String SERVICE_NAME = "toaster.ToasterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.toaster.StateRequest,
      org.example.toaster.StateResponse> getToasterStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToasterStatus",
      requestType = org.example.toaster.StateRequest.class,
      responseType = org.example.toaster.StateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.toaster.StateRequest,
      org.example.toaster.StateResponse> getToasterStatusMethod() {
    io.grpc.MethodDescriptor<org.example.toaster.StateRequest, org.example.toaster.StateResponse> getToasterStatusMethod;
    if ((getToasterStatusMethod = ToasterServiceGrpc.getToasterStatusMethod) == null) {
      synchronized (ToasterServiceGrpc.class) {
        if ((getToasterStatusMethod = ToasterServiceGrpc.getToasterStatusMethod) == null) {
          ToasterServiceGrpc.getToasterStatusMethod = getToasterStatusMethod = 
              io.grpc.MethodDescriptor.<org.example.toaster.StateRequest, org.example.toaster.StateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "toaster.ToasterService", "ToasterStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.toaster.StateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.toaster.StateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ToasterServiceMethodDescriptorSupplier("ToasterStatus"))
                  .build();
          }
        }
     }
     return getToasterStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.toaster.StateRequest,
      org.example.toaster.StateResponse> getToasterStatusOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToasterStatusOff",
      requestType = org.example.toaster.StateRequest.class,
      responseType = org.example.toaster.StateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.toaster.StateRequest,
      org.example.toaster.StateResponse> getToasterStatusOffMethod() {
    io.grpc.MethodDescriptor<org.example.toaster.StateRequest, org.example.toaster.StateResponse> getToasterStatusOffMethod;
    if ((getToasterStatusOffMethod = ToasterServiceGrpc.getToasterStatusOffMethod) == null) {
      synchronized (ToasterServiceGrpc.class) {
        if ((getToasterStatusOffMethod = ToasterServiceGrpc.getToasterStatusOffMethod) == null) {
          ToasterServiceGrpc.getToasterStatusOffMethod = getToasterStatusOffMethod = 
              io.grpc.MethodDescriptor.<org.example.toaster.StateRequest, org.example.toaster.StateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "toaster.ToasterService", "ToasterStatusOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.toaster.StateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.toaster.StateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ToasterServiceMethodDescriptorSupplier("ToasterStatusOff"))
                  .build();
          }
        }
     }
     return getToasterStatusOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.toaster.BreadRequest,
      org.example.toaster.BreadResponse> getAddBreadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddBread",
      requestType = org.example.toaster.BreadRequest.class,
      responseType = org.example.toaster.BreadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.toaster.BreadRequest,
      org.example.toaster.BreadResponse> getAddBreadMethod() {
    io.grpc.MethodDescriptor<org.example.toaster.BreadRequest, org.example.toaster.BreadResponse> getAddBreadMethod;
    if ((getAddBreadMethod = ToasterServiceGrpc.getAddBreadMethod) == null) {
      synchronized (ToasterServiceGrpc.class) {
        if ((getAddBreadMethod = ToasterServiceGrpc.getAddBreadMethod) == null) {
          ToasterServiceGrpc.getAddBreadMethod = getAddBreadMethod = 
              io.grpc.MethodDescriptor.<org.example.toaster.BreadRequest, org.example.toaster.BreadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "toaster.ToasterService", "AddBread"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.toaster.BreadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.toaster.BreadResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ToasterServiceMethodDescriptorSupplier("AddBread"))
                  .build();
          }
        }
     }
     return getAddBreadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.toaster.ToastLevel> getToastingBreadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToastingBread",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.toaster.ToastLevel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.toaster.ToastLevel> getToastingBreadMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.toaster.ToastLevel> getToastingBreadMethod;
    if ((getToastingBreadMethod = ToasterServiceGrpc.getToastingBreadMethod) == null) {
      synchronized (ToasterServiceGrpc.class) {
        if ((getToastingBreadMethod = ToasterServiceGrpc.getToastingBreadMethod) == null) {
          ToasterServiceGrpc.getToastingBreadMethod = getToastingBreadMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.toaster.ToastLevel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "toaster.ToasterService", "ToastingBread"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.toaster.ToastLevel.getDefaultInstance()))
                  .setSchemaDescriptor(new ToasterServiceMethodDescriptorSupplier("ToastingBread"))
                  .build();
          }
        }
     }
     return getToastingBreadMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ToasterServiceStub newStub(io.grpc.Channel channel) {
    return new ToasterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ToasterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ToasterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ToasterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ToasterServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ToasterServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void toasterStatus(org.example.toaster.StateRequest request,
        io.grpc.stub.StreamObserver<org.example.toaster.StateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getToasterStatusMethod(), responseObserver);
    }

    /**
     */
    public void toasterStatusOff(org.example.toaster.StateRequest request,
        io.grpc.stub.StreamObserver<org.example.toaster.StateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getToasterStatusOffMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.toaster.BreadRequest> addBread(
        io.grpc.stub.StreamObserver<org.example.toaster.BreadResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAddBreadMethod(), responseObserver);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void toastingBread(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.toaster.ToastLevel> responseObserver) {
      asyncUnimplementedUnaryCall(getToastingBreadMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getToasterStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.toaster.StateRequest,
                org.example.toaster.StateResponse>(
                  this, METHODID_TOASTER_STATUS)))
          .addMethod(
            getToasterStatusOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.toaster.StateRequest,
                org.example.toaster.StateResponse>(
                  this, METHODID_TOASTER_STATUS_OFF)))
          .addMethod(
            getAddBreadMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.example.toaster.BreadRequest,
                org.example.toaster.BreadResponse>(
                  this, METHODID_ADD_BREAD)))
          .addMethod(
            getToastingBreadMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.toaster.ToastLevel>(
                  this, METHODID_TOASTING_BREAD)))
          .build();
    }
  }

  /**
   */
  public static final class ToasterServiceStub extends io.grpc.stub.AbstractStub<ToasterServiceStub> {
    private ToasterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ToasterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ToasterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ToasterServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void toasterStatus(org.example.toaster.StateRequest request,
        io.grpc.stub.StreamObserver<org.example.toaster.StateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getToasterStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void toasterStatusOff(org.example.toaster.StateRequest request,
        io.grpc.stub.StreamObserver<org.example.toaster.StateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getToasterStatusOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.toaster.BreadRequest> addBread(
        io.grpc.stub.StreamObserver<org.example.toaster.BreadResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAddBreadMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void toastingBread(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.toaster.ToastLevel> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getToastingBreadMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ToasterServiceBlockingStub extends io.grpc.stub.AbstractStub<ToasterServiceBlockingStub> {
    private ToasterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ToasterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ToasterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ToasterServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public org.example.toaster.StateResponse toasterStatus(org.example.toaster.StateRequest request) {
      return blockingUnaryCall(
          getChannel(), getToasterStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.toaster.StateResponse toasterStatusOff(org.example.toaster.StateRequest request) {
      return blockingUnaryCall(
          getChannel(), getToasterStatusOffMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public java.util.Iterator<org.example.toaster.ToastLevel> toastingBread(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getToastingBreadMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ToasterServiceFutureStub extends io.grpc.stub.AbstractStub<ToasterServiceFutureStub> {
    private ToasterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ToasterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ToasterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ToasterServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.toaster.StateResponse> toasterStatus(
        org.example.toaster.StateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getToasterStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.toaster.StateResponse> toasterStatusOff(
        org.example.toaster.StateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getToasterStatusOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TOASTER_STATUS = 0;
  private static final int METHODID_TOASTER_STATUS_OFF = 1;
  private static final int METHODID_TOASTING_BREAD = 2;
  private static final int METHODID_ADD_BREAD = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ToasterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ToasterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TOASTER_STATUS:
          serviceImpl.toasterStatus((org.example.toaster.StateRequest) request,
              (io.grpc.stub.StreamObserver<org.example.toaster.StateResponse>) responseObserver);
          break;
        case METHODID_TOASTER_STATUS_OFF:
          serviceImpl.toasterStatusOff((org.example.toaster.StateRequest) request,
              (io.grpc.stub.StreamObserver<org.example.toaster.StateResponse>) responseObserver);
          break;
        case METHODID_TOASTING_BREAD:
          serviceImpl.toastingBread((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.toaster.ToastLevel>) responseObserver);
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
        case METHODID_ADD_BREAD:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.addBread(
              (io.grpc.stub.StreamObserver<org.example.toaster.BreadResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ToasterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ToasterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.toaster.ToasterProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ToasterService");
    }
  }

  private static final class ToasterServiceFileDescriptorSupplier
      extends ToasterServiceBaseDescriptorSupplier {
    ToasterServiceFileDescriptorSupplier() {}
  }

  private static final class ToasterServiceMethodDescriptorSupplier
      extends ToasterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ToasterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ToasterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ToasterServiceFileDescriptorSupplier())
              .addMethod(getToasterStatusMethod())
              .addMethod(getToasterStatusOffMethod())
              .addMethod(getAddBreadMethod())
              .addMethod(getToastingBreadMethod())
              .build();
        }
      }
    }
    return result;
  }
}
