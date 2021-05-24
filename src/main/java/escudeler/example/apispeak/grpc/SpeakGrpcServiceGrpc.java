package escudeler.example.apispeak.grpc;

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
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: SpeakService.proto")
public final class SpeakGrpcServiceGrpc {

  private SpeakGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "SpeakGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<escudeler.example.apispeak.grpc.SpeakRequest,
      escudeler.example.apispeak.grpc.HelloResponse> getHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello",
      requestType = escudeler.example.apispeak.grpc.SpeakRequest.class,
      responseType = escudeler.example.apispeak.grpc.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<escudeler.example.apispeak.grpc.SpeakRequest,
      escudeler.example.apispeak.grpc.HelloResponse> getHelloMethod() {
    io.grpc.MethodDescriptor<escudeler.example.apispeak.grpc.SpeakRequest, escudeler.example.apispeak.grpc.HelloResponse> getHelloMethod;
    if ((getHelloMethod = SpeakGrpcServiceGrpc.getHelloMethod) == null) {
      synchronized (SpeakGrpcServiceGrpc.class) {
        if ((getHelloMethod = SpeakGrpcServiceGrpc.getHelloMethod) == null) {
          SpeakGrpcServiceGrpc.getHelloMethod = getHelloMethod = 
              io.grpc.MethodDescriptor.<escudeler.example.apispeak.grpc.SpeakRequest, escudeler.example.apispeak.grpc.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SpeakGrpcService", "hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escudeler.example.apispeak.grpc.SpeakRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escudeler.example.apispeak.grpc.HelloResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeakGrpcServiceMethodDescriptorSupplier("hello"))
                  .build();
          }
        }
     }
     return getHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<escudeler.example.apispeak.grpc.SpeakRequest,
      escudeler.example.apispeak.grpc.GoodbyeResponse> getGoodbyeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "goodbye",
      requestType = escudeler.example.apispeak.grpc.SpeakRequest.class,
      responseType = escudeler.example.apispeak.grpc.GoodbyeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<escudeler.example.apispeak.grpc.SpeakRequest,
      escudeler.example.apispeak.grpc.GoodbyeResponse> getGoodbyeMethod() {
    io.grpc.MethodDescriptor<escudeler.example.apispeak.grpc.SpeakRequest, escudeler.example.apispeak.grpc.GoodbyeResponse> getGoodbyeMethod;
    if ((getGoodbyeMethod = SpeakGrpcServiceGrpc.getGoodbyeMethod) == null) {
      synchronized (SpeakGrpcServiceGrpc.class) {
        if ((getGoodbyeMethod = SpeakGrpcServiceGrpc.getGoodbyeMethod) == null) {
          SpeakGrpcServiceGrpc.getGoodbyeMethod = getGoodbyeMethod = 
              io.grpc.MethodDescriptor.<escudeler.example.apispeak.grpc.SpeakRequest, escudeler.example.apispeak.grpc.GoodbyeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SpeakGrpcService", "goodbye"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escudeler.example.apispeak.grpc.SpeakRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escudeler.example.apispeak.grpc.GoodbyeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeakGrpcServiceMethodDescriptorSupplier("goodbye"))
                  .build();
          }
        }
     }
     return getGoodbyeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<escudeler.example.apispeak.grpc.SpeakRequest,
      com.google.protobuf.Empty> getStrangerPeopleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "strangerPeople",
      requestType = escudeler.example.apispeak.grpc.SpeakRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<escudeler.example.apispeak.grpc.SpeakRequest,
      com.google.protobuf.Empty> getStrangerPeopleMethod() {
    io.grpc.MethodDescriptor<escudeler.example.apispeak.grpc.SpeakRequest, com.google.protobuf.Empty> getStrangerPeopleMethod;
    if ((getStrangerPeopleMethod = SpeakGrpcServiceGrpc.getStrangerPeopleMethod) == null) {
      synchronized (SpeakGrpcServiceGrpc.class) {
        if ((getStrangerPeopleMethod = SpeakGrpcServiceGrpc.getStrangerPeopleMethod) == null) {
          SpeakGrpcServiceGrpc.getStrangerPeopleMethod = getStrangerPeopleMethod = 
              io.grpc.MethodDescriptor.<escudeler.example.apispeak.grpc.SpeakRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SpeakGrpcService", "strangerPeople"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escudeler.example.apispeak.grpc.SpeakRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeakGrpcServiceMethodDescriptorSupplier("strangerPeople"))
                  .build();
          }
        }
     }
     return getStrangerPeopleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getCleanStrangerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cleanStranger",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getCleanStrangerMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getCleanStrangerMethod;
    if ((getCleanStrangerMethod = SpeakGrpcServiceGrpc.getCleanStrangerMethod) == null) {
      synchronized (SpeakGrpcServiceGrpc.class) {
        if ((getCleanStrangerMethod = SpeakGrpcServiceGrpc.getCleanStrangerMethod) == null) {
          SpeakGrpcServiceGrpc.getCleanStrangerMethod = getCleanStrangerMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SpeakGrpcService", "cleanStranger"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeakGrpcServiceMethodDescriptorSupplier("cleanStranger"))
                  .build();
          }
        }
     }
     return getCleanStrangerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpeakGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new SpeakGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpeakGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SpeakGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpeakGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SpeakGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SpeakGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Method for send hello to people
     * </pre>
     */
    public void hello(escudeler.example.apispeak.grpc.SpeakRequest request,
        io.grpc.stub.StreamObserver<escudeler.example.apispeak.grpc.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }

    /**
     * <pre>
     *Method for send goodbye with feedback to people
     * </pre>
     */
    public void goodbye(escudeler.example.apispeak.grpc.SpeakRequest request,
        io.grpc.stub.StreamObserver<escudeler.example.apispeak.grpc.GoodbyeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGoodbyeMethod(), responseObserver);
    }

    /**
     * <pre>
     *Method for keep names of strangers
     * </pre>
     */
    public void strangerPeople(escudeler.example.apispeak.grpc.SpeakRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getStrangerPeopleMethod(), responseObserver);
    }

