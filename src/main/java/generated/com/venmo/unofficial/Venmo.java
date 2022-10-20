// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Venmo.proto

package com.venmo.unofficial;

public final class Venmo {
  private Venmo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetUserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetUserResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Pagination_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Pagination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetStoriesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetStoriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SearchUserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SearchUserResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Profile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Profile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetMeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetMeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Payment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Payment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Target_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Target_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Story_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Story_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChargeOrPaymentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChargeOrPaymentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChargeOrPaymentResponse_ChargeOrPaymentResponseData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChargeOrPaymentResponse_ChargeOrPaymentResponseData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LoginResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LoginResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LoginResponse_LoginError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LoginResponse_LoginError_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Venmo.proto\"&\n\017GetUserResponse\022\023\n\004data" +
      "\030\001 \001(\0132\005.User\",\n\nPagination\022\020\n\010previous\030" +
      "\001 \001(\t\022\014\n\004next\030\002 \001(\t\"K\n\022GetStoriesRespons" +
      "e\022\024\n\004data\030\001 \003(\0132\006.Story\022\037\n\npagination\030\002 " +
      "\001(\0132\013.Pagination\"J\n\022SearchUserResponse\022\023" +
      "\n\004data\030\001 \003(\0132\005.User\022\037\n\npagination\030\002 \001(\0132" +
      "\013.Pagination\"\036\n\007Profile\022\023\n\004user\030\001 \001(\0132\005." +
      "User\"\'\n\rGetMeResponse\022\026\n\004data\030\001 \001(\0132\010.Pr" +
      "ofile\"\376\002\n\004User\022\021\n\tlast_name\030\001 \001(\t\022\022\n\nfir" +
      "st_name\030\002 \001(\t\022\020\n\010username\030\003 \001(\t\022\n\n\002id\030\004 " +
      "\001(\t\022\024\n\014display_name\030\005 \001(\t\022\025\n\rfriends_cou" +
      "nt\030\006 \001(\003\022\r\n\005about\030\007 \001(\t\022\020\n\010is_group\030\010 \001(" +
      "\010\022\022\n\nis_blocked\030\t \001(\010\022\021\n\tis_active\030\n \001(\010" +
      "\022\022\n\nis_payable\030\013 \001(\010\022\033\n\023profile_picture_" +
      "url\030\014 \001(\t\022)\n\ridentity_type\030\r \001(\0162\022.User." +
      "IdentityType\022\025\n\rfriend_status\030\017 \001(\t\"\034\n\014I" +
      "dentityType\022\014\n\010PERSONAL\020\000\"+\n\014FriendStatu" +
      "s\022\013\n\007FRIENDS\020\000\022\016\n\nNOT_FRIEND\020\001\"\210\001\n\007Payme" +
      "nt\022\024\n\005actor\030\001 \001(\0132\005.User\022\027\n\006target\030\002 \001(\013" +
      "2\007.Target\022\037\n\006action\030\003 \001(\0162\017.Payment.Acti" +
      "on\022\016\n\006amount\030\004 \001(\001\"\035\n\006Action\022\007\n\003PAY\020\000\022\n\n" +
      "\006CHARGE\020\001\"\035\n\006Target\022\023\n\004user\030\001 \001(\0132\005.User" +
      "\"\317\001\n\005Story\022\n\n\002id\030\001 \001(\t\022\024\n\014date_created\030\002" +
      " \001(\t\022\031\n\007payment\030\003 \001(\0132\010.Payment\022\016\n\006statu" +
      "s\030\004 \001(\t\022\026\n\016date_completed\030\005 \001(\t\022\014\n\004note\030" +
      "\006 \001(\t\022!\n\010audience\030\007 \001(\0162\017.Story.Audience" +
      "\"0\n\010Audience\022\n\n\006PUBLIC\020\000\022\013\n\007FRIENDS\020\001\022\013\n" +
      "\007PRIVATE\020\002\"\250\001\n\027ChargeOrPaymentResponse\022B" +
      "\n\004data\030\001 \001(\01324.ChargeOrPaymentResponse.C" +
      "hargeOrPaymentResponseData\032I\n\033ChargeOrPa" +
      "ymentResponseData\022\017\n\007balance\030\001 \001(\t\022\031\n\007pa" +
      "yment\030\002 \001(\0132\010.Payment\"\203\001\n\rLoginResponse\022" +
      "(\n\005error\030\001 \001(\0132\031.LoginResponse.LoginErro" +
      "r\022\024\n\014access_token\030\002 \001(\t\022\017\n\007balance\030\003 \001(\001" +
      "\022\023\n\004user\030\004 \001(\0132\005.User\032\014\n\nLoginErrorB\030\n\024c" +
      "om.venmo.unofficialP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetUserResponse_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_Pagination_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Pagination_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Pagination_descriptor,
        new java.lang.String[] { "Previous", "Next", });
    internal_static_GetStoriesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_GetStoriesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetStoriesResponse_descriptor,
        new java.lang.String[] { "Data", "Pagination", });
    internal_static_SearchUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_SearchUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SearchUserResponse_descriptor,
        new java.lang.String[] { "Data", "Pagination", });
    internal_static_Profile_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Profile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Profile_descriptor,
        new java.lang.String[] { "User", });
    internal_static_GetMeResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_GetMeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetMeResponse_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_User_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_User_descriptor,
        new java.lang.String[] { "LastName", "FirstName", "Username", "Id", "DisplayName", "FriendsCount", "About", "IsGroup", "IsBlocked", "IsActive", "IsPayable", "ProfilePictureUrl", "IdentityType", "FriendStatus", });
    internal_static_Payment_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_Payment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Payment_descriptor,
        new java.lang.String[] { "Actor", "Target", "Action", "Amount", });
    internal_static_Target_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_Target_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Target_descriptor,
        new java.lang.String[] { "User", });
    internal_static_Story_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_Story_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Story_descriptor,
        new java.lang.String[] { "Id", "DateCreated", "Payment", "Status", "DateCompleted", "Note", "Audience", });
    internal_static_ChargeOrPaymentResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_ChargeOrPaymentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChargeOrPaymentResponse_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_ChargeOrPaymentResponse_ChargeOrPaymentResponseData_descriptor =
      internal_static_ChargeOrPaymentResponse_descriptor.getNestedTypes().get(0);
    internal_static_ChargeOrPaymentResponse_ChargeOrPaymentResponseData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChargeOrPaymentResponse_ChargeOrPaymentResponseData_descriptor,
        new java.lang.String[] { "Balance", "Payment", });
    internal_static_LoginResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_LoginResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LoginResponse_descriptor,
        new java.lang.String[] { "Error", "AccessToken", "Balance", "User", });
    internal_static_LoginResponse_LoginError_descriptor =
      internal_static_LoginResponse_descriptor.getNestedTypes().get(0);
    internal_static_LoginResponse_LoginError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LoginResponse_LoginError_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}