// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SpeakService.proto

package escudeler.example.apispeak.grpc;

public final class SpeakService {
  private SpeakService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SpeakRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SpeakRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HelloResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GoodbyeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GoodbyeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022SpeakService.proto\032\033google/protobuf/em" +
      "pty.proto\"\"\n\014SpeakRequest\022\022\n\npeopleName\030" +
      "\001 \001(\t\"\036\n\rHelloResponse\022\r\n\005reply\030\001 \001(\t\"F\n" +
      "\017GoodbyeResponse\022\r\n\005reply\030\001 \001(\t\022\014\n\004like\030" +
      "\002 \001(\010\022\026\n\016daysToNewHello\030\003 \001(\0032\340\001\n\020SpeakG" +
      "rpcService\022&\n\005hello\022\r.SpeakRequest\032\016.Hel" +
      "loResponse\022*\n\007goodbye\022\r.SpeakRequest\032\020.G" +
      "oodbyeResponse\0227\n\016strangerPeople\022\r.Speak" +
      "Request\032\026.google.protobuf.Empty\022?\n\rclean" +
      "Stranger\022\026.google.protobuf.Empty\032\026.googl" +
      "e.protobuf.EmptyB#\n\037escudeler.example.ap" +
      "ispeak.grpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_SpeakRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SpeakRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SpeakRequest_descriptor,
        new java.lang.String[] { "PeopleName", });
    internal_static_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HelloResponse_descriptor,
        new java.lang.String[] { "Reply", });
    internal_static_GoodbyeResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_GoodbyeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GoodbyeResponse_descriptor,
        new java.lang.String[] { "Reply", "Like", "DaysToNewHello", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}