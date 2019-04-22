// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: parking.proto

package org.example.parking;

/**
 * Protobuf type {@code parking.ParkRequest}
 */
public  final class ParkRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:parking.ParkRequest)
    ParkRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ParkRequest.newBuilder() to construct.
  private ParkRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ParkRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ParkRequest(
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
          case 10: {
            org.example.parking.Park.Builder subBuilder = null;
            if (park_ != null) {
              subBuilder = park_.toBuilder();
            }
            park_ = input.readMessage(org.example.parking.Park.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(park_);
              park_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
    return org.example.parking.ParkingProto.internal_static_parking_ParkRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.parking.ParkingProto.internal_static_parking_ParkRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.parking.ParkRequest.class, org.example.parking.ParkRequest.Builder.class);
  }

  public static final int PARK_FIELD_NUMBER = 1;
  private org.example.parking.Park park_;
  /**
   * <code>.parking.Park park = 1;</code>
   */
  public boolean hasPark() {
    return park_ != null;
  }
  /**
   * <code>.parking.Park park = 1;</code>
   */
  public org.example.parking.Park getPark() {
    return park_ == null ? org.example.parking.Park.getDefaultInstance() : park_;
  }
  /**
   * <code>.parking.Park park = 1;</code>
   */
  public org.example.parking.ParkOrBuilder getParkOrBuilder() {
    return getPark();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (park_ != null) {
      output.writeMessage(1, getPark());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (park_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPark());
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
    if (!(obj instanceof org.example.parking.ParkRequest)) {
      return super.equals(obj);
    }
    org.example.parking.ParkRequest other = (org.example.parking.ParkRequest) obj;

    boolean result = true;
    result = result && (hasPark() == other.hasPark());
    if (hasPark()) {
      result = result && getPark()
          .equals(other.getPark());
    }
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
    if (hasPark()) {
      hash = (37 * hash) + PARK_FIELD_NUMBER;
      hash = (53 * hash) + getPark().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.parking.ParkRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.parking.ParkRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.parking.ParkRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.parking.ParkRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.parking.ParkRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.parking.ParkRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.parking.ParkRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.parking.ParkRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.parking.ParkRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.example.parking.ParkRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.parking.ParkRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.parking.ParkRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.example.parking.ParkRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code parking.ParkRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:parking.ParkRequest)
      org.example.parking.ParkRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.parking.ParkingProto.internal_static_parking_ParkRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.parking.ParkingProto.internal_static_parking_ParkRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.parking.ParkRequest.class, org.example.parking.ParkRequest.Builder.class);
    }

    // Construct using org.example.parking.ParkRequest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (parkBuilder_ == null) {
        park_ = null;
      } else {
        park_ = null;
        parkBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.parking.ParkingProto.internal_static_parking_ParkRequest_descriptor;
    }

    @java.lang.Override
    public org.example.parking.ParkRequest getDefaultInstanceForType() {
      return org.example.parking.ParkRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.parking.ParkRequest build() {
      org.example.parking.ParkRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.parking.ParkRequest buildPartial() {
      org.example.parking.ParkRequest result = new org.example.parking.ParkRequest(this);
      if (parkBuilder_ == null) {
        result.park_ = park_;
      } else {
        result.park_ = parkBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.example.parking.ParkRequest) {
        return mergeFrom((org.example.parking.ParkRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.parking.ParkRequest other) {
      if (other == org.example.parking.ParkRequest.getDefaultInstance()) return this;
      if (other.hasPark()) {
        mergePark(other.getPark());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.example.parking.ParkRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.example.parking.ParkRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.example.parking.Park park_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.example.parking.Park, org.example.parking.Park.Builder, org.example.parking.ParkOrBuilder> parkBuilder_;
    /**
     * <code>.parking.Park park = 1;</code>
     */
    public boolean hasPark() {
      return parkBuilder_ != null || park_ != null;
    }
    /**
     * <code>.parking.Park park = 1;</code>
     */
    public org.example.parking.Park getPark() {
      if (parkBuilder_ == null) {
        return park_ == null ? org.example.parking.Park.getDefaultInstance() : park_;
      } else {
        return parkBuilder_.getMessage();
      }
    }
    /**
     * <code>.parking.Park park = 1;</code>
     */
    public Builder setPark(org.example.parking.Park value) {
      if (parkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        park_ = value;
        onChanged();
      } else {
        parkBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.parking.Park park = 1;</code>
     */
    public Builder setPark(
        org.example.parking.Park.Builder builderForValue) {
      if (parkBuilder_ == null) {
        park_ = builderForValue.build();
        onChanged();
      } else {
        parkBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.parking.Park park = 1;</code>
     */
    public Builder mergePark(org.example.parking.Park value) {
      if (parkBuilder_ == null) {
        if (park_ != null) {
          park_ =
            org.example.parking.Park.newBuilder(park_).mergeFrom(value).buildPartial();
        } else {
          park_ = value;
        }
        onChanged();
      } else {
        parkBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.parking.Park park = 1;</code>
     */
    public Builder clearPark() {
      if (parkBuilder_ == null) {
        park_ = null;
        onChanged();
      } else {
        park_ = null;
        parkBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.parking.Park park = 1;</code>
     */
    public org.example.parking.Park.Builder getParkBuilder() {
      
      onChanged();
      return getParkFieldBuilder().getBuilder();
    }
    /**
     * <code>.parking.Park park = 1;</code>
     */
    public org.example.parking.ParkOrBuilder getParkOrBuilder() {
      if (parkBuilder_ != null) {
        return parkBuilder_.getMessageOrBuilder();
      } else {
        return park_ == null ?
            org.example.parking.Park.getDefaultInstance() : park_;
      }
    }
    /**
     * <code>.parking.Park park = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.example.parking.Park, org.example.parking.Park.Builder, org.example.parking.ParkOrBuilder> 
        getParkFieldBuilder() {
      if (parkBuilder_ == null) {
        parkBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.example.parking.Park, org.example.parking.Park.Builder, org.example.parking.ParkOrBuilder>(
                getPark(),
                getParentForChildren(),
                isClean());
        park_ = null;
      }
      return parkBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:parking.ParkRequest)
  }

  // @@protoc_insertion_point(class_scope:parking.ParkRequest)
  private static final org.example.parking.ParkRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.parking.ParkRequest();
  }

  public static org.example.parking.ParkRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ParkRequest>
      PARSER = new com.google.protobuf.AbstractParser<ParkRequest>() {
    @java.lang.Override
    public ParkRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ParkRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ParkRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ParkRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.parking.ParkRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
