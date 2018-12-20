package com.bq.vertxgrpcexample.service.proto;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: person.proto")
public final class PersonServiceGrpc {

  private PersonServiceGrpc() {}

  private static <T> io.grpc.stub.StreamObserver<T> toObserver(final io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> handler) {
    return new io.grpc.stub.StreamObserver<T>() {
      private volatile boolean resolved = false;
      @Override
      public void onNext(T value) {
        if (!resolved) {
          resolved = true;
          handler.handle(io.vertx.core.Future.succeededFuture(value));
        }
      }

      @Override
      public void onError(Throwable t) {
        if (!resolved) {
          resolved = true;
          handler.handle(io.vertx.core.Future.failedFuture(t));
        }
      }

      @Override
      public void onCompleted() {
        if (!resolved) {
          resolved = true;
          handler.handle(io.vertx.core.Future.succeededFuture());
        }
      }
    };
  }

  public static final String SERVICE_NAME = "proto.PersonService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bq.vertxgrpcexample.service.proto.Person,
      com.bq.vertxgrpcexample.service.proto.Person> getCreatePersonMethod;

  public static io.grpc.MethodDescriptor<com.bq.vertxgrpcexample.service.proto.Person,
      com.bq.vertxgrpcexample.service.proto.Person> getCreatePersonMethod() {
    io.grpc.MethodDescriptor<com.bq.vertxgrpcexample.service.proto.Person, com.bq.vertxgrpcexample.service.proto.Person> getCreatePersonMethod;
    if ((getCreatePersonMethod = PersonServiceGrpc.getCreatePersonMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getCreatePersonMethod = PersonServiceGrpc.getCreatePersonMethod) == null) {
          PersonServiceGrpc.getCreatePersonMethod = getCreatePersonMethod = 
              io.grpc.MethodDescriptor.<com.bq.vertxgrpcexample.service.proto.Person, com.bq.vertxgrpcexample.service.proto.Person>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.PersonService", "CreatePerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bq.vertxgrpcexample.service.proto.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bq.vertxgrpcexample.service.proto.Person.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("CreatePerson"))
                  .build();
          }
        }
     }
     return getCreatePersonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bq.vertxgrpcexample.service.proto.FetchPersonRequest,
      com.bq.vertxgrpcexample.service.proto.Person> getFetchPersonMethod;

  public static io.grpc.MethodDescriptor<com.bq.vertxgrpcexample.service.proto.FetchPersonRequest,
      com.bq.vertxgrpcexample.service.proto.Person> getFetchPersonMethod() {
    io.grpc.MethodDescriptor<com.bq.vertxgrpcexample.service.proto.FetchPersonRequest, com.bq.vertxgrpcexample.service.proto.Person> getFetchPersonMethod;
    if ((getFetchPersonMethod = PersonServiceGrpc.getFetchPersonMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getFetchPersonMethod = PersonServiceGrpc.getFetchPersonMethod) == null) {
          PersonServiceGrpc.getFetchPersonMethod = getFetchPersonMethod = 
              io.grpc.MethodDescriptor.<com.bq.vertxgrpcexample.service.proto.FetchPersonRequest, com.bq.vertxgrpcexample.service.proto.Person>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.PersonService", "FetchPerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bq.vertxgrpcexample.service.proto.FetchPersonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bq.vertxgrpcexample.service.proto.Person.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("FetchPerson"))
                  .build();
          }
        }
     }
     return getFetchPersonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bq.vertxgrpcexample.service.proto.FetchAllRequest,
      com.bq.vertxgrpcexample.service.proto.FetchAllResponse> getFetchAllMethod;

  public static io.grpc.MethodDescriptor<com.bq.vertxgrpcexample.service.proto.FetchAllRequest,
      com.bq.vertxgrpcexample.service.proto.FetchAllResponse> getFetchAllMethod() {
    io.grpc.MethodDescriptor<com.bq.vertxgrpcexample.service.proto.FetchAllRequest, com.bq.vertxgrpcexample.service.proto.FetchAllResponse> getFetchAllMethod;
    if ((getFetchAllMethod = PersonServiceGrpc.getFetchAllMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getFetchAllMethod = PersonServiceGrpc.getFetchAllMethod) == null) {
          PersonServiceGrpc.getFetchAllMethod = getFetchAllMethod = 
              io.grpc.MethodDescriptor.<com.bq.vertxgrpcexample.service.proto.FetchAllRequest, com.bq.vertxgrpcexample.service.proto.FetchAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.PersonService", "FetchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bq.vertxgrpcexample.service.proto.FetchAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bq.vertxgrpcexample.service.proto.FetchAllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("FetchAll"))
                  .build();
          }
        }
     }
     return getFetchAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bq.vertxgrpcexample.service.proto.Person,
      com.bq.vertxgrpcexample.service.proto.Person> getUpdatePersonMethod;

  public static io.grpc.MethodDescriptor<com.bq.vertxgrpcexample.service.proto.Person,
      com.bq.vertxgrpcexample.service.proto.Person> getUpdatePersonMethod() {
    io.grpc.MethodDescriptor<com.bq.vertxgrpcexample.service.proto.Person, com.bq.vertxgrpcexample.service.proto.Person> getUpdatePersonMethod;
    if ((getUpdatePersonMethod = PersonServiceGrpc.getUpdatePersonMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getUpdatePersonMethod = PersonServiceGrpc.getUpdatePersonMethod) == null) {
          PersonServiceGrpc.getUpdatePersonMethod = getUpdatePersonMethod = 
              io.grpc.MethodDescriptor.<com.bq.vertxgrpcexample.service.proto.Person, com.bq.vertxgrpcexample.service.proto.Person>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.PersonService", "UpdatePerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bq.vertxgrpcexample.service.proto.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bq.vertxgrpcexample.service.proto.Person.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("UpdatePerson"))
                  .build();
          }
        }
     }
     return getUpdatePersonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bq.vertxgrpcexample.service.proto.Person,
      com.bq.vertxgrpcexample.service.proto.DeleteResponse> getDeletePersonMethod;

  public static io.grpc.MethodDescriptor<com.bq.vertxgrpcexample.service.proto.Person,
      com.bq.vertxgrpcexample.service.proto.DeleteResponse> getDeletePersonMethod() {
    io.grpc.MethodDescriptor<com.bq.vertxgrpcexample.service.proto.Person, com.bq.vertxgrpcexample.service.proto.DeleteResponse> getDeletePersonMethod;
    if ((getDeletePersonMethod = PersonServiceGrpc.getDeletePersonMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getDeletePersonMethod = PersonServiceGrpc.getDeletePersonMethod) == null) {
          PersonServiceGrpc.getDeletePersonMethod = getDeletePersonMethod = 
              io.grpc.MethodDescriptor.<com.bq.vertxgrpcexample.service.proto.Person, com.bq.vertxgrpcexample.service.proto.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.PersonService", "DeletePerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bq.vertxgrpcexample.service.proto.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bq.vertxgrpcexample.service.proto.DeleteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("DeletePerson"))
                  .build();
          }
        }
     }
     return getDeletePersonMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersonServiceStub newStub(io.grpc.Channel channel) {
    return new PersonServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersonServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PersonServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PersonServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PersonServiceFutureStub(channel);
  }

  /**
   * Creates a new vertx stub that supports all call types for the service
   */
  public static PersonServiceVertxStub newVertxStub(io.grpc.Channel channel) {
    return new PersonServiceVertxStub(channel);
  }

  /**
   */
  public static abstract class PersonServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createPerson(com.bq.vertxgrpcexample.service.proto.Person request,
        io.grpc.stub.StreamObserver<com.bq.vertxgrpcexample.service.proto.Person> responseObserver) {
      asyncUnimplementedUnaryCall(getCreatePersonMethod(), responseObserver);
    }

    /**
     */
    public void fetchPerson(com.bq.vertxgrpcexample.service.proto.FetchPersonRequest request,
        io.grpc.stub.StreamObserver<com.bq.vertxgrpcexample.service.proto.Person> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchPersonMethod(), responseObserver);
    }

    /**
     */
    public void fetchAll(com.bq.vertxgrpcexample.service.proto.FetchAllRequest request,
        io.grpc.stub.StreamObserver<com.bq.vertxgrpcexample.service.proto.FetchAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchAllMethod(), responseObserver);
    }

    /**
     */
    public void updatePerson(com.bq.vertxgrpcexample.service.proto.Person request,
        io.grpc.stub.StreamObserver<com.bq.vertxgrpcexample.service.proto.Person> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePersonMethod(), responseObserver);
    }

    /**
     */
    public void deletePerson(com.bq.vertxgrpcexample.service.proto.Person request,
        io.grpc.stub.StreamObserver<com.bq.vertxgrpcexample.service.proto.DeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePersonMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatePersonMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bq.vertxgrpcexample.service.proto.Person,
                com.bq.vertxgrpcexample.service.proto.Person>(
                  this, METHODID_CREATE_PERSON)))
          .addMethod(
            getFetchPersonMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bq.vertxgrpcexample.service.proto.FetchPersonRequest,
                com.bq.vertxgrpcexample.service.proto.Person>(
                  this, METHODID_FETCH_PERSON)))
          .addMethod(
            getFetchAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bq.vertxgrpcexample.service.proto.FetchAllRequest,
                com.bq.vertxgrpcexample.service.proto.FetchAllResponse>(
                  this, METHODID_FETCH_ALL)))
          .addMethod(
            getUpdatePersonMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bq.vertxgrpcexample.service.proto.Person,
                com.bq.vertxgrpcexample.service.proto.Person>(
                  this, METHODID_UPDATE_PERSON)))
          .addMethod(
            getDeletePersonMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bq.vertxgrpcexample.service.proto.Person,
                com.bq.vertxgrpcexample.service.proto.DeleteResponse>(
                  this, METHODID_DELETE_PERSON)))
          .build();
    }
  }

  /**
   */
  public static final class PersonServiceStub extends io.grpc.stub.AbstractStub<PersonServiceStub> {
    public PersonServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    public PersonServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceStub(channel, callOptions);
    }

    /**
     */
    public void createPerson(com.bq.vertxgrpcexample.service.proto.Person request,
        io.grpc.stub.StreamObserver<com.bq.vertxgrpcexample.service.proto.Person> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePersonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchPerson(com.bq.vertxgrpcexample.service.proto.FetchPersonRequest request,
        io.grpc.stub.StreamObserver<com.bq.vertxgrpcexample.service.proto.Person> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFetchPersonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchAll(com.bq.vertxgrpcexample.service.proto.FetchAllRequest request,
        io.grpc.stub.StreamObserver<com.bq.vertxgrpcexample.service.proto.FetchAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFetchAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePerson(com.bq.vertxgrpcexample.service.proto.Person request,
        io.grpc.stub.StreamObserver<com.bq.vertxgrpcexample.service.proto.Person> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePersonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePerson(com.bq.vertxgrpcexample.service.proto.Person request,
        io.grpc.stub.StreamObserver<com.bq.vertxgrpcexample.service.proto.DeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePersonMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PersonServiceBlockingStub extends io.grpc.stub.AbstractStub<PersonServiceBlockingStub> {
    public PersonServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    public PersonServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.bq.vertxgrpcexample.service.proto.Person createPerson(com.bq.vertxgrpcexample.service.proto.Person request) {
      return blockingUnaryCall(
          getChannel(), getCreatePersonMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bq.vertxgrpcexample.service.proto.Person fetchPerson(com.bq.vertxgrpcexample.service.proto.FetchPersonRequest request) {
      return blockingUnaryCall(
          getChannel(), getFetchPersonMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bq.vertxgrpcexample.service.proto.FetchAllResponse fetchAll(com.bq.vertxgrpcexample.service.proto.FetchAllRequest request) {
      return blockingUnaryCall(
          getChannel(), getFetchAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bq.vertxgrpcexample.service.proto.Person updatePerson(com.bq.vertxgrpcexample.service.proto.Person request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePersonMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bq.vertxgrpcexample.service.proto.DeleteResponse deletePerson(com.bq.vertxgrpcexample.service.proto.Person request) {
      return blockingUnaryCall(
          getChannel(), getDeletePersonMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PersonServiceFutureStub extends io.grpc.stub.AbstractStub<PersonServiceFutureStub> {
    public PersonServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    public PersonServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bq.vertxgrpcexample.service.proto.Person> createPerson(
        com.bq.vertxgrpcexample.service.proto.Person request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatePersonMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bq.vertxgrpcexample.service.proto.Person> fetchPerson(
        com.bq.vertxgrpcexample.service.proto.FetchPersonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFetchPersonMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bq.vertxgrpcexample.service.proto.FetchAllResponse> fetchAll(
        com.bq.vertxgrpcexample.service.proto.FetchAllRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFetchAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bq.vertxgrpcexample.service.proto.Person> updatePerson(
        com.bq.vertxgrpcexample.service.proto.Person request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePersonMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bq.vertxgrpcexample.service.proto.DeleteResponse> deletePerson(
        com.bq.vertxgrpcexample.service.proto.Person request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePersonMethod(), getCallOptions()), request);
    }
  }

  /**
   */
  public static abstract class PersonServiceVertxImplBase implements io.grpc.BindableService {

    /**
     */
    public void createPerson(com.bq.vertxgrpcexample.service.proto.Person request,
        io.vertx.core.Future<com.bq.vertxgrpcexample.service.proto.Person> response) {
      asyncUnimplementedUnaryCall(getCreatePersonMethod(), PersonServiceGrpc.toObserver(response.completer()));
    }

    /**
     */
    public void fetchPerson(com.bq.vertxgrpcexample.service.proto.FetchPersonRequest request,
        io.vertx.core.Future<com.bq.vertxgrpcexample.service.proto.Person> response) {
      asyncUnimplementedUnaryCall(getFetchPersonMethod(), PersonServiceGrpc.toObserver(response.completer()));
    }

    /**
     */
    public void fetchAll(com.bq.vertxgrpcexample.service.proto.FetchAllRequest request,
        io.vertx.core.Future<com.bq.vertxgrpcexample.service.proto.FetchAllResponse> response) {
      asyncUnimplementedUnaryCall(getFetchAllMethod(), PersonServiceGrpc.toObserver(response.completer()));
    }

    /**
     */
    public void updatePerson(com.bq.vertxgrpcexample.service.proto.Person request,
        io.vertx.core.Future<com.bq.vertxgrpcexample.service.proto.Person> response) {
      asyncUnimplementedUnaryCall(getUpdatePersonMethod(), PersonServiceGrpc.toObserver(response.completer()));
    }

    /**
     */
    public void deletePerson(com.bq.vertxgrpcexample.service.proto.Person request,
        io.vertx.core.Future<com.bq.vertxgrpcexample.service.proto.DeleteResponse> response) {
      asyncUnimplementedUnaryCall(getDeletePersonMethod(), PersonServiceGrpc.toObserver(response.completer()));
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatePersonMethod(),
            asyncUnaryCall(
              new VertxMethodHandlers<
                com.bq.vertxgrpcexample.service.proto.Person,
                com.bq.vertxgrpcexample.service.proto.Person>(
                  this, METHODID_CREATE_PERSON)))
          .addMethod(
            getFetchPersonMethod(),
            asyncUnaryCall(
              new VertxMethodHandlers<
                com.bq.vertxgrpcexample.service.proto.FetchPersonRequest,
                com.bq.vertxgrpcexample.service.proto.Person>(
                  this, METHODID_FETCH_PERSON)))
          .addMethod(
            getFetchAllMethod(),
            asyncUnaryCall(
              new VertxMethodHandlers<
                com.bq.vertxgrpcexample.service.proto.FetchAllRequest,
                com.bq.vertxgrpcexample.service.proto.FetchAllResponse>(
                  this, METHODID_FETCH_ALL)))
          .addMethod(
            getUpdatePersonMethod(),
            asyncUnaryCall(
              new VertxMethodHandlers<
                com.bq.vertxgrpcexample.service.proto.Person,
                com.bq.vertxgrpcexample.service.proto.Person>(
                  this, METHODID_UPDATE_PERSON)))
          .addMethod(
            getDeletePersonMethod(),
            asyncUnaryCall(
              new VertxMethodHandlers<
                com.bq.vertxgrpcexample.service.proto.Person,
                com.bq.vertxgrpcexample.service.proto.DeleteResponse>(
                  this, METHODID_DELETE_PERSON)))
          .build();
    }
  }

  /**
   */
  public static final class PersonServiceVertxStub extends io.grpc.stub.AbstractStub<PersonServiceVertxStub> {
    public PersonServiceVertxStub(io.grpc.Channel channel) {
      super(channel);
    }

    public PersonServiceVertxStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceVertxStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceVertxStub(channel, callOptions);
    }

    /**
     */
    public void createPerson(com.bq.vertxgrpcexample.service.proto.Person request,
        io.vertx.core.Handler<io.vertx.core.AsyncResult<com.bq.vertxgrpcexample.service.proto.Person>> response) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePersonMethod(), getCallOptions()), request, PersonServiceGrpc.toObserver(response));
    }

    /**
     */
    public void fetchPerson(com.bq.vertxgrpcexample.service.proto.FetchPersonRequest request,
        io.vertx.core.Handler<io.vertx.core.AsyncResult<com.bq.vertxgrpcexample.service.proto.Person>> response) {
      asyncUnaryCall(
          getChannel().newCall(getFetchPersonMethod(), getCallOptions()), request, PersonServiceGrpc.toObserver(response));
    }

    /**
     */
    public void fetchAll(com.bq.vertxgrpcexample.service.proto.FetchAllRequest request,
        io.vertx.core.Handler<io.vertx.core.AsyncResult<com.bq.vertxgrpcexample.service.proto.FetchAllResponse>> response) {
      asyncUnaryCall(
          getChannel().newCall(getFetchAllMethod(), getCallOptions()), request, PersonServiceGrpc.toObserver(response));
    }

    /**
     */
    public void updatePerson(com.bq.vertxgrpcexample.service.proto.Person request,
        io.vertx.core.Handler<io.vertx.core.AsyncResult<com.bq.vertxgrpcexample.service.proto.Person>> response) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePersonMethod(), getCallOptions()), request, PersonServiceGrpc.toObserver(response));
    }

    /**
     */
    public void deletePerson(com.bq.vertxgrpcexample.service.proto.Person request,
        io.vertx.core.Handler<io.vertx.core.AsyncResult<com.bq.vertxgrpcexample.service.proto.DeleteResponse>> response) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePersonMethod(), getCallOptions()), request, PersonServiceGrpc.toObserver(response));
    }
  }

  private static final int METHODID_CREATE_PERSON = 0;
  private static final int METHODID_FETCH_PERSON = 1;
  private static final int METHODID_FETCH_ALL = 2;
  private static final int METHODID_UPDATE_PERSON = 3;
  private static final int METHODID_DELETE_PERSON = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersonServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PersonServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PERSON:
          serviceImpl.createPerson((com.bq.vertxgrpcexample.service.proto.Person) request,
              (io.grpc.stub.StreamObserver<com.bq.vertxgrpcexample.service.proto.Person>) responseObserver);
          break;
        case METHODID_FETCH_PERSON:
          serviceImpl.fetchPerson((com.bq.vertxgrpcexample.service.proto.FetchPersonRequest) request,
              (io.grpc.stub.StreamObserver<com.bq.vertxgrpcexample.service.proto.Person>) responseObserver);
          break;
        case METHODID_FETCH_ALL:
          serviceImpl.fetchAll((com.bq.vertxgrpcexample.service.proto.FetchAllRequest) request,
              (io.grpc.stub.StreamObserver<com.bq.vertxgrpcexample.service.proto.FetchAllResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PERSON:
          serviceImpl.updatePerson((com.bq.vertxgrpcexample.service.proto.Person) request,
              (io.grpc.stub.StreamObserver<com.bq.vertxgrpcexample.service.proto.Person>) responseObserver);
          break;
        case METHODID_DELETE_PERSON:
          serviceImpl.deletePerson((com.bq.vertxgrpcexample.service.proto.Person) request,
              (io.grpc.stub.StreamObserver<com.bq.vertxgrpcexample.service.proto.DeleteResponse>) responseObserver);
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

  private static final class VertxMethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersonServiceVertxImplBase serviceImpl;
    private final int methodId;

    VertxMethodHandlers(PersonServiceVertxImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PERSON:
          serviceImpl.createPerson((com.bq.vertxgrpcexample.service.proto.Person) request,
              (io.vertx.core.Future<com.bq.vertxgrpcexample.service.proto.Person>) io.vertx.core.Future.<com.bq.vertxgrpcexample.service.proto.Person>future().setHandler(ar -> {
                if (ar.succeeded()) {
                  ((io.grpc.stub.StreamObserver<com.bq.vertxgrpcexample.service.proto.Person>) responseObserver).onNext(ar.result());
                  responseObserver.onCompleted();
                } else {
                  responseObserver.onError(ar.cause());
                }
              }));
          break;
        case METHODID_FETCH_PERSON:
          serviceImpl.fetchPerson((com.bq.vertxgrpcexample.service.proto.FetchPersonRequest) request,
              (io.vertx.core.Future<com.bq.vertxgrpcexample.service.proto.Person>) io.vertx.core.Future.<com.bq.vertxgrpcexample.service.proto.Person>future().setHandler(ar -> {
                if (ar.succeeded()) {
                  ((io.grpc.stub.StreamObserver<com.bq.vertxgrpcexample.service.proto.Person>) responseObserver).onNext(ar.result());
                  responseObserver.onCompleted();
                } else {
                  responseObserver.onError(ar.cause());
                }
              }));
          break;
        case METHODID_FETCH_ALL:
          serviceImpl.fetchAll((com.bq.vertxgrpcexample.service.proto.FetchAllRequest) request,
              (io.vertx.core.Future<com.bq.vertxgrpcexample.service.proto.FetchAllResponse>) io.vertx.core.Future.<com.bq.vertxgrpcexample.service.proto.FetchAllResponse>future().setHandler(ar -> {
                if (ar.succeeded()) {
                  ((io.grpc.stub.StreamObserver<com.bq.vertxgrpcexample.service.proto.FetchAllResponse>) responseObserver).onNext(ar.result());
                  responseObserver.onCompleted();
                } else {
                  responseObserver.onError(ar.cause());
                }
              }));
          break;
        case METHODID_UPDATE_PERSON:
          serviceImpl.updatePerson((com.bq.vertxgrpcexample.service.proto.Person) request,
              (io.vertx.core.Future<com.bq.vertxgrpcexample.service.proto.Person>) io.vertx.core.Future.<com.bq.vertxgrpcexample.service.proto.Person>future().setHandler(ar -> {
                if (ar.succeeded()) {
                  ((io.grpc.stub.StreamObserver<com.bq.vertxgrpcexample.service.proto.Person>) responseObserver).onNext(ar.result());
                  responseObserver.onCompleted();
                } else {
                  responseObserver.onError(ar.cause());
                }
              }));
          break;
        case METHODID_DELETE_PERSON:
          serviceImpl.deletePerson((com.bq.vertxgrpcexample.service.proto.Person) request,
              (io.vertx.core.Future<com.bq.vertxgrpcexample.service.proto.DeleteResponse>) io.vertx.core.Future.<com.bq.vertxgrpcexample.service.proto.DeleteResponse>future().setHandler(ar -> {
                if (ar.succeeded()) {
                  ((io.grpc.stub.StreamObserver<com.bq.vertxgrpcexample.service.proto.DeleteResponse>) responseObserver).onNext(ar.result());
                  responseObserver.onCompleted();
                } else {
                  responseObserver.onError(ar.cause());
                }
              }));
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

  private static abstract class PersonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PersonServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bq.vertxgrpcexample.service.proto.PersonProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PersonService");
    }
  }

  private static final class PersonServiceFileDescriptorSupplier
      extends PersonServiceBaseDescriptorSupplier {
    PersonServiceFileDescriptorSupplier() {}
  }

  private static final class PersonServiceMethodDescriptorSupplier
      extends PersonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PersonServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PersonServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PersonServiceFileDescriptorSupplier())
              .addMethod(getCreatePersonMethod())
              .addMethod(getFetchPersonMethod())
              .addMethod(getFetchAllMethod())
              .addMethod(getUpdatePersonMethod())
              .addMethod(getDeletePersonMethod())
              .build();
        }
      }
    }
    return result;
  }
}
