// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: simple.proto

package ru.spbu.pt.bd.grpc;

public final class SampleServiceProto {
  private SampleServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FactorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FactorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FactorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FactorResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014simple.proto\"\036\n\013InfoRequest\022\017\n\007printMe" +
      "\030\001 \001(\t\"0\n\014InfoResponse\022\022\n\nsystemName\030\001 \001" +
      "(\t\022\014\n\004time\030\002 \001(\t\"\037\n\rFactorRequest\022\016\n\006num" +
      "ber\030\001 \001(\003\"-\n\016FactorResponse\022\033\n\023formatted" +
      "Factorized\030\001 \001(\t2v\n\rSampleService\022.\n\rget" +
      "SystemInfo\022\014.InfoRequest\032\r.InfoResponse\"" +
      "\000\0225\n\020getFactorization\022\016.FactorRequest\032\017." +
      "FactorResponse\"\000B*\n\022ru.spbu.pt.bd.grpcB\022" +
      "SampleServiceProtoP\001b\006proto3"
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
    internal_static_InfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InfoRequest_descriptor,
        new java.lang.String[] { "PrintMe", });
    internal_static_InfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_InfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InfoResponse_descriptor,
        new java.lang.String[] { "SystemName", "Time", });
    internal_static_FactorRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_FactorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FactorRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_FactorResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_FactorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FactorResponse_descriptor,
        new java.lang.String[] { "FormattedFactorized", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
