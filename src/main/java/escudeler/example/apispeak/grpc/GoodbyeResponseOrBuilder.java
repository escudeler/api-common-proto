// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SpeakService.proto

package escudeler.example.apispeak.grpc;

public interface GoodbyeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GoodbyeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string reply = 1;</code>
   * @return The reply.
   */
  java.lang.String getReply();
  /**
   * <code>string reply = 1;</code>
   * @return The bytes for reply.
   */
  com.google.protobuf.ByteString
      getReplyBytes();

  /**
   * <code>bool like = 2;</code>
   * @return The like.
   */
  boolean getLike();

  /**
   * <code>int64 daysToNewHello = 3;</code>
   * @return The daysToNewHello.
   */
  long getDaysToNewHello();
}
