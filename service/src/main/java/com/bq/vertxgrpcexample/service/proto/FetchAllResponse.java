// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package com.bq.vertxgrpcexample.service.proto;

/**
 * Protobuf type {@code proto.FetchAllResponse}
 */
public  final class FetchAllResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.FetchAllResponse)
    FetchAllResponseOrBuilder {
  // Use FetchAllResponse.newBuilder() to construct.
  private FetchAllResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FetchAllResponse() {
    people_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FetchAllResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              people_ = new java.util.ArrayList<com.bq.vertxgrpcexample.service.proto.Person>();
              mutable_bitField0_ |= 0x00000001;
            }
            people_.add(
                input.readMessage(com.bq.vertxgrpcexample.service.proto.Person.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        people_ = java.util.Collections.unmodifiableList(people_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.bq.vertxgrpcexample.service.proto.PersonProto.internal_static_proto_FetchAllResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bq.vertxgrpcexample.service.proto.PersonProto.internal_static_proto_FetchAllResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bq.vertxgrpcexample.service.proto.FetchAllResponse.class, com.bq.vertxgrpcexample.service.proto.FetchAllResponse.Builder.class);
  }

  public static final int PEOPLE_FIELD_NUMBER = 1;
  private java.util.List<com.bq.vertxgrpcexample.service.proto.Person> people_;
  /**
   * <code>repeated .proto.Person people = 1;</code>
   */
  public java.util.List<com.bq.vertxgrpcexample.service.proto.Person> getPeopleList() {
    return people_;
  }
  /**
   * <code>repeated .proto.Person people = 1;</code>
   */
  public java.util.List<? extends com.bq.vertxgrpcexample.service.proto.PersonOrBuilder> 
      getPeopleOrBuilderList() {
    return people_;
  }
  /**
   * <code>repeated .proto.Person people = 1;</code>
   */
  public int getPeopleCount() {
    return people_.size();
  }
  /**
   * <code>repeated .proto.Person people = 1;</code>
   */
  public com.bq.vertxgrpcexample.service.proto.Person getPeople(int index) {
    return people_.get(index);
  }
  /**
   * <code>repeated .proto.Person people = 1;</code>
   */
  public com.bq.vertxgrpcexample.service.proto.PersonOrBuilder getPeopleOrBuilder(
      int index) {
    return people_.get(index);
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
    for (int i = 0; i < people_.size(); i++) {
      output.writeMessage(1, people_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < people_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, people_.get(i));
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
    if (!(obj instanceof com.bq.vertxgrpcexample.service.proto.FetchAllResponse)) {
      return super.equals(obj);
    }
    com.bq.vertxgrpcexample.service.proto.FetchAllResponse other = (com.bq.vertxgrpcexample.service.proto.FetchAllResponse) obj;

    boolean result = true;
    result = result && getPeopleList()
        .equals(other.getPeopleList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getPeopleCount() > 0) {
      hash = (37 * hash) + PEOPLE_FIELD_NUMBER;
      hash = (53 * hash) + getPeopleList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bq.vertxgrpcexample.service.proto.FetchAllResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bq.vertxgrpcexample.service.proto.FetchAllResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bq.vertxgrpcexample.service.proto.FetchAllResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bq.vertxgrpcexample.service.proto.FetchAllResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bq.vertxgrpcexample.service.proto.FetchAllResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bq.vertxgrpcexample.service.proto.FetchAllResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bq.vertxgrpcexample.service.proto.FetchAllResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.bq.vertxgrpcexample.service.proto.FetchAllResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bq.vertxgrpcexample.service.proto.FetchAllResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bq.vertxgrpcexample.service.proto.FetchAllResponse parseFrom(
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
  public static Builder newBuilder(com.bq.vertxgrpcexample.service.proto.FetchAllResponse prototype) {
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
   * Protobuf type {@code proto.FetchAllResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.FetchAllResponse)
      com.bq.vertxgrpcexample.service.proto.FetchAllResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bq.vertxgrpcexample.service.proto.PersonProto.internal_static_proto_FetchAllResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bq.vertxgrpcexample.service.proto.PersonProto.internal_static_proto_FetchAllResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bq.vertxgrpcexample.service.proto.FetchAllResponse.class, com.bq.vertxgrpcexample.service.proto.FetchAllResponse.Builder.class);
    }

    // Construct using com.bq.vertxgrpcexample.service.proto.FetchAllResponse.newBuilder()
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
        getPeopleFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (peopleBuilder_ == null) {
        people_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        peopleBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bq.vertxgrpcexample.service.proto.PersonProto.internal_static_proto_FetchAllResponse_descriptor;
    }

    public com.bq.vertxgrpcexample.service.proto.FetchAllResponse getDefaultInstanceForType() {
      return com.bq.vertxgrpcexample.service.proto.FetchAllResponse.getDefaultInstance();
    }

    public com.bq.vertxgrpcexample.service.proto.FetchAllResponse build() {
      com.bq.vertxgrpcexample.service.proto.FetchAllResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.bq.vertxgrpcexample.service.proto.FetchAllResponse buildPartial() {
      com.bq.vertxgrpcexample.service.proto.FetchAllResponse result = new com.bq.vertxgrpcexample.service.proto.FetchAllResponse(this);
      int from_bitField0_ = bitField0_;
      if (peopleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          people_ = java.util.Collections.unmodifiableList(people_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.people_ = people_;
      } else {
        result.people_ = peopleBuilder_.build();
      }
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
      if (other instanceof com.bq.vertxgrpcexample.service.proto.FetchAllResponse) {
        return mergeFrom((com.bq.vertxgrpcexample.service.proto.FetchAllResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bq.vertxgrpcexample.service.proto.FetchAllResponse other) {
      if (other == com.bq.vertxgrpcexample.service.proto.FetchAllResponse.getDefaultInstance()) return this;
      if (peopleBuilder_ == null) {
        if (!other.people_.isEmpty()) {
          if (people_.isEmpty()) {
            people_ = other.people_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePeopleIsMutable();
            people_.addAll(other.people_);
          }
          onChanged();
        }
      } else {
        if (!other.people_.isEmpty()) {
          if (peopleBuilder_.isEmpty()) {
            peopleBuilder_.dispose();
            peopleBuilder_ = null;
            people_ = other.people_;
            bitField0_ = (bitField0_ & ~0x00000001);
            peopleBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPeopleFieldBuilder() : null;
          } else {
            peopleBuilder_.addAllMessages(other.people_);
          }
        }
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
      com.bq.vertxgrpcexample.service.proto.FetchAllResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.bq.vertxgrpcexample.service.proto.FetchAllResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.bq.vertxgrpcexample.service.proto.Person> people_ =
      java.util.Collections.emptyList();
    private void ensurePeopleIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        people_ = new java.util.ArrayList<com.bq.vertxgrpcexample.service.proto.Person>(people_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bq.vertxgrpcexample.service.proto.Person, com.bq.vertxgrpcexample.service.proto.Person.Builder, com.bq.vertxgrpcexample.service.proto.PersonOrBuilder> peopleBuilder_;

    /**
     * <code>repeated .proto.Person people = 1;</code>
     */
    public java.util.List<com.bq.vertxgrpcexample.service.proto.Person> getPeopleList() {
      if (peopleBuilder_ == null) {
        return java.util.Collections.unmodifiableList(people_);
      } else {
        return peopleBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.Person people = 1;</code>
     */
    public int getPeopleCount() {
      if (peopleBuilder_ == null) {
        return people_.size();
      } else {
        return peopleBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.Person people = 1;</code>
     */
    public com.bq.vertxgrpcexample.service.proto.Person getPeople(int index) {
      if (peopleBuilder_ == null) {
        return people_.get(index);
      } else {
        return peopleBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.Person people = 1;</code>
     */
    public Builder setPeople(
        int index, com.bq.vertxgrpcexample.service.proto.Person value) {
      if (peopleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePeopleIsMutable();
        people_.set(index, value);
        onChanged();
      } else {
        peopleBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Person people = 1;</code>
     */
    public Builder setPeople(
        int index, com.bq.vertxgrpcexample.service.proto.Person.Builder builderForValue) {
      if (peopleBuilder_ == null) {
        ensurePeopleIsMutable();
        people_.set(index, builderForValue.build());
        onChanged();
      } else {
        peopleBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Person people = 1;</code>
     */
    public Builder addPeople(com.bq.vertxgrpcexample.service.proto.Person value) {
      if (peopleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePeopleIsMutable();
        people_.add(value);
        onChanged();
      } else {
        peopleBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Person people = 1;</code>
     */
    public Builder addPeople(
        int index, com.bq.vertxgrpcexample.service.proto.Person value) {
      if (peopleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePeopleIsMutable();
        people_.add(index, value);
        onChanged();
      } else {
        peopleBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Person people = 1;</code>
     */
    public Builder addPeople(
        com.bq.vertxgrpcexample.service.proto.Person.Builder builderForValue) {
      if (peopleBuilder_ == null) {
        ensurePeopleIsMutable();
        people_.add(builderForValue.build());
        onChanged();
      } else {
        peopleBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Person people = 1;</code>
     */
    public Builder addPeople(
        int index, com.bq.vertxgrpcexample.service.proto.Person.Builder builderForValue) {
      if (peopleBuilder_ == null) {
        ensurePeopleIsMutable();
        people_.add(index, builderForValue.build());
        onChanged();
      } else {
        peopleBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Person people = 1;</code>
     */
    public Builder addAllPeople(
        java.lang.Iterable<? extends com.bq.vertxgrpcexample.service.proto.Person> values) {
      if (peopleBuilder_ == null) {
        ensurePeopleIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, people_);
        onChanged();
      } else {
        peopleBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Person people = 1;</code>
     */
    public Builder clearPeople() {
      if (peopleBuilder_ == null) {
        people_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        peopleBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.Person people = 1;</code>
     */
    public Builder removePeople(int index) {
      if (peopleBuilder_ == null) {
        ensurePeopleIsMutable();
        people_.remove(index);
        onChanged();
      } else {
        peopleBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Person people = 1;</code>
     */
    public com.bq.vertxgrpcexample.service.proto.Person.Builder getPeopleBuilder(
        int index) {
      return getPeopleFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.Person people = 1;</code>
     */
    public com.bq.vertxgrpcexample.service.proto.PersonOrBuilder getPeopleOrBuilder(
        int index) {
      if (peopleBuilder_ == null) {
        return people_.get(index);  } else {
        return peopleBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.Person people = 1;</code>
     */
    public java.util.List<? extends com.bq.vertxgrpcexample.service.proto.PersonOrBuilder> 
         getPeopleOrBuilderList() {
      if (peopleBuilder_ != null) {
        return peopleBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(people_);
      }
    }
    /**
     * <code>repeated .proto.Person people = 1;</code>
     */
    public com.bq.vertxgrpcexample.service.proto.Person.Builder addPeopleBuilder() {
      return getPeopleFieldBuilder().addBuilder(
          com.bq.vertxgrpcexample.service.proto.Person.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Person people = 1;</code>
     */
    public com.bq.vertxgrpcexample.service.proto.Person.Builder addPeopleBuilder(
        int index) {
      return getPeopleFieldBuilder().addBuilder(
          index, com.bq.vertxgrpcexample.service.proto.Person.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Person people = 1;</code>
     */
    public java.util.List<com.bq.vertxgrpcexample.service.proto.Person.Builder> 
         getPeopleBuilderList() {
      return getPeopleFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bq.vertxgrpcexample.service.proto.Person, com.bq.vertxgrpcexample.service.proto.Person.Builder, com.bq.vertxgrpcexample.service.proto.PersonOrBuilder> 
        getPeopleFieldBuilder() {
      if (peopleBuilder_ == null) {
        peopleBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.bq.vertxgrpcexample.service.proto.Person, com.bq.vertxgrpcexample.service.proto.Person.Builder, com.bq.vertxgrpcexample.service.proto.PersonOrBuilder>(
                people_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        people_ = null;
      }
      return peopleBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:proto.FetchAllResponse)
  }

  // @@protoc_insertion_point(class_scope:proto.FetchAllResponse)
  private static final com.bq.vertxgrpcexample.service.proto.FetchAllResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bq.vertxgrpcexample.service.proto.FetchAllResponse();
  }

  public static com.bq.vertxgrpcexample.service.proto.FetchAllResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetchAllResponse>
      PARSER = new com.google.protobuf.AbstractParser<FetchAllResponse>() {
    public FetchAllResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new FetchAllResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FetchAllResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FetchAllResponse> getParserForType() {
    return PARSER;
  }

  public com.bq.vertxgrpcexample.service.proto.FetchAllResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

