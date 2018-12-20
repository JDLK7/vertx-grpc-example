// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package com.bq.vertxgrpcexample.api.proto;

/**
 * Protobuf type {@code proto.DeleteResponse}
 */
public  final class DeleteResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.DeleteResponse)
    DeleteResponseOrBuilder {
  // Use DeleteResponse.newBuilder() to construct.
  private DeleteResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteResponse() {
    ok_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DeleteResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            ok_ = input.readBool();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.bq.vertxgrpcexample.api.proto.PersonProto.internal_static_proto_DeleteResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bq.vertxgrpcexample.api.proto.PersonProto.internal_static_proto_DeleteResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bq.vertxgrpcexample.api.proto.DeleteResponse.class, com.bq.vertxgrpcexample.api.proto.DeleteResponse.Builder.class);
  }

  public static final int OK_FIELD_NUMBER = 1;
  private boolean ok_;
  /**
   * <code>bool ok = 1;</code>
   */
  public boolean getOk() {
    return ok_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (ok_ != false) {
      output.writeBool(1, ok_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ok_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, ok_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.bq.vertxgrpcexample.api.proto.DeleteResponse)) {
      return super.equals(obj);
    }
    com.bq.vertxgrpcexample.api.proto.DeleteResponse other = (com.bq.vertxgrpcexample.api.proto.DeleteResponse) obj;

    boolean result = true;
    result = result && (getOk()
        == other.getOk());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + OK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOk());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bq.vertxgrpcexample.api.proto.DeleteResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bq.vertxgrpcexample.api.proto.DeleteResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bq.vertxgrpcexample.api.proto.DeleteResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bq.vertxgrpcexample.api.proto.DeleteResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bq.vertxgrpcexample.api.proto.DeleteResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bq.vertxgrpcexample.api.proto.DeleteResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bq.vertxgrpcexample.api.proto.DeleteResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.bq.vertxgrpcexample.api.proto.DeleteResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bq.vertxgrpcexample.api.proto.DeleteResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bq.vertxgrpcexample.api.proto.DeleteResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.bq.vertxgrpcexample.api.proto.DeleteResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code proto.DeleteResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.DeleteResponse)
      com.bq.vertxgrpcexample.api.proto.DeleteResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bq.vertxgrpcexample.api.proto.PersonProto.internal_static_proto_DeleteResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bq.vertxgrpcexample.api.proto.PersonProto.internal_static_proto_DeleteResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bq.vertxgrpcexample.api.proto.DeleteResponse.class, com.bq.vertxgrpcexample.api.proto.DeleteResponse.Builder.class);
    }

    // Construct using com.bq.vertxgrpcexample.api.proto.DeleteResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      ok_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bq.vertxgrpcexample.api.proto.PersonProto.internal_static_proto_DeleteResponse_descriptor;
    }

    public com.bq.vertxgrpcexample.api.proto.DeleteResponse getDefaultInstanceForType() {
      return com.bq.vertxgrpcexample.api.proto.DeleteResponse.getDefaultInstance();
    }

    public com.bq.vertxgrpcexample.api.proto.DeleteResponse build() {
      com.bq.vertxgrpcexample.api.proto.DeleteResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.bq.vertxgrpcexample.api.proto.DeleteResponse buildPartial() {
      com.bq.vertxgrpcexample.api.proto.DeleteResponse result = new com.bq.vertxgrpcexample.api.proto.DeleteResponse(this);
      result.ok_ = ok_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.bq.vertxgrpcexample.api.proto.DeleteResponse) {
        return mergeFrom((com.bq.vertxgrpcexample.api.proto.DeleteResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bq.vertxgrpcexample.api.proto.DeleteResponse other) {
      if (other == com.bq.vertxgrpcexample.api.proto.DeleteResponse.getDefaultInstance()) return this;
      if (other.getOk() != false) {
        setOk(other.getOk());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.bq.vertxgrpcexample.api.proto.DeleteResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.bq.vertxgrpcexample.api.proto.DeleteResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean ok_ ;
    /**
     * <code>bool ok = 1;</code>
     */
    public boolean getOk() {
      return ok_;
    }
    /**
     * <code>bool ok = 1;</code>
     */
    public Builder setOk(boolean value) {
      
      ok_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ok = 1;</code>
     */
    public Builder clearOk() {
      
      ok_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:proto.DeleteResponse)
  }

  // @@protoc_insertion_point(class_scope:proto.DeleteResponse)
  private static final com.bq.vertxgrpcexample.api.proto.DeleteResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bq.vertxgrpcexample.api.proto.DeleteResponse();
  }

  public static com.bq.vertxgrpcexample.api.proto.DeleteResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteResponse>
      PARSER = new com.google.protobuf.AbstractParser<DeleteResponse>() {
    public DeleteResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DeleteResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteResponse> getParserForType() {
    return PARSER;
  }

  public com.bq.vertxgrpcexample.api.proto.DeleteResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

