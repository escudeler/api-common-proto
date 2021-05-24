package escudeler.example.apithirdpart.grpc;

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
    comments = "Source: ThirdPartService.proto")
public final class ThirdPartGrpcServiceGrpc {

  private ThirdPartGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "ThirdPartGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<escudeler.example.apispeak.grpc.SpeakRequest,
      escudeler.example.apithirdpart.grpc.AuthorizeResponse> getAuthorizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "authorize",
      requestType = escudeler.example.apispeak.grpc.SpeakRequest.class,
      responseType = escudeler.example.apithirdpart.grpc.AuthorizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<escudeler.example.apispeak.grpc.SpeakRequest,
      escudeler.example.apithirdpart.grpc.AuthorizeResponse> getAuthorizeMethod() {
    io.grpc.MethodDescriptor<escudeler.example.apispeak.grpc.SpeakRequest, escudeler.example.apithirdpart.grpc.AuthorizeResponse> getAuthorizeMethod;
    if ((getAuthorizeMethod = ThirdPartGrpcServiceGrpc.getAuthorizeMethod) == null) {
      synchronized (ThirdPartGrpcServiceGrpc.class) {
        if ((getAuthorizeMethod = ThirdPartGrpcServiceGrpc.getAuthorizeMethod) == null) {
          ThirdPartGrpcServiceGrpc.getAuthorizeMethod = getAuthorizeMethod = 
              io.grpc.MethodDescriptor.<escudeler.example.apispeak.grpc.SpeakRequest, escudeler.example.apithirdpart.grpc.AuthorizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ThirdPartGrpcService", "authorize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escudeler.example.apispeak.grpc.SpeakRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  escudeler.example.apithirdpart.grpc.AuthorizeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ThirdPartGrpcServiceMethodDescriptorSupplier("authorize"))
                  .build();
          }
        }
     }
     return getAuthorizeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ThirdPartGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new ThirdPartGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ThirdPartGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ThirdPartGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ThirdPartGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ThirdPartGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ThirdPartGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Method for authorize to say hello to people
     * </pre>
     */
    public void authorize(escudeler.example.apispeak.grpc.SpeakRequest request,
        io.grpc.stub.StreamObserver<escudeler.example.apithirdpart.grpc.AuthorizeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthorizeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthorizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                escudeler.example.apispeak.grpc.SpeakRequest,
                escudeler.example.apithirdpart.grpc.AuthorizeResponse>(
                  this, METHODID_AUTHORIZE)))
          .build();
    }
  }

  /**
   */
  public static final class ThirdPartGrpcServiceStub extends io.grpc.stub.AbstractStub<ThirdPartGrpcServiceStub> {
    private ThirdPartGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ThirdPartGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThirdPartGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ThirdPartGrpcServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Method for authorize to say hello to people
     * </pre>
     */
    public void authorize(escudeler.example.apispeak.grpc.SpeakRequest request,
        io.grpc.stub.StreamObserver<escudeler.example.apithirdpart.grpc.AuthorizeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthorizeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ThirdPartGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<ThirdPartGrpcServiceBlockingStub> {
    private ThirdPartGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ThirdPartGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThirdPartGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ThirdPartGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Method for authorize to say hello to people
     * </pre>
     */
    public escudeler.example.apithirdpart.grpc.AuthorizeResponse authorize(escudeler.example.apispeak.grpc.SpeakRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthorizeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ThirdPartGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<ThirdPartGrpcServiceFutureStub> {
    private ThirdPartGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ThirdPartGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThirdPartGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ThirdPartGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Method for authorize to say hello to people
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<escudeler.example.apithirdpart.grpc.AuthorizeResponse> authorize(
        escudeler.example.apispeak.grpc.SpeakRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthorizeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTHORIZE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ThirdPartGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ThirdPartGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTHORIZE:
          serviceImpl.authorize((escudeler.example.apispeak.grpc.SpeakRequest) request,
              (io.grpc.stub.StreamObserver<escudeler.example.apithirdpart.grpc.AuthorizeResponse>) responseObserver);
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

  private static abstract class ThirdPartGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ThirdPartGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return escudeler.example.apithirdpart.grpc.ThirdPartService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ThirdPartGrpcService");
    }
  }

  private static final class ThirdPartGrpcServiceFileDescriptorSupplier
      extends ThirdPartGrpcServiceBaseDescriptorSupplier {
    ThirdPartGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class ThirdPartGrpcServiceMethodDescriptorSupplier
      extends ThirdPartGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ThirdPartGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ThirdPartGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ThirdPartGrpcServiceFileDescriptorSupplier())
              .addMethod(getAuthorizeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
