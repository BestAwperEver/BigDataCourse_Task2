package ru.spbu.pt.bd.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: simple.proto")
public final class SampleServiceGrpc {

  private SampleServiceGrpc() {}

  public static final String SERVICE_NAME = "SampleService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ru.spbu.pt.bd.grpc.InfoRequest,
      ru.spbu.pt.bd.grpc.InfoResponse> METHOD_GET_SYSTEM_INFO =
      io.grpc.MethodDescriptor.<ru.spbu.pt.bd.grpc.InfoRequest, ru.spbu.pt.bd.grpc.InfoResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "SampleService", "getSystemInfo"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ru.spbu.pt.bd.grpc.InfoRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ru.spbu.pt.bd.grpc.InfoResponse.getDefaultInstance()))
          .setSchemaDescriptor(new SampleServiceMethodDescriptorSupplier("getSystemInfo"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ru.spbu.pt.bd.grpc.FactorRequest,
      ru.spbu.pt.bd.grpc.FactorResponse> METHOD_GET_FACTORIZATION =
      io.grpc.MethodDescriptor.<ru.spbu.pt.bd.grpc.FactorRequest, ru.spbu.pt.bd.grpc.FactorResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "SampleService", "getFactorization"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ru.spbu.pt.bd.grpc.FactorRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ru.spbu.pt.bd.grpc.FactorResponse.getDefaultInstance()))
          .setSchemaDescriptor(new SampleServiceMethodDescriptorSupplier("getFactorization"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SampleServiceStub newStub(io.grpc.Channel channel) {
    return new SampleServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SampleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SampleServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SampleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SampleServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SampleServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getSystemInfo(ru.spbu.pt.bd.grpc.InfoRequest request,
        io.grpc.stub.StreamObserver<ru.spbu.pt.bd.grpc.InfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SYSTEM_INFO, responseObserver);
    }

    /**
     */
    public void getFactorization(ru.spbu.pt.bd.grpc.FactorRequest request,
        io.grpc.stub.StreamObserver<ru.spbu.pt.bd.grpc.FactorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_FACTORIZATION, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_SYSTEM_INFO,
            asyncUnaryCall(
              new MethodHandlers<
                ru.spbu.pt.bd.grpc.InfoRequest,
                ru.spbu.pt.bd.grpc.InfoResponse>(
                  this, METHODID_GET_SYSTEM_INFO)))
          .addMethod(
            METHOD_GET_FACTORIZATION,
            asyncUnaryCall(
              new MethodHandlers<
                ru.spbu.pt.bd.grpc.FactorRequest,
                ru.spbu.pt.bd.grpc.FactorResponse>(
                  this, METHODID_GET_FACTORIZATION)))
          .build();
    }
  }

  /**
   */
  public static final class SampleServiceStub extends io.grpc.stub.AbstractStub<SampleServiceStub> {
    private SampleServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SampleServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SampleServiceStub(channel, callOptions);
    }

    /**
     */
    public void getSystemInfo(ru.spbu.pt.bd.grpc.InfoRequest request,
        io.grpc.stub.StreamObserver<ru.spbu.pt.bd.grpc.InfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SYSTEM_INFO, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFactorization(ru.spbu.pt.bd.grpc.FactorRequest request,
        io.grpc.stub.StreamObserver<ru.spbu.pt.bd.grpc.FactorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_FACTORIZATION, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SampleServiceBlockingStub extends io.grpc.stub.AbstractStub<SampleServiceBlockingStub> {
    private SampleServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SampleServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SampleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.spbu.pt.bd.grpc.InfoResponse getSystemInfo(ru.spbu.pt.bd.grpc.InfoRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SYSTEM_INFO, getCallOptions(), request);
    }

    /**
     */
    public ru.spbu.pt.bd.grpc.FactorResponse getFactorization(ru.spbu.pt.bd.grpc.FactorRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_FACTORIZATION, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SampleServiceFutureStub extends io.grpc.stub.AbstractStub<SampleServiceFutureStub> {
    private SampleServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SampleServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SampleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.spbu.pt.bd.grpc.InfoResponse> getSystemInfo(
        ru.spbu.pt.bd.grpc.InfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SYSTEM_INFO, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.spbu.pt.bd.grpc.FactorResponse> getFactorization(
        ru.spbu.pt.bd.grpc.FactorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_FACTORIZATION, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SYSTEM_INFO = 0;
  private static final int METHODID_GET_FACTORIZATION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SampleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SampleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SYSTEM_INFO:
          serviceImpl.getSystemInfo((ru.spbu.pt.bd.grpc.InfoRequest) request,
              (io.grpc.stub.StreamObserver<ru.spbu.pt.bd.grpc.InfoResponse>) responseObserver);
          break;
        case METHODID_GET_FACTORIZATION:
          serviceImpl.getFactorization((ru.spbu.pt.bd.grpc.FactorRequest) request,
              (io.grpc.stub.StreamObserver<ru.spbu.pt.bd.grpc.FactorResponse>) responseObserver);
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

  private static abstract class SampleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SampleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.spbu.pt.bd.grpc.SampleServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SampleService");
    }
  }

  private static final class SampleServiceFileDescriptorSupplier
      extends SampleServiceBaseDescriptorSupplier {
    SampleServiceFileDescriptorSupplier() {}
  }

  private static final class SampleServiceMethodDescriptorSupplier
      extends SampleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SampleServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SampleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SampleServiceFileDescriptorSupplier())
              .addMethod(METHOD_GET_SYSTEM_INFO)
              .addMethod(METHOD_GET_FACTORIZATION)
              .build();
        }
      }
    }
    return result;
  }
}
