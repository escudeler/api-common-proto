// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ThirdPartService.proto

package escudeler.example.apithirdpart.grpc;

/**
 * <pre>
 *Authorize Response
 * </pre>
 *
 * Protobuf type {@code AuthorizeResponse}
 */
public  final class AuthorizeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AuthorizeResponse)
    AuthorizeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AuthorizeResponse.newBuilder() to construct.
  private AuthorizeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthorizeResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AuthorizeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AuthorizeResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            authorized_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
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
    return escudeler.example.apithirdpart.grpc.ThirdPartService.internal_static_AuthorizeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return escudeler.example.apithirdpart.grpc.ThirdPartService.internal_static_AuthorizeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            escudeler.example.apithirdpart.grpc.AuthorizeResponse.class, escudeler.example.apithirdpart.grpc.AuthorizeResponse.Builder.class);
  }

  public static final int AUTHORIZED_FIELD_NUMBER = 1;
  private boolean authorized_;
  /**
   * <code>bool authorized = 1;</code>
   * @return The authorized.
   */
  public boolean getAuthorized() {
    return authorized_;
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
    if (authorized_ != false) {
      output.writeBool(1, authorized_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (authorized_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, authorized_);
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
    if (!(obj instanceof escudeler.example.apithirdpart.grpc.AuthorizeResponse)) {
      return super.equals(obj);
    }
    escudeler.example.apithirdpart.grpc.AuthorizeResponse other = (escudeler.example.apithirdpart.grpc.AuthorizeResponse) obj;

    if (getAuthorized()
        != other.getAuthorized()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + AUTHORIZED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAuthorized());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static escudeler.example.apithirdpart.grpc.AuthorizeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static escudeler.example.apithirdpart.grpc.AuthorizeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static escudeler.example.apithirdpart.grpc.AuthorizeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static escudeler.example.apithirdpart.grpc.AuthorizeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static escudeler.example.apithirdpart.grpc.AuthorizeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static escudeler.example.apithirdpart.grpc.AuthorizeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static escudeler.example.apithirdpart.grpc.AuthorizeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static escudeler.example.apithirdpart.grpc.AuthorizeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static escudeler.example.apithirdpart.grpc.AuthorizeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static escudeler.example.apithirdpart.grpc.AuthorizeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static escudeler.example.apithirdpart.grpc.AuthorizeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static escudeler.example.apithirdpart.grpc.AuthorizeResponse parseFrom(
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
  public static Builder newBuilder(escudeler.example.apithirdpart.grpc.AuthorizeResponse prototype) {
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
   * <pre>
   *Authorize Response
   * </pre>
   *
   * Protobuf type {@code AuthorizeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AuthorizeResponse)
      escudeler.example.apithirdpart.grpc.AuthorizeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return escudeler.example.apithirdpart.grpc.ThirdPartService.internal_static_AuthorizeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return escudeler.example.apithirdpart.grpc.ThirdPartService.internal_static_AuthorizeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              escudeler.example.apithirdpart.grpc.AuthorizeResponse.class, escudeler.example.apithirdpart.grpc.AuthorizeResponse.Builder.class);
    }

    // Construct using escudeler.example.apithirdpart.grpc.AuthorizeResponse.newBuilder()
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
      authorized_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return escudeler.example.apithirdpart.grpc.ThirdPartService.internal_static_AuthorizeResponse_descriptor;
    }

    @java.lang.Override
    public escudeler.example.apithirdpart.grpc.AuthorizeResponse getDefaultInstanceForType() {
      return escudeler.example.apithirdpart.grpc.AuthorizeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public escudeler.example.apithirdpart.grpc.AuthorizeResponse build() {
      escudeler.example.apithirdpart.grpc.AuthorizeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public escudeler.example.apithirdpart.grpc.AuthorizeResponse buildPartial() {
      escudeler.example.apithirdpart.grpc.AuthorizeResponse result = new escudeler.example.apithirdpart.grpc.AuthorizeResponse(this);
      result.authorized_ = authorized_;
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
      if (other instanceof escudeler.example.apithirdpart.grpc.AuthorizeResponse) {
        return mergeFrom((escudeler.example.apithirdpart.grpc.AuthorizeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(escudeler.example.apithirdpart.grpc.AuthorizeResponse other) {
      if (other == escudeler.example.apithirdpart.grpc.AuthorizeResponse.getDefaultInstance()) return this;
      if (other.getAuthorized() != false) {
        setAuthorized(other.getAuthorized());
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
      escudeler.example.apithirdpart.grpc.AuthorizeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (escudeler.example.apithirdpart.grpc.AuthorizeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean authorized_ ;
    /**
     * <code>bool authorized = 1;</code>
     * @return The authorized.
     */
    public boolean getAuthorized() {
      return authorized_;
    }
    /**
     * <code>bool authorized = 1;</code>
     * @param value The authorized to set.
     * @return This builder for chaining.
     */
    public Builder setAuthorized(boolean value) {
      
      authorized_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool authorized = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthorized() {
      
      authorized_ = false;
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


    // @@protoc_insertion_point(builder_scope:AuthorizeResponse)
  }

  // @@protoc_insertion_point(class_scope:AuthorizeResponse)
  private static final escudeler.example.apithirdpart.grpc.AuthorizeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new escudeler.example.apithirdpart.grpc.AuthorizeResponse();
  }

  public static escudeler.example.apithirdpart.grpc.AuthorizeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthorizeResponse>
      PARSER = new com.google.protobuf.AbstractParser<AuthorizeResponse>() {
    @java.lang.Override
    public AuthorizeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AuthorizeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AuthorizeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuthorizeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public escudeler.example.apithirdpart.grpc.AuthorizeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

