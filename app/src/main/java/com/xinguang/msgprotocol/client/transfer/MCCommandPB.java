// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MCCommand.proto

package com.xinguang.msgprotocol.client.transfer;

public final class MCCommandPB {
  private MCCommandPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code MCCommand}
   */
  public enum MCCommand
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     *保留值，不用
     * </pre>
     *
     * <code>RESERVED = 0;</code>
     */
    RESERVED(0),
    /**
     * <pre>
     *token过期
     * </pre>
     *
     * <code>TOKEN_EXPIRED = 1;</code>
     */
    TOKEN_EXPIRED(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     *保留值，不用
     * </pre>
     *
     * <code>RESERVED = 0;</code>
     */
    public static final int RESERVED_VALUE = 0;
    /**
     * <pre>
     *token过期
     * </pre>
     *
     * <code>TOKEN_EXPIRED = 1;</code>
     */
    public static final int TOKEN_EXPIRED_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MCCommand valueOf(int value) {
      return forNumber(value);
    }

    public static MCCommand forNumber(int value) {
      switch (value) {
        case 0: return RESERVED;
        case 1: return TOKEN_EXPIRED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MCCommand>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MCCommand> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MCCommand>() {
            public MCCommand findValueByNumber(int number) {
              return MCCommand.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.xinguang.msgprotocol.client.transfer.MCCommandPB.getDescriptor().getEnumTypes().get(0);
    }

    private static final MCCommand[] VALUES = values();

    public static MCCommand valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MCCommand(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MCCommand)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017MCCommand.proto*,\n\tMCCommand\022\014\n\010RESERV" +
      "ED\020\000\022\021\n\rTOKEN_EXPIRED\020\001B7\n(com.xinguang." +
      "msgprotocol.client.transferB\013MCCommandPB" +
      "b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}