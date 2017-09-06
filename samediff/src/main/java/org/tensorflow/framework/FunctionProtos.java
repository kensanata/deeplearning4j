// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/function.proto

package org.tensorflow.framework;

public final class FunctionProtos {
  private FunctionProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FunctionDefLibrary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_FunctionDefLibrary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FunctionDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_FunctionDef_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FunctionDef_AttrEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_FunctionDef_AttrEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FunctionDef_RetEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_FunctionDef_RetEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GradientDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GradientDef_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n(tensorflow/core/framework/function.pro" +
      "to\022\ntensorflow\032*tensorflow/core/framewor" +
      "k/attr_value.proto\032(tensorflow/core/fram" +
      "ework/node_def.proto\032&tensorflow/core/fr" +
      "amework/op_def.proto\"j\n\022FunctionDefLibra" +
      "ry\022)\n\010function\030\001 \003(\0132\027.tensorflow.Functi" +
      "onDef\022)\n\010gradient\030\002 \003(\0132\027.tensorflow.Gra" +
      "dientDef\"\252\002\n\013FunctionDef\022$\n\tsignature\030\001 " +
      "\001(\0132\021.tensorflow.OpDef\022/\n\004attr\030\005 \003(\0132!.t" +
      "ensorflow.FunctionDef.AttrEntry\022%\n\010node_",
      "def\030\003 \003(\0132\023.tensorflow.NodeDef\022-\n\003ret\030\004 " +
      "\003(\0132 .tensorflow.FunctionDef.RetEntry\032B\n" +
      "\tAttrEntry\022\013\n\003key\030\001 \001(\t\022$\n\005value\030\002 \001(\0132\025" +
      ".tensorflow.AttrValue:\0028\001\032*\n\010RetEntry\022\013\n" +
      "\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\";\n\013Gradien" +
      "tDef\022\025\n\rfunction_name\030\001 \001(\t\022\025\n\rgradient_" +
      "func\030\002 \001(\tB/\n\030org.tensorflow.frameworkB\016" +
      "FunctionProtosP\001\370\001\001b\006proto3"
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
          AttrValueProtos.getDescriptor(),
          NodeProto.getDescriptor(),
          OpDefProtos.getDescriptor(),
        }, assigner);
    internal_static_tensorflow_FunctionDefLibrary_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_FunctionDefLibrary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_FunctionDefLibrary_descriptor,
        new String[] { "Function", "Gradient", });
    internal_static_tensorflow_FunctionDef_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_FunctionDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_FunctionDef_descriptor,
        new String[] { "Signature", "Attr", "NodeDef", "Ret", });
    internal_static_tensorflow_FunctionDef_AttrEntry_descriptor =
      internal_static_tensorflow_FunctionDef_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_FunctionDef_AttrEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_FunctionDef_AttrEntry_descriptor,
        new String[] { "Key", "Value", });
    internal_static_tensorflow_FunctionDef_RetEntry_descriptor =
      internal_static_tensorflow_FunctionDef_descriptor.getNestedTypes().get(1);
    internal_static_tensorflow_FunctionDef_RetEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_FunctionDef_RetEntry_descriptor,
        new String[] { "Key", "Value", });
    internal_static_tensorflow_GradientDef_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_GradientDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GradientDef_descriptor,
        new String[] { "FunctionName", "GradientFunc", });
    AttrValueProtos.getDescriptor();
    NodeProto.getDescriptor();
    OpDefProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