    /**
     * <pre>
     *Method for clear strangers names
     * </pre>
     */
    public void cleanStranger(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCleanStrangerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                escudeler.example.apispeak.grpc.SpeakRequest,
                escudeler.example.apispeak.grpc.HelloResponse>(
                  this, METHODID_HELLO)))
          .addMethod(
            getGoodbyeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                escudeler.example.apispeak.grpc.SpeakRequest,
                escudeler.example.apispeak.grpc.GoodbyeResponse>(
                  this, METHODID_GOODBYE)))
          .addMethod(
            getStrangerPeopleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                escudeler.example.apispeak.grpc.SpeakRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_STRANGER_PEOPLE)))
          .addMethod(
            getCleanStrangerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.google.protobuf.Empty>(
                  this, METHODID_CLEAN_STRANGER)))
          .build();
    }
  }

  /**
   */
  public static final class SpeakGrpcServiceStub extends io.grpc.stub.AbstractStub<SpeakGrpcServiceStub> {
    private SpeakGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeakGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeakGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeakGrpcServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Method for send hello to people
     * </pre>
     */
    public void hello(escudeler.example.apispeak.grpc.SpeakRequest request,
        io.grpc.stub.StreamObserver<escudeler.example.apispeak.grpc.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Method for send goodbye with feedback to people
     * </pre>
     */
    public void goodbye(escudeler.example.apispeak.grpc.SpeakRequest request,
        io.grpc.stub.StreamObserver<escudeler.example.apispeak.grpc.GoodbyeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGoodbyeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Method for keep names of strangers
     * </pre>
     */
    public void strangerPeople(escudeler.example.apispeak.grpc.SpeakRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStrangerPeopleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Method for clear strangers names
     * </pre>
     */
    public void cleanStranger(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCleanStrangerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SpeakGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<SpeakGrpcServiceBlockingStub> {
    private SpeakGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeakGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeakGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeakGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Method for send hello to people
     * </pre>
     */
    public escudeler.example.apispeak.grpc.HelloResponse hello(escudeler.example.apispeak.grpc.SpeakRequest request) {
      return blockingUnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Method for send goodbye with feedback to people
     * </pre>
     */
    public escudeler.example.apispeak.grpc.GoodbyeResponse goodbye(escudeler.example.apispeak.grpc.SpeakRequest request) {
      return blockingUnaryCall(
          getChannel(), getGoodbyeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Method for keep names of strangers
     * </pre>
     */
    public com.google.protobuf.Empty strangerPeople(escudeler.example.apispeak.grpc.SpeakRequest request) {
      return blockingUnaryCall(
          getChannel(), getStrangerPeopleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Method for clear strangers names
     * </pre>
     */
    public com.google.protobuf.Empty cleanStranger(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getCleanStrangerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SpeakGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<SpeakGrpcServiceFutureStub> {
    private SpeakGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeakGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeakGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeakGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Method for send hello to people
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<escudeler.example.apispeak.grpc.HelloResponse> hello(
        escudeler.example.apispeak.grpc.SpeakRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Method for send goodbye with feedback to people
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<escudeler.example.apispeak.grpc.GoodbyeResponse> goodbye(
        escudeler.example.apispeak.grpc.SpeakRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGoodbyeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Method for keep names of strangers
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> strangerPeople(
        escudeler.example.apispeak.grpc.SpeakRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStrangerPeopleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Method for clear strangers names
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> cleanStranger(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getCleanStrangerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;
  private static final int METHODID_GOODBYE = 1;
  private static final int METHODID_STRANGER_PEOPLE = 2;
  private static final int METHODID_CLEAN_STRANGER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SpeakGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SpeakGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((escudeler.example.apispeak.grpc.SpeakRequest) request,
              (io.grpc.stub.StreamObserver<escudeler.example.apispeak.grpc.HelloResponse>) responseObserver);
          break;
        case METHODID_GOODBYE:
          serviceImpl.goodbye((escudeler.example.apispeak.grpc.SpeakRequest) request,
              (io.grpc.stub.StreamObserver<escudeler.example.apispeak.grpc.GoodbyeResponse>) responseObserver);
          break;
        case METHODID_STRANGER_PEOPLE:
          serviceImpl.strangerPeople((escudeler.example.apispeak.grpc.SpeakRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CLEAN_STRANGER:
          serviceImpl.cleanStranger((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class SpeakGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SpeakGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return escudeler.example.apispeak.grpc.SpeakService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SpeakGrpcService");
    }
  }

  private static final class SpeakGrpcServiceFileDescriptorSupplier
      extends SpeakGrpcServiceBaseDescriptorSupplier {
    SpeakGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class SpeakGrpcServiceMethodDescriptorSupplier
      extends SpeakGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SpeakGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SpeakGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SpeakGrpcServiceFileDescriptorSupplier())
              .addMethod(getHelloMethod())
              .addMethod(getGoodbyeMethod())
              .addMethod(getStrangerPeopleMethod())
              .addMethod(getCleanStrangerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
