// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: parking.proto

package org.example.parking;

public final class ParkingProto {
  private ParkingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_parking_DetailResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_parking_DetailResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_parking_Detail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_parking_Detail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_parking_Engine_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_parking_Engine_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_parking_EngineRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_parking_EngineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_parking_EngineResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_parking_EngineResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_parking_SensorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_parking_SensorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_parking_SensorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_parking_SensorResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_parking_Sensors_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_parking_Sensors_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_parking_DriveResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_parking_DriveResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_parking_IncreaseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_parking_IncreaseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_parking_DecreaseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_parking_DecreaseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_parking_ParkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_parking_ParkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_parking_ParkResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_parking_ParkResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_parking_Park_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_parking_Park_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rparking.proto\022\007parking\032\033google/protobu" +
      "f/empty.proto\"2\n\016DetailResponse\022 \n\007detai" +
      "ls\030\001 \003(\0132\017.parking.Detail\"I\n\006Detail\022\014\n\004t" +
      "ype\030\001 \001(\t\022\021\n\twheelbase\030\002 \001(\t\022\016\n\006length\030\003" +
      " \001(\t\022\016\n\006height\030\004 \001(\t\"C\n\006Engine\022\024\n\014turnen" +
      "gineon\030\001 \001(\t\022\025\n\rturnengineoff\030\002 \001(\t\022\014\n\004s" +
      "top\030\003 \001(\t\"0\n\rEngineRequest\022\037\n\006engine\030\001 \001" +
      "(\0132\017.parking.Engine\"&\n\016EngineResponse\022\024\n" +
      "\014enginestatus\030\001 \001(\t\"2\n\rSensorRequest\022!\n\007" +
      "sensors\030\001 \001(\0132\020.parking.Sensors\" \n\016Senso" +
      "rResponse\022\016\n\006result\030\001 \001(\t\"\027\n\007Sensors\022\014\n\004" +
      "park\030\001 \001(\t\"%\n\rDriveResponse\022\024\n\014currentsp" +
      "eed\030\001 \001(\005\"(\n\020IncreaseResponse\022\024\n\014current" +
      "speed\030\001 \001(\005\"(\n\020DecreaseResponse\022\024\n\014curre" +
      "ntspeed\030\001 \001(\005\"*\n\013ParkRequest\022\033\n\004park\030\001 \001" +
      "(\0132\r.parking.Park\"\036\n\014ParkResponse\022\016\n\006res" +
      "ult\030\001 \001(\t\"\026\n\004Park\022\016\n\006parked\030\001 \001(\t2\317\004\n\016Pa" +
      "rkingService\022=\n\010EngineOn\022\026.parking.Engin" +
      "eRequest\032\027.parking.EngineResponse\"\000\022>\n\tE" +
      "ngineOff\022\026.parking.EngineRequest\032\027.parki" +
      "ng.EngineResponse\"\000\0229\n\004Stop\022\026.parking.En" +
      "gineRequest\032\027.parking.EngineResponse\"\000\022=" +
      "\n\006Sensor\022\026.parking.SensorRequest\032\027.parki" +
      "ng.SensorResponse\"\0000\001\0229\n\005Drive\022\026.google." +
      "protobuf.Empty\032\026.parking.DriveResponse\"\000" +
      "\022;\n\010AutoPark\022\024.parking.ParkRequest\032\025.par" +
      "king.ParkResponse\"\0000\001\022D\n\rIncreaseSpeed\022\026" +
      ".google.protobuf.Empty\032\031.parking.Increas" +
      "eResponse\"\000\022D\n\rDecreaseSpeed\022\026.google.pr" +
      "otobuf.Empty\032\031.parking.DecreaseResponse\"" +
      "\000\022@\n\013showdetails\022\026.google.protobuf.Empty" +
      "\032\027.parking.DetailResponse\"\000B%\n\023org.examp" +
      "le.parkingB\014ParkingProtoP\001b\006proto3"
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
    internal_static_parking_DetailResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_parking_DetailResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_parking_DetailResponse_descriptor,
        new java.lang.String[] { "Details", });
    internal_static_parking_Detail_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_parking_Detail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_parking_Detail_descriptor,
        new java.lang.String[] { "Type", "Wheelbase", "Length", "Height", });
    internal_static_parking_Engine_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_parking_Engine_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_parking_Engine_descriptor,
        new java.lang.String[] { "Turnengineon", "Turnengineoff", "Stop", });
    internal_static_parking_EngineRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_parking_EngineRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_parking_EngineRequest_descriptor,
        new java.lang.String[] { "Engine", });
    internal_static_parking_EngineResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_parking_EngineResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_parking_EngineResponse_descriptor,
        new java.lang.String[] { "Enginestatus", });
    internal_static_parking_SensorRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_parking_SensorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_parking_SensorRequest_descriptor,
        new java.lang.String[] { "Sensors", });
    internal_static_parking_SensorResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_parking_SensorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_parking_SensorResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_parking_Sensors_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_parking_Sensors_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_parking_Sensors_descriptor,
        new java.lang.String[] { "Park", });
    internal_static_parking_DriveResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_parking_DriveResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_parking_DriveResponse_descriptor,
        new java.lang.String[] { "Currentspeed", });
    internal_static_parking_IncreaseResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_parking_IncreaseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_parking_IncreaseResponse_descriptor,
        new java.lang.String[] { "Currentspeed", });
    internal_static_parking_DecreaseResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_parking_DecreaseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_parking_DecreaseResponse_descriptor,
        new java.lang.String[] { "Currentspeed", });
    internal_static_parking_ParkRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_parking_ParkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_parking_ParkRequest_descriptor,
        new java.lang.String[] { "Park", });
    internal_static_parking_ParkResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_parking_ParkResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_parking_ParkResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_parking_Park_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_parking_Park_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_parking_Park_descriptor,
        new java.lang.String[] { "Parked", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}