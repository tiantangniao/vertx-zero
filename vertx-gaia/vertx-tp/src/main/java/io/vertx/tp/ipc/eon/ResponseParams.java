// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zero.status.proto

package io.vertx.tp.ipc.eon;

/**
 * Protobuf type {@code io.vertx.tp.ipc.eon.ResponseParams}
 */
public  final class ResponseParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.vertx.tp.ipc.eon.ResponseParams)
    ResponseParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResponseParams.newBuilder() to construct.
  private ResponseParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResponseParams() {
    size_ = 0;
    intervalUs_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResponseParams(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            size_ = input.readInt32();
            break;
          }
          case 16: {

            intervalUs_ = input.readInt32();
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
    return io.vertx.tp.ipc.eon.UpStatus.internal_static_io_vertx_tp_ipc_eon_ResponseParams_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.vertx.tp.ipc.eon.UpStatus.internal_static_io_vertx_tp_ipc_eon_ResponseParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.vertx.tp.ipc.eon.ResponseParams.class, io.vertx.tp.ipc.eon.ResponseParams.Builder.class);
  }

  public static final int SIZE_FIELD_NUMBER = 1;
  private int size_;
  /**
   * <pre>
   * Size
   * </pre>
   *
   * <code>int32 size = 1;</code>
   */
  public int getSize() {
    return size_;
  }

  public static final int INTERVAL_US_FIELD_NUMBER = 2;
  private int intervalUs_;
  /**
   * <pre>
   * Interval us
   * </pre>
   *
   * <code>int32 interval_us = 2;</code>
   */
  public int getIntervalUs() {
    return intervalUs_;
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
    if (size_ != 0) {
      output.writeInt32(1, size_);
    }
    if (intervalUs_ != 0) {
      output.writeInt32(2, intervalUs_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (size_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, size_);
    }
    if (intervalUs_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, intervalUs_);
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
    if (!(obj instanceof io.vertx.tp.ipc.eon.ResponseParams)) {
      return super.equals(obj);
    }
    io.vertx.tp.ipc.eon.ResponseParams other = (io.vertx.tp.ipc.eon.ResponseParams) obj;

    boolean result = true;
    result = result && (getSize()
        == other.getSize());
    result = result && (getIntervalUs()
        == other.getIntervalUs());
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
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getSize();
    hash = (37 * hash) + INTERVAL_US_FIELD_NUMBER;
    hash = (53 * hash) + getIntervalUs();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.vertx.tp.ipc.eon.ResponseParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.vertx.tp.ipc.eon.ResponseParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.vertx.tp.ipc.eon.ResponseParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.vertx.tp.ipc.eon.ResponseParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.vertx.tp.ipc.eon.ResponseParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.vertx.tp.ipc.eon.ResponseParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.vertx.tp.ipc.eon.ResponseParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.vertx.tp.ipc.eon.ResponseParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.vertx.tp.ipc.eon.ResponseParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.vertx.tp.ipc.eon.ResponseParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.vertx.tp.ipc.eon.ResponseParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.vertx.tp.ipc.eon.ResponseParams parseFrom(
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
  public static Builder newBuilder(io.vertx.tp.ipc.eon.ResponseParams prototype) {
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
   * Protobuf type {@code io.vertx.tp.ipc.eon.ResponseParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.vertx.tp.ipc.eon.ResponseParams)
      io.vertx.tp.ipc.eon.ResponseParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.vertx.tp.ipc.eon.UpStatus.internal_static_io_vertx_tp_ipc_eon_ResponseParams_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.vertx.tp.ipc.eon.UpStatus.internal_static_io_vertx_tp_ipc_eon_ResponseParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.vertx.tp.ipc.eon.ResponseParams.class, io.vertx.tp.ipc.eon.ResponseParams.Builder.class);
    }

    // Construct using io.vertx.tp.ipc.eon.ResponseParams.newBuilder()
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
      size_ = 0;

      intervalUs_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.vertx.tp.ipc.eon.UpStatus.internal_static_io_vertx_tp_ipc_eon_ResponseParams_descriptor;
    }

    public io.vertx.tp.ipc.eon.ResponseParams getDefaultInstanceForType() {
      return io.vertx.tp.ipc.eon.ResponseParams.getDefaultInstance();
    }

    public io.vertx.tp.ipc.eon.ResponseParams build() {
      io.vertx.tp.ipc.eon.ResponseParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.vertx.tp.ipc.eon.ResponseParams buildPartial() {
      io.vertx.tp.ipc.eon.ResponseParams result = new io.vertx.tp.ipc.eon.ResponseParams(this);
      result.size_ = size_;
      result.intervalUs_ = intervalUs_;
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
      if (other instanceof io.vertx.tp.ipc.eon.ResponseParams) {
        return mergeFrom((io.vertx.tp.ipc.eon.ResponseParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.vertx.tp.ipc.eon.ResponseParams other) {
      if (other == io.vertx.tp.ipc.eon.ResponseParams.getDefaultInstance()) return this;
      if (other.getSize() != 0) {
        setSize(other.getSize());
      }
      if (other.getIntervalUs() != 0) {
        setIntervalUs(other.getIntervalUs());
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
      io.vertx.tp.ipc.eon.ResponseParams parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.vertx.tp.ipc.eon.ResponseParams) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int size_ ;
    /**
     * <pre>
     * Size
     * </pre>
     *
     * <code>int32 size = 1;</code>
     */
    public int getSize() {
      return size_;
    }
    /**
     * <pre>
     * Size
     * </pre>
     *
     * <code>int32 size = 1;</code>
     */
    public Builder setSize(int value) {
      
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Size
     * </pre>
     *
     * <code>int32 size = 1;</code>
     */
    public Builder clearSize() {
      
      size_ = 0;
      onChanged();
      return this;
    }

    private int intervalUs_ ;
    /**
     * <pre>
     * Interval us
     * </pre>
     *
     * <code>int32 interval_us = 2;</code>
     */
    public int getIntervalUs() {
      return intervalUs_;
    }
    /**
     * <pre>
     * Interval us
     * </pre>
     *
     * <code>int32 interval_us = 2;</code>
     */
    public Builder setIntervalUs(int value) {
      
      intervalUs_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Interval us
     * </pre>
     *
     * <code>int32 interval_us = 2;</code>
     */
    public Builder clearIntervalUs() {
      
      intervalUs_ = 0;
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


    // @@protoc_insertion_point(builder_scope:io.vertx.tp.ipc.eon.ResponseParams)
  }

  // @@protoc_insertion_point(class_scope:io.vertx.tp.ipc.eon.ResponseParams)
  private static final io.vertx.tp.ipc.eon.ResponseParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.vertx.tp.ipc.eon.ResponseParams();
  }

  public static io.vertx.tp.ipc.eon.ResponseParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResponseParams>
      PARSER = new com.google.protobuf.AbstractParser<ResponseParams>() {
    public ResponseParams parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResponseParams(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResponseParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResponseParams> getParserForType() {
    return PARSER;
  }

  public io.vertx.tp.ipc.eon.ResponseParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

