package org.example.recommender;

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
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: recommender.proto")
public final class MovieRecommenderGrpc {

  private MovieRecommenderGrpc() {}

  public static final String SERVICE_NAME = "recommender.MovieRecommender";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.recommender.Profile,
      org.example.recommender.Recommendations> getRecommendMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecommendMovie",
      requestType = org.example.recommender.Profile.class,
      responseType = org.example.recommender.Recommendations.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.recommender.Profile,
      org.example.recommender.Recommendations> getRecommendMovieMethod() {
    io.grpc.MethodDescriptor<org.example.recommender.Profile, org.example.recommender.Recommendations> getRecommendMovieMethod;
    if ((getRecommendMovieMethod = MovieRecommenderGrpc.getRecommendMovieMethod) == null) {
      synchronized (MovieRecommenderGrpc.class) {
        if ((getRecommendMovieMethod = MovieRecommenderGrpc.getRecommendMovieMethod) == null) {
          MovieRecommenderGrpc.getRecommendMovieMethod = getRecommendMovieMethod = 
              io.grpc.MethodDescriptor.<org.example.recommender.Profile, org.example.recommender.Recommendations>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "recommender.MovieRecommender", "RecommendMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.recommender.Profile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.recommender.Recommendations.getDefaultInstance()))
                  .setSchemaDescriptor(new MovieRecommenderMethodDescriptorSupplier("RecommendMovie"))
                  .build();
          }
        }
     }
     return getRecommendMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.recommender.Recommendations> getGetAllMoviesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllMovies",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.recommender.Recommendations.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.recommender.Recommendations> getGetAllMoviesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.recommender.Recommendations> getGetAllMoviesMethod;
    if ((getGetAllMoviesMethod = MovieRecommenderGrpc.getGetAllMoviesMethod) == null) {
      synchronized (MovieRecommenderGrpc.class) {
        if ((getGetAllMoviesMethod = MovieRecommenderGrpc.getGetAllMoviesMethod) == null) {
          MovieRecommenderGrpc.getGetAllMoviesMethod = getGetAllMoviesMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.recommender.Recommendations>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "recommender.MovieRecommender", "getAllMovies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.recommender.Recommendations.getDefaultInstance()))
                  .setSchemaDescriptor(new MovieRecommenderMethodDescriptorSupplier("getAllMovies"))
                  .build();
          }
        }
     }
     return getGetAllMoviesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.recommender.Movie> getStreamNewMoviesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamNewMovies",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.recommender.Movie.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.recommender.Movie> getStreamNewMoviesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.recommender.Movie> getStreamNewMoviesMethod;
    if ((getStreamNewMoviesMethod = MovieRecommenderGrpc.getStreamNewMoviesMethod) == null) {
      synchronized (MovieRecommenderGrpc.class) {
        if ((getStreamNewMoviesMethod = MovieRecommenderGrpc.getStreamNewMoviesMethod) == null) {
          MovieRecommenderGrpc.getStreamNewMoviesMethod = getStreamNewMoviesMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.recommender.Movie>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "recommender.MovieRecommender", "streamNewMovies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.recommender.Movie.getDefaultInstance()))
                  .setSchemaDescriptor(new MovieRecommenderMethodDescriptorSupplier("streamNewMovies"))
                  .build();
          }
        }
     }
     return getStreamNewMoviesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MovieRecommenderStub newStub(io.grpc.Channel channel) {
    return new MovieRecommenderStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MovieRecommenderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MovieRecommenderBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MovieRecommenderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MovieRecommenderFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class MovieRecommenderImplBase implements io.grpc.BindableService {

    /**
     */
    public void recommendMovie(org.example.recommender.Profile request,
        io.grpc.stub.StreamObserver<org.example.recommender.Recommendations> responseObserver) {
      asyncUnimplementedUnaryCall(getRecommendMovieMethod(), responseObserver);
    }

    /**
     */
    public void getAllMovies(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.recommender.Recommendations> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMoviesMethod(), responseObserver);
    }

    /**
     */
    public void streamNewMovies(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.recommender.Movie> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamNewMoviesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRecommendMovieMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.recommender.Profile,
                org.example.recommender.Recommendations>(
                  this, METHODID_RECOMMEND_MOVIE)))
          .addMethod(
            getGetAllMoviesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.recommender.Recommendations>(
                  this, METHODID_GET_ALL_MOVIES)))
          .addMethod(
            getStreamNewMoviesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.recommender.Movie>(
                  this, METHODID_STREAM_NEW_MOVIES)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class MovieRecommenderStub extends io.grpc.stub.AbstractStub<MovieRecommenderStub> {
    private MovieRecommenderStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MovieRecommenderStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieRecommenderStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MovieRecommenderStub(channel, callOptions);
    }

    /**
     */
    public void recommendMovie(org.example.recommender.Profile request,
        io.grpc.stub.StreamObserver<org.example.recommender.Recommendations> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRecommendMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllMovies(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.recommender.Recommendations> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllMoviesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamNewMovies(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.recommender.Movie> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStreamNewMoviesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class MovieRecommenderBlockingStub extends io.grpc.stub.AbstractStub<MovieRecommenderBlockingStub> {
    private MovieRecommenderBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MovieRecommenderBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieRecommenderBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MovieRecommenderBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.recommender.Recommendations recommendMovie(org.example.recommender.Profile request) {
      return blockingUnaryCall(
          getChannel(), getRecommendMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.recommender.Recommendations getAllMovies(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllMoviesMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.example.recommender.Movie> streamNewMovies(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getStreamNewMoviesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class MovieRecommenderFutureStub extends io.grpc.stub.AbstractStub<MovieRecommenderFutureStub> {
    private MovieRecommenderFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MovieRecommenderFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieRecommenderFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MovieRecommenderFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.recommender.Recommendations> recommendMovie(
        org.example.recommender.Profile request) {
      return futureUnaryCall(
          getChannel().newCall(getRecommendMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.recommender.Recommendations> getAllMovies(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllMoviesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECOMMEND_MOVIE = 0;
  private static final int METHODID_GET_ALL_MOVIES = 1;
  private static final int METHODID_STREAM_NEW_MOVIES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MovieRecommenderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MovieRecommenderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECOMMEND_MOVIE:
          serviceImpl.recommendMovie((org.example.recommender.Profile) request,
              (io.grpc.stub.StreamObserver<org.example.recommender.Recommendations>) responseObserver);
          break;
        case METHODID_GET_ALL_MOVIES:
          serviceImpl.getAllMovies((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.recommender.Recommendations>) responseObserver);
          break;
        case METHODID_STREAM_NEW_MOVIES:
          serviceImpl.streamNewMovies((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.recommender.Movie>) responseObserver);
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

  private static abstract class MovieRecommenderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MovieRecommenderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.recommender.RecommenderProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MovieRecommender");
    }
  }

  private static final class MovieRecommenderFileDescriptorSupplier
      extends MovieRecommenderBaseDescriptorSupplier {
    MovieRecommenderFileDescriptorSupplier() {}
  }

  private static final class MovieRecommenderMethodDescriptorSupplier
      extends MovieRecommenderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MovieRecommenderMethodDescriptorSupplier(String methodName) {
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
      synchronized (MovieRecommenderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MovieRecommenderFileDescriptorSupplier())
              .addMethod(getRecommendMovieMethod())
              .addMethod(getGetAllMoviesMethod())
              .addMethod(getStreamNewMoviesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
