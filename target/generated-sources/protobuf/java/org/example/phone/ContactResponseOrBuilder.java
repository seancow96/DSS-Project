// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: phone.proto

package org.example.phone;

public interface ContactResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:phone.ContactResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .phone.Contact contacts = 1;</code>
   */
  java.util.List<org.example.phone.Contact> 
      getContactsList();
  /**
   * <code>repeated .phone.Contact contacts = 1;</code>
   */
  org.example.phone.Contact getContacts(int index);
  /**
   * <code>repeated .phone.Contact contacts = 1;</code>
   */
  int getContactsCount();
  /**
   * <code>repeated .phone.Contact contacts = 1;</code>
   */
  java.util.List<? extends org.example.phone.ContactOrBuilder> 
      getContactsOrBuilderList();
  /**
   * <code>repeated .phone.Contact contacts = 1;</code>
   */
  org.example.phone.ContactOrBuilder getContactsOrBuilder(
      int index);
}