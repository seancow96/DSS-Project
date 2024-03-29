// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: radio.proto

package org.example.radio;

public final class RadioProto {
  private RadioProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_radio_Channel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_radio_Channel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_radio_ChannelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_radio_ChannelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_radio_ChannelResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_radio_ChannelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_radio_Radio_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_radio_Radio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_radio_RadioRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_radio_RadioRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_radio_RadioResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_radio_RadioResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_radio_VolumeUpResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_radio_VolumeUpResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_radio_VolumeDownResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_radio_VolumeDownResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013radio.proto\022\005radio\032\033google/protobuf/em" +
      "pty.proto\"Q\n\007Channel\022\020\n\010channel1\030\001 \001(\t\022\020" +
      "\n\010channel2\030\002 \001(\t\022\020\n\010channel3\030\003 \001(\t\022\020\n\010ch" +
      "annel4\030\004 \001(\t\"1\n\016ChannelRequest\022\037\n\007channe" +
      "l\030\001 \001(\0132\016.radio.Channel\"\"\n\017ChannelRespon" +
      "se\022\017\n\007channel\030\001 \001(\t\"2\n\005Radio\022\023\n\013turnradi" +
      "oon\030\001 \001(\t\022\024\n\014turnradiooff\030\002 \001(\t\"+\n\014Radio" +
      "Request\022\033\n\005radio\030\001 \001(\0132\014.radio.Radio\"#\n\r" +
      "RadioResponse\022\022\n\nradiostate\030\001 \001(\t\")\n\020Vol" +
      "umeUpResponse\022\025\n\rcurrentvolume\030\001 \001(\005\"+\n\022" +
      "VolumeDownResponse\022\025\n\rcurrentvolume\030\001 \001(" +
      "\0052\375\003\n\014RadioService\0226\n\007RadioOn\022\023.radio.Ra" +
      "dioRequest\032\024.radio.RadioResponse\"\000\0227\n\010Ra" +
      "dioOff\022\023.radio.RadioRequest\032\024.radio.Radi" +
      "oResponse\"\000\022=\n\010Channel1\022\025.radio.ChannelR" +
      "equest\032\026.radio.ChannelResponse\"\000(\001\022=\n\010Ch" +
      "annel2\022\025.radio.ChannelRequest\032\026.radio.Ch" +
      "annelResponse\"\000(\001\022=\n\010Channel3\022\025.radio.Ch" +
      "annelRequest\032\026.radio.ChannelResponse\"\000(\001" +
      "\022=\n\010Channel4\022\025.radio.ChannelRequest\032\026.ra" +
      "dio.ChannelResponse\"\000(\001\022=\n\010VolumeUp\022\026.go" +
      "ogle.protobuf.Empty\032\027.radio.VolumeUpResp" +
      "onse\"\000\022A\n\nVolumeDown\022\026.google.protobuf.E" +
      "mpty\032\031.radio.VolumeDownResponse\"\000B!\n\021org" +
      ".example.radioB\nRadioProtoP\001b\006proto3"
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
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_radio_Channel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_radio_Channel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_radio_Channel_descriptor,
        new java.lang.String[] { "Channel1", "Channel2", "Channel3", "Channel4", });
    internal_static_radio_ChannelRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_radio_ChannelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_radio_ChannelRequest_descriptor,
        new java.lang.String[] { "Channel", });
    internal_static_radio_ChannelResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_radio_ChannelResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_radio_ChannelResponse_descriptor,
        new java.lang.String[] { "Channel", });
    internal_static_radio_Radio_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_radio_Radio_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_radio_Radio_descriptor,
        new java.lang.String[] { "Turnradioon", "Turnradiooff", });
    internal_static_radio_RadioRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_radio_RadioRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_radio_RadioRequest_descriptor,
        new java.lang.String[] { "Radio", });
    internal_static_radio_RadioResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_radio_RadioResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_radio_RadioResponse_descriptor,
        new java.lang.String[] { "Radiostate", });
    internal_static_radio_VolumeUpResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_radio_VolumeUpResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_radio_VolumeUpResponse_descriptor,
        new java.lang.String[] { "Currentvolume", });
    internal_static_radio_VolumeDownResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_radio_VolumeDownResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_radio_VolumeDownResponse_descriptor,
        new java.lang.String[] { "Currentvolume", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
