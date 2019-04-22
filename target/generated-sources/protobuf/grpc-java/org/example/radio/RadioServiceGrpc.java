package org.example.radio;

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
 * The radio service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: radio.proto")
public final class RadioServiceGrpc {

  private RadioServiceGrpc() {}

  public static final String SERVICE_NAME = "radio.RadioService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.radio.RadioRequest,
      org.example.radio.RadioResponse> getRadioOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RadioOn",
      requestType = org.example.radio.RadioRequest.class,
      responseType = org.example.radio.RadioResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.radio.RadioRequest,
      org.example.radio.RadioResponse> getRadioOnMethod() {
    io.grpc.MethodDescriptor<org.example.radio.RadioRequest, org.example.radio.RadioResponse> getRadioOnMethod;
    if ((getRadioOnMethod = RadioServiceGrpc.getRadioOnMethod) == null) {
      synchronized (RadioServiceGrpc.class) {
        if ((getRadioOnMethod = RadioServiceGrpc.getRadioOnMethod) == null) {
          RadioServiceGrpc.getRadioOnMethod = getRadioOnMethod = 
              io.grpc.MethodDescriptor.<org.example.radio.RadioRequest, org.example.radio.RadioResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "radio.RadioService", "RadioOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.radio.RadioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.radio.RadioResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadioServiceMethodDescriptorSupplier("RadioOn"))
                  .build();
          }
        }
     }
     return getRadioOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.radio.RadioRequest,
      org.example.radio.RadioResponse> getRadioOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RadioOff",
      requestType = org.example.radio.RadioRequest.class,
      responseType = org.example.radio.RadioResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.radio.RadioRequest,
      org.example.radio.RadioResponse> getRadioOffMethod() {
    io.grpc.MethodDescriptor<org.example.radio.RadioRequest, org.example.radio.RadioResponse> getRadioOffMethod;
    if ((getRadioOffMethod = RadioServiceGrpc.getRadioOffMethod) == null) {
      synchronized (RadioServiceGrpc.class) {
        if ((getRadioOffMethod = RadioServiceGrpc.getRadioOffMethod) == null) {
          RadioServiceGrpc.getRadioOffMethod = getRadioOffMethod = 
              io.grpc.MethodDescriptor.<org.example.radio.RadioRequest, org.example.radio.RadioResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "radio.RadioService", "RadioOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.radio.RadioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.radio.RadioResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadioServiceMethodDescriptorSupplier("RadioOff"))
                  .build();
          }
        }
     }
     return getRadioOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.radio.ChannelRequest,
      org.example.radio.ChannelResponse> getChannel1Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Channel1",
      requestType = org.example.radio.ChannelRequest.class,
      responseType = org.example.radio.ChannelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.radio.ChannelRequest,
      org.example.radio.ChannelResponse> getChannel1Method() {
    io.grpc.MethodDescriptor<org.example.radio.ChannelRequest, org.example.radio.ChannelResponse> getChannel1Method;
    if ((getChannel1Method = RadioServiceGrpc.getChannel1Method) == null) {
      synchronized (RadioServiceGrpc.class) {
        if ((getChannel1Method = RadioServiceGrpc.getChannel1Method) == null) {
          RadioServiceGrpc.getChannel1Method = getChannel1Method = 
              io.grpc.MethodDescriptor.<org.example.radio.ChannelRequest, org.example.radio.ChannelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "radio.RadioService", "Channel1"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.radio.ChannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.radio.ChannelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadioServiceMethodDescriptorSupplier("Channel1"))
                  .build();
          }
        }
     }
     return getChannel1Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.radio.ChannelRequest,
      org.example.radio.ChannelResponse> getChannel2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Channel2",
      requestType = org.example.radio.ChannelRequest.class,
      responseType = org.example.radio.ChannelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.radio.ChannelRequest,
      org.example.radio.ChannelResponse> getChannel2Method() {
    io.grpc.MethodDescriptor<org.example.radio.ChannelRequest, org.example.radio.ChannelResponse> getChannel2Method;
    if ((getChannel2Method = RadioServiceGrpc.getChannel2Method) == null) {
      synchronized (RadioServiceGrpc.class) {
        if ((getChannel2Method = RadioServiceGrpc.getChannel2Method) == null) {
          RadioServiceGrpc.getChannel2Method = getChannel2Method = 
              io.grpc.MethodDescriptor.<org.example.radio.ChannelRequest, org.example.radio.ChannelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "radio.RadioService", "Channel2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.radio.ChannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.radio.ChannelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadioServiceMethodDescriptorSupplier("Channel2"))
                  .build();
          }
        }
     }
     return getChannel2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.radio.ChannelRequest,
      org.example.radio.ChannelResponse> getChannel3Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Channel3",
      requestType = org.example.radio.ChannelRequest.class,
      responseType = org.example.radio.ChannelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.radio.ChannelRequest,
      org.example.radio.ChannelResponse> getChannel3Method() {
    io.grpc.MethodDescriptor<org.example.radio.ChannelRequest, org.example.radio.ChannelResponse> getChannel3Method;
    if ((getChannel3Method = RadioServiceGrpc.getChannel3Method) == null) {
      synchronized (RadioServiceGrpc.class) {
        if ((getChannel3Method = RadioServiceGrpc.getChannel3Method) == null) {
          RadioServiceGrpc.getChannel3Method = getChannel3Method = 
              io.grpc.MethodDescriptor.<org.example.radio.ChannelRequest, org.example.radio.ChannelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "radio.RadioService", "Channel3"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.radio.ChannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.radio.ChannelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadioServiceMethodDescriptorSupplier("Channel3"))
                  .build();
          }
        }
     }
     return getChannel3Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.radio.ChannelRequest,
      org.example.radio.ChannelResponse> getChannel4Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Channel4",
      requestType = org.example.radio.ChannelRequest.class,
      responseType = org.example.radio.ChannelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.radio.ChannelRequest,
      org.example.radio.ChannelResponse> getChannel4Method() {
    io.grpc.MethodDescriptor<org.example.radio.ChannelRequest, org.example.radio.ChannelResponse> getChannel4Method;
    if ((getChannel4Method = RadioServiceGrpc.getChannel4Method) == null) {
      synchronized (RadioServiceGrpc.class) {
        if ((getChannel4Method = RadioServiceGrpc.getChannel4Method) == null) {
          RadioServiceGrpc.getChannel4Method = getChannel4Method = 
              io.grpc.MethodDescriptor.<org.example.radio.ChannelRequest, org.example.radio.ChannelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "radio.RadioService", "Channel4"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.radio.ChannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.radio.ChannelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadioServiceMethodDescriptorSupplier("Channel4"))
                  .build();
          }
        }
     }
     return getChannel4Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.radio.VolumeUpResponse> getVolumeUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VolumeUp",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.radio.VolumeUpResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.radio.VolumeUpResponse> getVolumeUpMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.radio.VolumeUpResponse> getVolumeUpMethod;
    if ((getVolumeUpMethod = RadioServiceGrpc.getVolumeUpMethod) == null) {
      synchronized (RadioServiceGrpc.class) {
        if ((getVolumeUpMethod = RadioServiceGrpc.getVolumeUpMethod) == null) {
          RadioServiceGrpc.getVolumeUpMethod = getVolumeUpMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.radio.VolumeUpResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "radio.RadioService", "VolumeUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.radio.VolumeUpResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadioServiceMethodDescriptorSupplier("VolumeUp"))
                  .build();
          }
        }
     }
     return getVolumeUpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.radio.VolumeDownResponse> getVolumeDownMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VolumeDown",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.radio.VolumeDownResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.radio.VolumeDownResponse> getVolumeDownMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.radio.VolumeDownResponse> getVolumeDownMethod;
    if ((getVolumeDownMethod = RadioServiceGrpc.getVolumeDownMethod) == null) {
      synchronized (RadioServiceGrpc.class) {
        if ((getVolumeDownMethod = RadioServiceGrpc.getVolumeDownMethod) == null) {
          RadioServiceGrpc.getVolumeDownMethod = getVolumeDownMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.radio.VolumeDownResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "radio.RadioService", "VolumeDown"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.radio.VolumeDownResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadioServiceMethodDescriptorSupplier("VolumeDown"))
                  .build();
          }
        }
     }
     return getVolumeDownMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RadioServiceStub newStub(io.grpc.Channel channel) {
    return new RadioServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RadioServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RadioServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RadioServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RadioServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The radio service definition.
   * </pre>
   */
  public static abstract class RadioServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public void radioOn(org.example.radio.RadioRequest request,
        io.grpc.stub.StreamObserver<org.example.radio.RadioResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRadioOnMethod(), responseObserver);
    }

    /**
     */
    public void radioOff(org.example.radio.RadioRequest request,
        io.grpc.stub.StreamObserver<org.example.radio.RadioResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRadioOffMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.radio.ChannelRequest> channel1(
        io.grpc.stub.StreamObserver<org.example.radio.ChannelResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getChannel1Method(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.radio.ChannelRequest> channel2(
        io.grpc.stub.StreamObserver<org.example.radio.ChannelResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getChannel2Method(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.radio.ChannelRequest> channel3(
        io.grpc.stub.StreamObserver<org.example.radio.ChannelResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getChannel3Method(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.radio.ChannelRequest> channel4(
        io.grpc.stub.StreamObserver<org.example.radio.ChannelResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getChannel4Method(), responseObserver);
    }

    /**
     */
    public void volumeUp(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.radio.VolumeUpResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVolumeUpMethod(), responseObserver);
    }

    /**
     */
    public void volumeDown(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.radio.VolumeDownResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVolumeDownMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRadioOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.radio.RadioRequest,
                org.example.radio.RadioResponse>(
                  this, METHODID_RADIO_ON)))
          .addMethod(
            getRadioOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.radio.RadioRequest,
                org.example.radio.RadioResponse>(
                  this, METHODID_RADIO_OFF)))
          .addMethod(
            getChannel1Method(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.example.radio.ChannelRequest,
                org.example.radio.ChannelResponse>(
                  this, METHODID_CHANNEL1)))
          .addMethod(
            getChannel2Method(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.example.radio.ChannelRequest,
                org.example.radio.ChannelResponse>(
                  this, METHODID_CHANNEL2)))
          .addMethod(
            getChannel3Method(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.example.radio.ChannelRequest,
                org.example.radio.ChannelResponse>(
                  this, METHODID_CHANNEL3)))
          .addMethod(
            getChannel4Method(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.example.radio.ChannelRequest,
                org.example.radio.ChannelResponse>(
                  this, METHODID_CHANNEL4)))
          .addMethod(
            getVolumeUpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.radio.VolumeUpResponse>(
                  this, METHODID_VOLUME_UP)))
          .addMethod(
            getVolumeDownMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.radio.VolumeDownResponse>(
                  this, METHODID_VOLUME_DOWN)))
          .build();
    }
  }

  /**
   * <pre>
   * The radio service definition.
   * </pre>
   */
  public static final class RadioServiceStub extends io.grpc.stub.AbstractStub<RadioServiceStub> {
    private RadioServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadioServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadioServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadioServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public void radioOn(org.example.radio.RadioRequest request,
        io.grpc.stub.StreamObserver<org.example.radio.RadioResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRadioOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void radioOff(org.example.radio.RadioRequest request,
        io.grpc.stub.StreamObserver<org.example.radio.RadioResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRadioOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.radio.ChannelRequest> channel1(
        io.grpc.stub.StreamObserver<org.example.radio.ChannelResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getChannel1Method(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.radio.ChannelRequest> channel2(
        io.grpc.stub.StreamObserver<org.example.radio.ChannelResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getChannel2Method(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.radio.ChannelRequest> channel3(
        io.grpc.stub.StreamObserver<org.example.radio.ChannelResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getChannel3Method(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.radio.ChannelRequest> channel4(
        io.grpc.stub.StreamObserver<org.example.radio.ChannelResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getChannel4Method(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void volumeUp(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.radio.VolumeUpResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVolumeUpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void volumeDown(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.radio.VolumeDownResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVolumeDownMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The radio service definition.
   * </pre>
   */
  public static final class RadioServiceBlockingStub extends io.grpc.stub.AbstractStub<RadioServiceBlockingStub> {
    private RadioServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadioServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadioServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadioServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public org.example.radio.RadioResponse radioOn(org.example.radio.RadioRequest request) {
      return blockingUnaryCall(
          getChannel(), getRadioOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.radio.RadioResponse radioOff(org.example.radio.RadioRequest request) {
      return blockingUnaryCall(
          getChannel(), getRadioOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.radio.VolumeUpResponse volumeUp(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getVolumeUpMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.radio.VolumeDownResponse volumeDown(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getVolumeDownMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The radio service definition.
   * </pre>
   */
  public static final class RadioServiceFutureStub extends io.grpc.stub.AbstractStub<RadioServiceFutureStub> {
    private RadioServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadioServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadioServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadioServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.radio.RadioResponse> radioOn(
        org.example.radio.RadioRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRadioOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.radio.RadioResponse> radioOff(
        org.example.radio.RadioRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRadioOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.radio.VolumeUpResponse> volumeUp(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getVolumeUpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.radio.VolumeDownResponse> volumeDown(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getVolumeDownMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RADIO_ON = 0;
  private static final int METHODID_RADIO_OFF = 1;
  private static final int METHODID_VOLUME_UP = 2;
  private static final int METHODID_VOLUME_DOWN = 3;
  private static final int METHODID_CHANNEL1 = 4;
  private static final int METHODID_CHANNEL2 = 5;
  private static final int METHODID_CHANNEL3 = 6;
  private static final int METHODID_CHANNEL4 = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RadioServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RadioServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RADIO_ON:
          serviceImpl.radioOn((org.example.radio.RadioRequest) request,
              (io.grpc.stub.StreamObserver<org.example.radio.RadioResponse>) responseObserver);
          break;
        case METHODID_RADIO_OFF:
          serviceImpl.radioOff((org.example.radio.RadioRequest) request,
              (io.grpc.stub.StreamObserver<org.example.radio.RadioResponse>) responseObserver);
          break;
        case METHODID_VOLUME_UP:
          serviceImpl.volumeUp((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.radio.VolumeUpResponse>) responseObserver);
          break;
        case METHODID_VOLUME_DOWN:
          serviceImpl.volumeDown((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.radio.VolumeDownResponse>) responseObserver);
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
        case METHODID_CHANNEL1:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.channel1(
              (io.grpc.stub.StreamObserver<org.example.radio.ChannelResponse>) responseObserver);
        case METHODID_CHANNEL2:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.channel2(
              (io.grpc.stub.StreamObserver<org.example.radio.ChannelResponse>) responseObserver);
        case METHODID_CHANNEL3:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.channel3(
              (io.grpc.stub.StreamObserver<org.example.radio.ChannelResponse>) responseObserver);
        case METHODID_CHANNEL4:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.channel4(
              (io.grpc.stub.StreamObserver<org.example.radio.ChannelResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RadioServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RadioServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.radio.RadioProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RadioService");
    }
  }

  private static final class RadioServiceFileDescriptorSupplier
      extends RadioServiceBaseDescriptorSupplier {
    RadioServiceFileDescriptorSupplier() {}
  }

  private static final class RadioServiceMethodDescriptorSupplier
      extends RadioServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RadioServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RadioServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RadioServiceFileDescriptorSupplier())
              .addMethod(getRadioOnMethod())
              .addMethod(getRadioOffMethod())
              .addMethod(getChannel1Method())
              .addMethod(getChannel2Method())
              .addMethod(getChannel3Method())
              .addMethod(getChannel4Method())
              .addMethod(getVolumeUpMethod())
              .addMethod(getVolumeDownMethod())
              .build();
        }
      }
    }
    return result;
  }
}
