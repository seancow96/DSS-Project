package org.example.phone;

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
    comments = "Source: phone.proto")
public final class PhoneServiceGrpc {

  private PhoneServiceGrpc() {}

  public static final String SERVICE_NAME = "phone.PhoneService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.phone.PhoneRequest,
      org.example.phone.PhoneResponse> getPhoneOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PhoneOn",
      requestType = org.example.phone.PhoneRequest.class,
      responseType = org.example.phone.PhoneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.phone.PhoneRequest,
      org.example.phone.PhoneResponse> getPhoneOnMethod() {
    io.grpc.MethodDescriptor<org.example.phone.PhoneRequest, org.example.phone.PhoneResponse> getPhoneOnMethod;
    if ((getPhoneOnMethod = PhoneServiceGrpc.getPhoneOnMethod) == null) {
      synchronized (PhoneServiceGrpc.class) {
        if ((getPhoneOnMethod = PhoneServiceGrpc.getPhoneOnMethod) == null) {
          PhoneServiceGrpc.getPhoneOnMethod = getPhoneOnMethod = 
              io.grpc.MethodDescriptor.<org.example.phone.PhoneRequest, org.example.phone.PhoneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "phone.PhoneService", "PhoneOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.phone.PhoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.phone.PhoneResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PhoneServiceMethodDescriptorSupplier("PhoneOn"))
                  .build();
          }
        }
     }
     return getPhoneOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.phone.PhoneRequest,
      org.example.phone.PhoneResponse> getPhoneOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PhoneOff",
      requestType = org.example.phone.PhoneRequest.class,
      responseType = org.example.phone.PhoneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.phone.PhoneRequest,
      org.example.phone.PhoneResponse> getPhoneOffMethod() {
    io.grpc.MethodDescriptor<org.example.phone.PhoneRequest, org.example.phone.PhoneResponse> getPhoneOffMethod;
    if ((getPhoneOffMethod = PhoneServiceGrpc.getPhoneOffMethod) == null) {
      synchronized (PhoneServiceGrpc.class) {
        if ((getPhoneOffMethod = PhoneServiceGrpc.getPhoneOffMethod) == null) {
          PhoneServiceGrpc.getPhoneOffMethod = getPhoneOffMethod = 
              io.grpc.MethodDescriptor.<org.example.phone.PhoneRequest, org.example.phone.PhoneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "phone.PhoneService", "PhoneOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.phone.PhoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.phone.PhoneResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PhoneServiceMethodDescriptorSupplier("PhoneOff"))
                  .build();
          }
        }
     }
     return getPhoneOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.phone.DeviceRequest,
      org.example.phone.DeviceResponse> getConnectDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConnectDevice",
      requestType = org.example.phone.DeviceRequest.class,
      responseType = org.example.phone.DeviceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.phone.DeviceRequest,
      org.example.phone.DeviceResponse> getConnectDeviceMethod() {
    io.grpc.MethodDescriptor<org.example.phone.DeviceRequest, org.example.phone.DeviceResponse> getConnectDeviceMethod;
    if ((getConnectDeviceMethod = PhoneServiceGrpc.getConnectDeviceMethod) == null) {
      synchronized (PhoneServiceGrpc.class) {
        if ((getConnectDeviceMethod = PhoneServiceGrpc.getConnectDeviceMethod) == null) {
          PhoneServiceGrpc.getConnectDeviceMethod = getConnectDeviceMethod = 
              io.grpc.MethodDescriptor.<org.example.phone.DeviceRequest, org.example.phone.DeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "phone.PhoneService", "ConnectDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.phone.DeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.phone.DeviceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PhoneServiceMethodDescriptorSupplier("ConnectDevice"))
                  .build();
          }
        }
     }
     return getConnectDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.phone.PlaylistSongs> getGetAllSongsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllSongs",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.phone.PlaylistSongs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.phone.PlaylistSongs> getGetAllSongsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.phone.PlaylistSongs> getGetAllSongsMethod;
    if ((getGetAllSongsMethod = PhoneServiceGrpc.getGetAllSongsMethod) == null) {
      synchronized (PhoneServiceGrpc.class) {
        if ((getGetAllSongsMethod = PhoneServiceGrpc.getGetAllSongsMethod) == null) {
          PhoneServiceGrpc.getGetAllSongsMethod = getGetAllSongsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.phone.PlaylistSongs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "phone.PhoneService", "getAllSongs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.phone.PlaylistSongs.getDefaultInstance()))
                  .setSchemaDescriptor(new PhoneServiceMethodDescriptorSupplier("getAllSongs"))
                  .build();
          }
        }
     }
     return getGetAllSongsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.phone.AverageRequest,
      org.example.phone.AverageResponse> getAverageViewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AverageViews",
      requestType = org.example.phone.AverageRequest.class,
      responseType = org.example.phone.AverageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.phone.AverageRequest,
      org.example.phone.AverageResponse> getAverageViewsMethod() {
    io.grpc.MethodDescriptor<org.example.phone.AverageRequest, org.example.phone.AverageResponse> getAverageViewsMethod;
    if ((getAverageViewsMethod = PhoneServiceGrpc.getAverageViewsMethod) == null) {
      synchronized (PhoneServiceGrpc.class) {
        if ((getAverageViewsMethod = PhoneServiceGrpc.getAverageViewsMethod) == null) {
          PhoneServiceGrpc.getAverageViewsMethod = getAverageViewsMethod = 
              io.grpc.MethodDescriptor.<org.example.phone.AverageRequest, org.example.phone.AverageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "phone.PhoneService", "AverageViews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.phone.AverageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.phone.AverageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PhoneServiceMethodDescriptorSupplier("AverageViews"))
                  .build();
          }
        }
     }
     return getAverageViewsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.phone.FindMaximumRequest,
      org.example.phone.FindMaximumResponse> getFindMaximumViewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindMaximumViews",
      requestType = org.example.phone.FindMaximumRequest.class,
      responseType = org.example.phone.FindMaximumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.phone.FindMaximumRequest,
      org.example.phone.FindMaximumResponse> getFindMaximumViewsMethod() {
    io.grpc.MethodDescriptor<org.example.phone.FindMaximumRequest, org.example.phone.FindMaximumResponse> getFindMaximumViewsMethod;
    if ((getFindMaximumViewsMethod = PhoneServiceGrpc.getFindMaximumViewsMethod) == null) {
      synchronized (PhoneServiceGrpc.class) {
        if ((getFindMaximumViewsMethod = PhoneServiceGrpc.getFindMaximumViewsMethod) == null) {
          PhoneServiceGrpc.getFindMaximumViewsMethod = getFindMaximumViewsMethod = 
              io.grpc.MethodDescriptor.<org.example.phone.FindMaximumRequest, org.example.phone.FindMaximumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "phone.PhoneService", "FindMaximumViews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.phone.FindMaximumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.phone.FindMaximumResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PhoneServiceMethodDescriptorSupplier("FindMaximumViews"))
                  .build();
          }
        }
     }
     return getFindMaximumViewsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PhoneServiceStub newStub(io.grpc.Channel channel) {
    return new PhoneServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PhoneServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PhoneServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PhoneServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PhoneServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The speaker service definition.
   * </pre>
   */
  public static abstract class PhoneServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public void phoneOn(org.example.phone.PhoneRequest request,
        io.grpc.stub.StreamObserver<org.example.phone.PhoneResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPhoneOnMethod(), responseObserver);
    }

    /**
     */
    public void phoneOff(org.example.phone.PhoneRequest request,
        io.grpc.stub.StreamObserver<org.example.phone.PhoneResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPhoneOffMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.phone.DeviceRequest> connectDevice(
        io.grpc.stub.StreamObserver<org.example.phone.DeviceResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getConnectDeviceMethod(), responseObserver);
    }

    /**
     */
    public void getAllSongs(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.phone.PlaylistSongs> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllSongsMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.phone.AverageRequest> averageViews(
        io.grpc.stub.StreamObserver<org.example.phone.AverageResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAverageViewsMethod(), responseObserver);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.phone.FindMaximumRequest> findMaximumViews(
        io.grpc.stub.StreamObserver<org.example.phone.FindMaximumResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFindMaximumViewsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPhoneOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.phone.PhoneRequest,
                org.example.phone.PhoneResponse>(
                  this, METHODID_PHONE_ON)))
          .addMethod(
            getPhoneOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.phone.PhoneRequest,
                org.example.phone.PhoneResponse>(
                  this, METHODID_PHONE_OFF)))
          .addMethod(
            getConnectDeviceMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.example.phone.DeviceRequest,
                org.example.phone.DeviceResponse>(
                  this, METHODID_CONNECT_DEVICE)))
          .addMethod(
            getGetAllSongsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.phone.PlaylistSongs>(
                  this, METHODID_GET_ALL_SONGS)))
          .addMethod(
            getAverageViewsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.example.phone.AverageRequest,
                org.example.phone.AverageResponse>(
                  this, METHODID_AVERAGE_VIEWS)))
          .addMethod(
            getFindMaximumViewsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.example.phone.FindMaximumRequest,
                org.example.phone.FindMaximumResponse>(
                  this, METHODID_FIND_MAXIMUM_VIEWS)))
          .build();
    }
  }

  /**
   * <pre>
   * The speaker service definition.
   * </pre>
   */
  public static final class PhoneServiceStub extends io.grpc.stub.AbstractStub<PhoneServiceStub> {
    private PhoneServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PhoneServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PhoneServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PhoneServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public void phoneOn(org.example.phone.PhoneRequest request,
        io.grpc.stub.StreamObserver<org.example.phone.PhoneResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPhoneOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void phoneOff(org.example.phone.PhoneRequest request,
        io.grpc.stub.StreamObserver<org.example.phone.PhoneResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPhoneOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.phone.DeviceRequest> connectDevice(
        io.grpc.stub.StreamObserver<org.example.phone.DeviceResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getConnectDeviceMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getAllSongs(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.phone.PlaylistSongs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllSongsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.phone.AverageRequest> averageViews(
        io.grpc.stub.StreamObserver<org.example.phone.AverageResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAverageViewsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.phone.FindMaximumRequest> findMaximumViews(
        io.grpc.stub.StreamObserver<org.example.phone.FindMaximumResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFindMaximumViewsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The speaker service definition.
   * </pre>
   */
  public static final class PhoneServiceBlockingStub extends io.grpc.stub.AbstractStub<PhoneServiceBlockingStub> {
    private PhoneServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PhoneServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PhoneServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PhoneServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public org.example.phone.PhoneResponse phoneOn(org.example.phone.PhoneRequest request) {
      return blockingUnaryCall(
          getChannel(), getPhoneOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.phone.PhoneResponse phoneOff(org.example.phone.PhoneRequest request) {
      return blockingUnaryCall(
          getChannel(), getPhoneOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.phone.PlaylistSongs getAllSongs(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllSongsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The speaker service definition.
   * </pre>
   */
  public static final class PhoneServiceFutureStub extends io.grpc.stub.AbstractStub<PhoneServiceFutureStub> {
    private PhoneServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PhoneServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PhoneServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PhoneServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.phone.PhoneResponse> phoneOn(
        org.example.phone.PhoneRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPhoneOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.phone.PhoneResponse> phoneOff(
        org.example.phone.PhoneRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPhoneOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.phone.PlaylistSongs> getAllSongs(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllSongsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PHONE_ON = 0;
  private static final int METHODID_PHONE_OFF = 1;
  private static final int METHODID_GET_ALL_SONGS = 2;
  private static final int METHODID_CONNECT_DEVICE = 3;
  private static final int METHODID_AVERAGE_VIEWS = 4;
  private static final int METHODID_FIND_MAXIMUM_VIEWS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PhoneServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PhoneServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PHONE_ON:
          serviceImpl.phoneOn((org.example.phone.PhoneRequest) request,
              (io.grpc.stub.StreamObserver<org.example.phone.PhoneResponse>) responseObserver);
          break;
        case METHODID_PHONE_OFF:
          serviceImpl.phoneOff((org.example.phone.PhoneRequest) request,
              (io.grpc.stub.StreamObserver<org.example.phone.PhoneResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_SONGS:
          serviceImpl.getAllSongs((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.phone.PlaylistSongs>) responseObserver);
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
              (io.grpc.stub.StreamObserver<org.example.phone.DeviceResponse>) responseObserver);
        case METHODID_AVERAGE_VIEWS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.averageViews(
              (io.grpc.stub.StreamObserver<org.example.phone.AverageResponse>) responseObserver);
        case METHODID_FIND_MAXIMUM_VIEWS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.findMaximumViews(
              (io.grpc.stub.StreamObserver<org.example.phone.FindMaximumResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PhoneServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PhoneServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.phone.PhoneProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PhoneService");
    }
  }

  private static final class PhoneServiceFileDescriptorSupplier
      extends PhoneServiceBaseDescriptorSupplier {
    PhoneServiceFileDescriptorSupplier() {}
  }

  private static final class PhoneServiceMethodDescriptorSupplier
      extends PhoneServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PhoneServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PhoneServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PhoneServiceFileDescriptorSupplier())
              .addMethod(getPhoneOnMethod())
              .addMethod(getPhoneOffMethod())
              .addMethod(getConnectDeviceMethod())
              .addMethod(getGetAllSongsMethod())
              .addMethod(getAverageViewsMethod())
              .addMethod(getFindMaximumViewsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
