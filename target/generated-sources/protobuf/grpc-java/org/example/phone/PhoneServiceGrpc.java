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

  private static volatile io.grpc.MethodDescriptor<org.example.phone.PhoneRequest,
      org.example.phone.PhoneResponse> getPauseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pause",
      requestType = org.example.phone.PhoneRequest.class,
      responseType = org.example.phone.PhoneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.phone.PhoneRequest,
      org.example.phone.PhoneResponse> getPauseMethod() {
    io.grpc.MethodDescriptor<org.example.phone.PhoneRequest, org.example.phone.PhoneResponse> getPauseMethod;
    if ((getPauseMethod = PhoneServiceGrpc.getPauseMethod) == null) {
      synchronized (PhoneServiceGrpc.class) {
        if ((getPauseMethod = PhoneServiceGrpc.getPauseMethod) == null) {
          PhoneServiceGrpc.getPauseMethod = getPauseMethod = 
              io.grpc.MethodDescriptor.<org.example.phone.PhoneRequest, org.example.phone.PhoneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "phone.PhoneService", "Pause"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.phone.PhoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.phone.PhoneResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PhoneServiceMethodDescriptorSupplier("Pause"))
                  .build();
          }
        }
     }
     return getPauseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.phone.BluetoothRequest,
      org.example.phone.BluetoothResponse> getBluetoothMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Bluetooth",
      requestType = org.example.phone.BluetoothRequest.class,
      responseType = org.example.phone.BluetoothResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.phone.BluetoothRequest,
      org.example.phone.BluetoothResponse> getBluetoothMethod() {
    io.grpc.MethodDescriptor<org.example.phone.BluetoothRequest, org.example.phone.BluetoothResponse> getBluetoothMethod;
    if ((getBluetoothMethod = PhoneServiceGrpc.getBluetoothMethod) == null) {
      synchronized (PhoneServiceGrpc.class) {
        if ((getBluetoothMethod = PhoneServiceGrpc.getBluetoothMethod) == null) {
          PhoneServiceGrpc.getBluetoothMethod = getBluetoothMethod = 
              io.grpc.MethodDescriptor.<org.example.phone.BluetoothRequest, org.example.phone.BluetoothResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "phone.PhoneService", "Bluetooth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.phone.BluetoothRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.phone.BluetoothResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PhoneServiceMethodDescriptorSupplier("Bluetooth"))
                  .build();
          }
        }
     }
     return getBluetoothMethod;
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

  private static volatile io.grpc.MethodDescriptor<org.example.phone.VolumeUpRequest,
      org.example.phone.VolumeUpResponse> getVolumeUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VolumeUp",
      requestType = org.example.phone.VolumeUpRequest.class,
      responseType = org.example.phone.VolumeUpResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.phone.VolumeUpRequest,
      org.example.phone.VolumeUpResponse> getVolumeUpMethod() {
    io.grpc.MethodDescriptor<org.example.phone.VolumeUpRequest, org.example.phone.VolumeUpResponse> getVolumeUpMethod;
    if ((getVolumeUpMethod = PhoneServiceGrpc.getVolumeUpMethod) == null) {
      synchronized (PhoneServiceGrpc.class) {
        if ((getVolumeUpMethod = PhoneServiceGrpc.getVolumeUpMethod) == null) {
          PhoneServiceGrpc.getVolumeUpMethod = getVolumeUpMethod = 
              io.grpc.MethodDescriptor.<org.example.phone.VolumeUpRequest, org.example.phone.VolumeUpResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "phone.PhoneService", "VolumeUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.phone.VolumeUpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.phone.VolumeUpResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PhoneServiceMethodDescriptorSupplier("VolumeUp"))
                  .build();
          }
        }
     }
     return getVolumeUpMethod;
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
    public void pause(org.example.phone.PhoneRequest request,
        io.grpc.stub.StreamObserver<org.example.phone.PhoneResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPauseMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.phone.BluetoothRequest> bluetooth(
        io.grpc.stub.StreamObserver<org.example.phone.BluetoothResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBluetoothMethod(), responseObserver);
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
     */
    public void volumeUp(org.example.phone.VolumeUpRequest request,
        io.grpc.stub.StreamObserver<org.example.phone.VolumeUpResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVolumeUpMethod(), responseObserver);
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
            getPauseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.phone.PhoneRequest,
                org.example.phone.PhoneResponse>(
                  this, METHODID_PAUSE)))
          .addMethod(
            getBluetoothMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.example.phone.BluetoothRequest,
                org.example.phone.BluetoothResponse>(
                  this, METHODID_BLUETOOTH)))
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
            getVolumeUpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.phone.VolumeUpRequest,
                org.example.phone.VolumeUpResponse>(
                  this, METHODID_VOLUME_UP)))
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
    public void pause(org.example.phone.PhoneRequest request,
        io.grpc.stub.StreamObserver<org.example.phone.PhoneResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPauseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.phone.BluetoothRequest> bluetooth(
        io.grpc.stub.StreamObserver<org.example.phone.BluetoothResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getBluetoothMethod(), getCallOptions()), responseObserver);
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
     */
    public void volumeUp(org.example.phone.VolumeUpRequest request,
        io.grpc.stub.StreamObserver<org.example.phone.VolumeUpResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVolumeUpMethod(), getCallOptions()), request, responseObserver);
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
    public org.example.phone.PhoneResponse pause(org.example.phone.PhoneRequest request) {
      return blockingUnaryCall(
          getChannel(), getPauseMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.phone.PlaylistSongs getAllSongs(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllSongsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.phone.VolumeUpResponse volumeUp(org.example.phone.VolumeUpRequest request) {
      return blockingUnaryCall(
          getChannel(), getVolumeUpMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.example.phone.PhoneResponse> pause(
        org.example.phone.PhoneRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPauseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.phone.PlaylistSongs> getAllSongs(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllSongsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.phone.VolumeUpResponse> volumeUp(
        org.example.phone.VolumeUpRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getVolumeUpMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PHONE_ON = 0;
  private static final int METHODID_PHONE_OFF = 1;
  private static final int METHODID_PAUSE = 2;
  private static final int METHODID_GET_ALL_SONGS = 3;
  private static final int METHODID_VOLUME_UP = 4;
  private static final int METHODID_BLUETOOTH = 5;
  private static final int METHODID_CONNECT_DEVICE = 6;

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
        case METHODID_PAUSE:
          serviceImpl.pause((org.example.phone.PhoneRequest) request,
              (io.grpc.stub.StreamObserver<org.example.phone.PhoneResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_SONGS:
          serviceImpl.getAllSongs((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.phone.PlaylistSongs>) responseObserver);
          break;
        case METHODID_VOLUME_UP:
          serviceImpl.volumeUp((org.example.phone.VolumeUpRequest) request,
              (io.grpc.stub.StreamObserver<org.example.phone.VolumeUpResponse>) responseObserver);
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
        case METHODID_BLUETOOTH:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bluetooth(
              (io.grpc.stub.StreamObserver<org.example.phone.BluetoothResponse>) responseObserver);
        case METHODID_CONNECT_DEVICE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.connectDevice(
              (io.grpc.stub.StreamObserver<org.example.phone.DeviceResponse>) responseObserver);
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
              .addMethod(getPauseMethod())
              .addMethod(getBluetoothMethod())
              .addMethod(getConnectDeviceMethod())
              .addMethod(getGetAllSongsMethod())
              .addMethod(getVolumeUpMethod())
              .build();
        }
      }
    }
    return result;
  }
}
