package org.example.speaker;

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
    comments = "Source: speaker.proto")
public final class SpeakerServiceGrpc {

  private SpeakerServiceGrpc() {}

  public static final String SERVICE_NAME = "speaker.SpeakerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.speaker.SpeakerRequest,
      org.example.speaker.SpeakerResponse> getSpeakerOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpeakerOn",
      requestType = org.example.speaker.SpeakerRequest.class,
      responseType = org.example.speaker.SpeakerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.speaker.SpeakerRequest,
      org.example.speaker.SpeakerResponse> getSpeakerOnMethod() {
    io.grpc.MethodDescriptor<org.example.speaker.SpeakerRequest, org.example.speaker.SpeakerResponse> getSpeakerOnMethod;
    if ((getSpeakerOnMethod = SpeakerServiceGrpc.getSpeakerOnMethod) == null) {
      synchronized (SpeakerServiceGrpc.class) {
        if ((getSpeakerOnMethod = SpeakerServiceGrpc.getSpeakerOnMethod) == null) {
          SpeakerServiceGrpc.getSpeakerOnMethod = getSpeakerOnMethod = 
              io.grpc.MethodDescriptor.<org.example.speaker.SpeakerRequest, org.example.speaker.SpeakerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "speaker.SpeakerService", "SpeakerOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.speaker.SpeakerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.speaker.SpeakerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeakerServiceMethodDescriptorSupplier("SpeakerOn"))
                  .build();
          }
        }
     }
     return getSpeakerOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.speaker.SpeakerRequest,
      org.example.speaker.SpeakerResponse> getSpeakerOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpeakerOff",
      requestType = org.example.speaker.SpeakerRequest.class,
      responseType = org.example.speaker.SpeakerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.speaker.SpeakerRequest,
      org.example.speaker.SpeakerResponse> getSpeakerOffMethod() {
    io.grpc.MethodDescriptor<org.example.speaker.SpeakerRequest, org.example.speaker.SpeakerResponse> getSpeakerOffMethod;
    if ((getSpeakerOffMethod = SpeakerServiceGrpc.getSpeakerOffMethod) == null) {
      synchronized (SpeakerServiceGrpc.class) {
        if ((getSpeakerOffMethod = SpeakerServiceGrpc.getSpeakerOffMethod) == null) {
          SpeakerServiceGrpc.getSpeakerOffMethod = getSpeakerOffMethod = 
              io.grpc.MethodDescriptor.<org.example.speaker.SpeakerRequest, org.example.speaker.SpeakerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "speaker.SpeakerService", "SpeakerOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.speaker.SpeakerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.speaker.SpeakerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeakerServiceMethodDescriptorSupplier("SpeakerOff"))
                  .build();
          }
        }
     }
     return getSpeakerOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.speaker.DeviceRequest,
      org.example.speaker.DeviceResponse> getConnectDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConnectDevice",
      requestType = org.example.speaker.DeviceRequest.class,
      responseType = org.example.speaker.DeviceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.speaker.DeviceRequest,
      org.example.speaker.DeviceResponse> getConnectDeviceMethod() {
    io.grpc.MethodDescriptor<org.example.speaker.DeviceRequest, org.example.speaker.DeviceResponse> getConnectDeviceMethod;
    if ((getConnectDeviceMethod = SpeakerServiceGrpc.getConnectDeviceMethod) == null) {
      synchronized (SpeakerServiceGrpc.class) {
        if ((getConnectDeviceMethod = SpeakerServiceGrpc.getConnectDeviceMethod) == null) {
          SpeakerServiceGrpc.getConnectDeviceMethod = getConnectDeviceMethod = 
              io.grpc.MethodDescriptor.<org.example.speaker.DeviceRequest, org.example.speaker.DeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "speaker.SpeakerService", "ConnectDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.speaker.DeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.speaker.DeviceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeakerServiceMethodDescriptorSupplier("ConnectDevice"))
                  .build();
          }
        }
     }
     return getConnectDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.speaker.AverageRequest,
      org.example.speaker.AverageResponse> getAverageViewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AverageViews",
      requestType = org.example.speaker.AverageRequest.class,
      responseType = org.example.speaker.AverageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.speaker.AverageRequest,
      org.example.speaker.AverageResponse> getAverageViewsMethod() {
    io.grpc.MethodDescriptor<org.example.speaker.AverageRequest, org.example.speaker.AverageResponse> getAverageViewsMethod;
    if ((getAverageViewsMethod = SpeakerServiceGrpc.getAverageViewsMethod) == null) {
      synchronized (SpeakerServiceGrpc.class) {
        if ((getAverageViewsMethod = SpeakerServiceGrpc.getAverageViewsMethod) == null) {
          SpeakerServiceGrpc.getAverageViewsMethod = getAverageViewsMethod = 
              io.grpc.MethodDescriptor.<org.example.speaker.AverageRequest, org.example.speaker.AverageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "speaker.SpeakerService", "AverageViews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.speaker.AverageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.speaker.AverageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeakerServiceMethodDescriptorSupplier("AverageViews"))
                  .build();
          }
        }
     }
     return getAverageViewsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.speaker.FindMaximumRequest,
      org.example.speaker.FindMaximumResponse> getFindMaximumViewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindMaximumViews",
      requestType = org.example.speaker.FindMaximumRequest.class,
      responseType = org.example.speaker.FindMaximumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.speaker.FindMaximumRequest,
      org.example.speaker.FindMaximumResponse> getFindMaximumViewsMethod() {
    io.grpc.MethodDescriptor<org.example.speaker.FindMaximumRequest, org.example.speaker.FindMaximumResponse> getFindMaximumViewsMethod;
    if ((getFindMaximumViewsMethod = SpeakerServiceGrpc.getFindMaximumViewsMethod) == null) {
      synchronized (SpeakerServiceGrpc.class) {
        if ((getFindMaximumViewsMethod = SpeakerServiceGrpc.getFindMaximumViewsMethod) == null) {
          SpeakerServiceGrpc.getFindMaximumViewsMethod = getFindMaximumViewsMethod = 
              io.grpc.MethodDescriptor.<org.example.speaker.FindMaximumRequest, org.example.speaker.FindMaximumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "speaker.SpeakerService", "FindMaximumViews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.speaker.FindMaximumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.speaker.FindMaximumResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeakerServiceMethodDescriptorSupplier("FindMaximumViews"))
                  .build();
          }
        }
     }
     return getFindMaximumViewsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpeakerServiceStub newStub(io.grpc.Channel channel) {
    return new SpeakerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpeakerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SpeakerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpeakerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SpeakerServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The speaker service definition.
   * </pre>
   */
  public static abstract class SpeakerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public void speakerOn(org.example.speaker.SpeakerRequest request,
        io.grpc.stub.StreamObserver<org.example.speaker.SpeakerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSpeakerOnMethod(), responseObserver);
    }

    /**
     */
    public void speakerOff(org.example.speaker.SpeakerRequest request,
        io.grpc.stub.StreamObserver<org.example.speaker.SpeakerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSpeakerOffMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.speaker.DeviceRequest> connectDevice(
        io.grpc.stub.StreamObserver<org.example.speaker.DeviceResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getConnectDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.speaker.AverageRequest> averageViews(
        io.grpc.stub.StreamObserver<org.example.speaker.AverageResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAverageViewsMethod(), responseObserver);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.speaker.FindMaximumRequest> findMaximumViews(
        io.grpc.stub.StreamObserver<org.example.speaker.FindMaximumResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFindMaximumViewsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSpeakerOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.speaker.SpeakerRequest,
                org.example.speaker.SpeakerResponse>(
                  this, METHODID_SPEAKER_ON)))
          .addMethod(
            getSpeakerOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.speaker.SpeakerRequest,
                org.example.speaker.SpeakerResponse>(
                  this, METHODID_SPEAKER_OFF)))
          .addMethod(
            getConnectDeviceMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.example.speaker.DeviceRequest,
                org.example.speaker.DeviceResponse>(
                  this, METHODID_CONNECT_DEVICE)))
          .addMethod(
            getAverageViewsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.example.speaker.AverageRequest,
                org.example.speaker.AverageResponse>(
                  this, METHODID_AVERAGE_VIEWS)))
          .addMethod(
            getFindMaximumViewsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.example.speaker.FindMaximumRequest,
                org.example.speaker.FindMaximumResponse>(
                  this, METHODID_FIND_MAXIMUM_VIEWS)))
          .build();
    }
  }

