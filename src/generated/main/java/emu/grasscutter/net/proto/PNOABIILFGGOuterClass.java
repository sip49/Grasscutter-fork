// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PNOABIILFGG.proto

package emu.grasscutter.net.proto;

public final class PNOABIILFGGOuterClass {
  private PNOABIILFGGOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PNOABIILFGGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PNOABIILFGG)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string EDEECLCIJCG = 13;</code>
     * @return The eDEECLCIJCG.
     */
    java.lang.String getEDEECLCIJCG();
    /**
     * <code>string EDEECLCIJCG = 13;</code>
     * @return The bytes for eDEECLCIJCG.
     */
    com.google.protobuf.ByteString
        getEDEECLCIJCGBytes();
  }
  /**
   * <pre>
   * CmdId: 20064
   * </pre>
   *
   * Protobuf type {@code PNOABIILFGG}
   */
  public static final class PNOABIILFGG extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PNOABIILFGG)
      PNOABIILFGGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PNOABIILFGG.newBuilder() to construct.
    private PNOABIILFGG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PNOABIILFGG() {
      eDEECLCIJCG_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PNOABIILFGG();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PNOABIILFGG(
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
            case 106: {
              java.lang.String s = input.readStringRequireUtf8();

              eDEECLCIJCG_ = s;
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
      return emu.grasscutter.net.proto.PNOABIILFGGOuterClass.internal_static_PNOABIILFGG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PNOABIILFGGOuterClass.internal_static_PNOABIILFGG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG.class, emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG.Builder.class);
    }

    public static final int EDEECLCIJCG_FIELD_NUMBER = 13;
    private volatile java.lang.Object eDEECLCIJCG_;
    /**
     * <code>string EDEECLCIJCG = 13;</code>
     * @return The eDEECLCIJCG.
     */
    @java.lang.Override
    public java.lang.String getEDEECLCIJCG() {
      java.lang.Object ref = eDEECLCIJCG_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eDEECLCIJCG_ = s;
        return s;
      }
    }
    /**
     * <code>string EDEECLCIJCG = 13;</code>
     * @return The bytes for eDEECLCIJCG.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEDEECLCIJCGBytes() {
      java.lang.Object ref = eDEECLCIJCG_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eDEECLCIJCG_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eDEECLCIJCG_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 13, eDEECLCIJCG_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eDEECLCIJCG_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(13, eDEECLCIJCG_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG other = (emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG) obj;

      if (!getEDEECLCIJCG()
          .equals(other.getEDEECLCIJCG())) return false;
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
      hash = (37 * hash) + EDEECLCIJCG_FIELD_NUMBER;
      hash = (53 * hash) + getEDEECLCIJCG().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG prototype) {
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
     * CmdId: 20064
     * </pre>
     *
     * Protobuf type {@code PNOABIILFGG}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PNOABIILFGG)
        emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PNOABIILFGGOuterClass.internal_static_PNOABIILFGG_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PNOABIILFGGOuterClass.internal_static_PNOABIILFGG_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG.class, emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG.newBuilder()
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
        eDEECLCIJCG_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PNOABIILFGGOuterClass.internal_static_PNOABIILFGG_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG build() {
        emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG buildPartial() {
        emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG result = new emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG(this);
        result.eDEECLCIJCG_ = eDEECLCIJCG_;
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
        if (other instanceof emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG) {
          return mergeFrom((emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG other) {
        if (other == emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG.getDefaultInstance()) return this;
        if (!other.getEDEECLCIJCG().isEmpty()) {
          eDEECLCIJCG_ = other.eDEECLCIJCG_;
          onChanged();
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
        emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object eDEECLCIJCG_ = "";
      /**
       * <code>string EDEECLCIJCG = 13;</code>
       * @return The eDEECLCIJCG.
       */
      public java.lang.String getEDEECLCIJCG() {
        java.lang.Object ref = eDEECLCIJCG_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          eDEECLCIJCG_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string EDEECLCIJCG = 13;</code>
       * @return The bytes for eDEECLCIJCG.
       */
      public com.google.protobuf.ByteString
          getEDEECLCIJCGBytes() {
        java.lang.Object ref = eDEECLCIJCG_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          eDEECLCIJCG_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string EDEECLCIJCG = 13;</code>
       * @param value The eDEECLCIJCG to set.
       * @return This builder for chaining.
       */
      public Builder setEDEECLCIJCG(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        eDEECLCIJCG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string EDEECLCIJCG = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearEDEECLCIJCG() {
        
        eDEECLCIJCG_ = getDefaultInstance().getEDEECLCIJCG();
        onChanged();
        return this;
      }
      /**
       * <code>string EDEECLCIJCG = 13;</code>
       * @param value The bytes for eDEECLCIJCG to set.
       * @return This builder for chaining.
       */
      public Builder setEDEECLCIJCGBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        eDEECLCIJCG_ = value;
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


      // @@protoc_insertion_point(builder_scope:PNOABIILFGG)
    }

    // @@protoc_insertion_point(class_scope:PNOABIILFGG)
    private static final emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG();
    }

    public static emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PNOABIILFGG>
        PARSER = new com.google.protobuf.AbstractParser<PNOABIILFGG>() {
      @java.lang.Override
      public PNOABIILFGG parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PNOABIILFGG(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PNOABIILFGG> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PNOABIILFGG> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PNOABIILFGGOuterClass.PNOABIILFGG getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PNOABIILFGG_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PNOABIILFGG_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021PNOABIILFGG.proto\"\"\n\013PNOABIILFGG\022\023\n\013ED" +
      "EECLCIJCG\030\r \001(\tB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PNOABIILFGG_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PNOABIILFGG_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PNOABIILFGG_descriptor,
        new java.lang.String[] { "EDEECLCIJCG", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}