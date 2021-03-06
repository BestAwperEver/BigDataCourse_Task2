// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: simple.proto

package ru.spbu.pt.bd.grpc;

/**
 * Protobuf type {@code FactorRequest}
 */
public  final class FactorRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FactorRequest)
    FactorRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FactorRequest.newBuilder() to construct.
  private FactorRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FactorRequest() {
    number_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FactorRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            number_ = input.readInt64();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ru.spbu.pt.bd.grpc.SampleServiceProto.internal_static_FactorRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ru.spbu.pt.bd.grpc.SampleServiceProto.internal_static_FactorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ru.spbu.pt.bd.grpc.FactorRequest.class, ru.spbu.pt.bd.grpc.FactorRequest.Builder.class);
  }

  public static final int NUMBER_FIELD_NUMBER = 1;
  private long number_;
  /**
   * <code>int64 number = 1;</code>
   */
  public long getNumber() {
    return number_;
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
    if (number_ != 0L) {
      output.writeInt64(1, number_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (number_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, number_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ru.spbu.pt.bd.grpc.FactorRequest)) {
      return super.equals(obj);
    }
    ru.spbu.pt.bd.grpc.FactorRequest other = (ru.spbu.pt.bd.grpc.FactorRequest) obj;

    boolean result = true;
    result = result && (getNumber()
        == other.getNumber());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumber());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ru.spbu.pt.bd.grpc.FactorRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.spbu.pt.bd.grpc.FactorRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.spbu.pt.bd.grpc.FactorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.spbu.pt.bd.grpc.FactorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.spbu.pt.bd.grpc.FactorRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.spbu.pt.bd.grpc.FactorRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.spbu.pt.bd.grpc.FactorRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.spbu.pt.bd.grpc.FactorRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.spbu.pt.bd.grpc.FactorRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ru.spbu.pt.bd.grpc.FactorRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.spbu.pt.bd.grpc.FactorRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.spbu.pt.bd.grpc.FactorRequest parseFrom(
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
  public static Builder newBuilder(ru.spbu.pt.bd.grpc.FactorRequest prototype) {
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
   * Protobuf type {@code FactorRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FactorRequest)
      ru.spbu.pt.bd.grpc.FactorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.spbu.pt.bd.grpc.SampleServiceProto.internal_static_FactorRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.spbu.pt.bd.grpc.SampleServiceProto.internal_static_FactorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.spbu.pt.bd.grpc.FactorRequest.class, ru.spbu.pt.bd.grpc.FactorRequest.Builder.class);
    }

    // Construct using ru.spbu.pt.bd.grpc.FactorRequest.newBuilder()
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
      number_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ru.spbu.pt.bd.grpc.SampleServiceProto.internal_static_FactorRequest_descriptor;
    }

    public ru.spbu.pt.bd.grpc.FactorRequest getDefaultInstanceForType() {
      return ru.spbu.pt.bd.grpc.FactorRequest.getDefaultInstance();
    }

    public ru.spbu.pt.bd.grpc.FactorRequest build() {
      ru.spbu.pt.bd.grpc.FactorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ru.spbu.pt.bd.grpc.FactorRequest buildPartial() {
      ru.spbu.pt.bd.grpc.FactorRequest result = new ru.spbu.pt.bd.grpc.FactorRequest(this);
      result.number_ = number_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ru.spbu.pt.bd.grpc.FactorRequest) {
        return mergeFrom((ru.spbu.pt.bd.grpc.FactorRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ru.spbu.pt.bd.grpc.FactorRequest other) {
      if (other == ru.spbu.pt.bd.grpc.FactorRequest.getDefaultInstance()) return this;
      if (other.getNumber() != 0L) {
        setNumber(other.getNumber());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      ru.spbu.pt.bd.grpc.FactorRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ru.spbu.pt.bd.grpc.FactorRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long number_ ;
    /**
     * <code>int64 number = 1;</code>
     */
    public long getNumber() {
      return number_;
    }
    /**
     * <code>int64 number = 1;</code>
     */
    public Builder setNumber(long value) {
      
      number_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 number = 1;</code>
     */
    public Builder clearNumber() {
      
      number_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:FactorRequest)
  }

  // @@protoc_insertion_point(class_scope:FactorRequest)
  private static final ru.spbu.pt.bd.grpc.FactorRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ru.spbu.pt.bd.grpc.FactorRequest();
  }

  public static ru.spbu.pt.bd.grpc.FactorRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FactorRequest>
      PARSER = new com.google.protobuf.AbstractParser<FactorRequest>() {
    public FactorRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new FactorRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FactorRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FactorRequest> getParserForType() {
    return PARSER;
  }

  public ru.spbu.pt.bd.grpc.FactorRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

