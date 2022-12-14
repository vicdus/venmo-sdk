// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Venmo.proto

package com.venmo.unofficial.generated;

/**
 * Protobuf type {@code Pagination}
 */
public final class Pagination extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Pagination)
    PaginationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Pagination.newBuilder() to construct.
  private Pagination(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Pagination() {
    previous_ = "";
    next_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Pagination();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.venmo.unofficial.generated.Venmo.internal_static_Pagination_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.venmo.unofficial.generated.Venmo.internal_static_Pagination_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.venmo.unofficial.generated.Pagination.class, com.venmo.unofficial.generated.Pagination.Builder.class);
  }

  public static final int PREVIOUS_FIELD_NUMBER = 1;
  private volatile java.lang.Object previous_;
  /**
   * <code>string previous = 1;</code>
   * @return The previous.
   */
  @java.lang.Override
  public java.lang.String getPrevious() {
    java.lang.Object ref = previous_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      previous_ = s;
      return s;
    }
  }
  /**
   * <code>string previous = 1;</code>
   * @return The bytes for previous.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPreviousBytes() {
    java.lang.Object ref = previous_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      previous_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEXT_FIELD_NUMBER = 2;
  private volatile java.lang.Object next_;
  /**
   * <code>string next = 2;</code>
   * @return The next.
   */
  @java.lang.Override
  public java.lang.String getNext() {
    java.lang.Object ref = next_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      next_ = s;
      return s;
    }
  }
  /**
   * <code>string next = 2;</code>
   * @return The bytes for next.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextBytes() {
    java.lang.Object ref = next_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      next_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(previous_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, previous_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(next_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, next_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(previous_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, previous_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(next_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, next_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.venmo.unofficial.generated.Pagination)) {
      return super.equals(obj);
    }
    com.venmo.unofficial.generated.Pagination other = (com.venmo.unofficial.generated.Pagination) obj;

    if (!getPrevious()
        .equals(other.getPrevious())) return false;
    if (!getNext()
        .equals(other.getNext())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PREVIOUS_FIELD_NUMBER;
    hash = (53 * hash) + getPrevious().hashCode();
    hash = (37 * hash) + NEXT_FIELD_NUMBER;
    hash = (53 * hash) + getNext().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.venmo.unofficial.generated.Pagination parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.venmo.unofficial.generated.Pagination parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.venmo.unofficial.generated.Pagination parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.venmo.unofficial.generated.Pagination parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.venmo.unofficial.generated.Pagination parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.venmo.unofficial.generated.Pagination parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.venmo.unofficial.generated.Pagination parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.venmo.unofficial.generated.Pagination parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.venmo.unofficial.generated.Pagination parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.venmo.unofficial.generated.Pagination parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.venmo.unofficial.generated.Pagination parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.venmo.unofficial.generated.Pagination parseFrom(
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
  public static Builder newBuilder(com.venmo.unofficial.generated.Pagination prototype) {
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
   * Protobuf type {@code Pagination}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Pagination)
      com.venmo.unofficial.generated.PaginationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.venmo.unofficial.generated.Venmo.internal_static_Pagination_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.venmo.unofficial.generated.Venmo.internal_static_Pagination_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.venmo.unofficial.generated.Pagination.class, com.venmo.unofficial.generated.Pagination.Builder.class);
    }

    // Construct using com.venmo.unofficial.generated.Pagination.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      previous_ = "";

      next_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.venmo.unofficial.generated.Venmo.internal_static_Pagination_descriptor;
    }

    @java.lang.Override
    public com.venmo.unofficial.generated.Pagination getDefaultInstanceForType() {
      return com.venmo.unofficial.generated.Pagination.getDefaultInstance();
    }

    @java.lang.Override
    public com.venmo.unofficial.generated.Pagination build() {
      com.venmo.unofficial.generated.Pagination result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.venmo.unofficial.generated.Pagination buildPartial() {
      com.venmo.unofficial.generated.Pagination result = new com.venmo.unofficial.generated.Pagination(this);
      result.previous_ = previous_;
      result.next_ = next_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.venmo.unofficial.generated.Pagination) {
        return mergeFrom((com.venmo.unofficial.generated.Pagination)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.venmo.unofficial.generated.Pagination other) {
      if (other == com.venmo.unofficial.generated.Pagination.getDefaultInstance()) return this;
      if (!other.getPrevious().isEmpty()) {
        previous_ = other.previous_;
        onChanged();
      }
      if (!other.getNext().isEmpty()) {
        next_ = other.next_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              previous_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              next_ = input.readStringRequireUtf8();

              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object previous_ = "";
    /**
     * <code>string previous = 1;</code>
     * @return The previous.
     */
    public java.lang.String getPrevious() {
      java.lang.Object ref = previous_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        previous_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string previous = 1;</code>
     * @return The bytes for previous.
     */
    public com.google.protobuf.ByteString
        getPreviousBytes() {
      java.lang.Object ref = previous_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        previous_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string previous = 1;</code>
     * @param value The previous to set.
     * @return This builder for chaining.
     */
    public Builder setPrevious(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      previous_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string previous = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrevious() {
      
      previous_ = getDefaultInstance().getPrevious();
      onChanged();
      return this;
    }
    /**
     * <code>string previous = 1;</code>
     * @param value The bytes for previous to set.
     * @return This builder for chaining.
     */
    public Builder setPreviousBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      previous_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object next_ = "";
    /**
     * <code>string next = 2;</code>
     * @return The next.
     */
    public java.lang.String getNext() {
      java.lang.Object ref = next_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        next_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string next = 2;</code>
     * @return The bytes for next.
     */
    public com.google.protobuf.ByteString
        getNextBytes() {
      java.lang.Object ref = next_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        next_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string next = 2;</code>
     * @param value The next to set.
     * @return This builder for chaining.
     */
    public Builder setNext(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      next_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string next = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNext() {
      
      next_ = getDefaultInstance().getNext();
      onChanged();
      return this;
    }
    /**
     * <code>string next = 2;</code>
     * @param value The bytes for next to set.
     * @return This builder for chaining.
     */
    public Builder setNextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      next_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Pagination)
  }

  // @@protoc_insertion_point(class_scope:Pagination)
  private static final com.venmo.unofficial.generated.Pagination DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.venmo.unofficial.generated.Pagination();
  }

  public static com.venmo.unofficial.generated.Pagination getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Pagination>
      PARSER = new com.google.protobuf.AbstractParser<Pagination>() {
    @java.lang.Override
    public Pagination parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Pagination> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Pagination> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.venmo.unofficial.generated.Pagination getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