  /**
   * <pre>
   * The speaker service definition.
   * </pre>
   */
  public static final class SpeakerServiceStub extends io.grpc.stub.AbstractStub<SpeakerServiceStub> {
    private SpeakerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeakerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeakerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeakerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public void speakerOn(org.example.speaker.SpeakerRequest request,
        io.grpc.stub.StreamObserver<org.example.speaker.SpeakerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSpeakerOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void speakerOff(org.example.speaker.SpeakerRequest request,
        io.grpc.stub.StreamObserver<org.example.speaker.SpeakerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSpeakerOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.speaker.DeviceRequest> connectDevice(
        io.grpc.stub.StreamObserver<org.example.speaker.DeviceResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getConnectDeviceMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.speaker.AverageRequest> averageViews(
        io.grpc.stub.StreamObserver<org.example.speaker.AverageResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAverageViewsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.speaker.FindMaximumRequest> findMaximumViews(
        io.grpc.stub.StreamObserver<org.example.speaker.FindMaximumResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFindMaximumViewsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The speaker service definition.
   * </pre>
   */
  public static final class SpeakerServiceBlockingStub extends io.grpc.stub.AbstractStub<SpeakerServiceBlockingStub> {
    private SpeakerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeakerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeakerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeakerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public org.example.speaker.SpeakerResponse speakerOn(org.example.speaker.SpeakerRequest request) {
      return blockingUnaryCall(
          getChannel(), getSpeakerOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.speaker.SpeakerResponse speakerOff(org.example.speaker.SpeakerRequest request) {
      return blockingUnaryCall(
          getChannel(), getSpeakerOffMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The speaker service definition.
   * </pre>
   */
  public static final class SpeakerServiceFutureStub extends io.grpc.stub.AbstractStub<SpeakerServiceFutureStub> {
    private SpeakerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeakerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeakerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeakerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.speaker.SpeakerResponse> speakerOn(
        org.example.speaker.SpeakerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSpeakerOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.speaker.SpeakerResponse> speakerOff(
        org.example.speaker.SpeakerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSpeakerOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SPEAKER_ON = 0;
  private static final int METHODID_SPEAKER_OFF = 1;
  private static final int METHODID_CONNECT_DEVICE = 2;
  private static final int METHODID_AVERAGE_VIEWS = 3;
  private static final int METHODID_FIND_MAXIMUM_VIEWS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SpeakerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SpeakerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SPEAKER_ON:
          serviceImpl.speakerOn((org.example.speaker.SpeakerRequest) request,
              (io.grpc.stub.StreamObserver<org.example.speaker.SpeakerResponse>) responseObserver);
          break;
        case METHODID_SPEAKER_OFF:
          serviceImpl.speakerOff((org.example.speaker.SpeakerRequest) request,
              (io.grpc.stub.StreamObserver<org.example.speaker.SpeakerResponse>) responseObserver);
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
        case METHODID_CONNECT_DEVICE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.connectDevice(
              (io.grpc.stub.StreamObserver<org.example.speaker.DeviceResponse>) responseObserver);
        case METHODID_AVERAGE_VIEWS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.averageViews(
              (io.grpc.stub.StreamObserver<org.example.speaker.AverageResponse>) responseObserver);
        case METHODID_FIND_MAXIMUM_VIEWS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.findMaximumViews(
              (io.grpc.stub.StreamObserver<org.example.speaker.FindMaximumResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SpeakerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SpeakerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.speaker.SpeakerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SpeakerService");
    }
  }

  private static final class SpeakerServiceFileDescriptorSupplier
      extends SpeakerServiceBaseDescriptorSupplier {
    SpeakerServiceFileDescriptorSupplier() {}
  }

  private static final class SpeakerServiceMethodDescriptorSupplier
      extends SpeakerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SpeakerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SpeakerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SpeakerServiceFileDescriptorSupplier())
              .addMethod(getSpeakerOnMethod())
              .addMethod(getSpeakerOffMethod())
              .addMethod(getConnectDeviceMethod())
              .addMethod(getAverageViewsMethod())
              .addMethod(getFindMaximumViewsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
