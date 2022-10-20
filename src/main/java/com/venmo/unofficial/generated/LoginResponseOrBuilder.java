// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Venmo.proto

package com.venmo.unofficial.generated;

public interface LoginResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LoginResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.LoginResponse.LoginError error = 1;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <code>.LoginResponse.LoginError error = 1;</code>
   * @return The error.
   */
  com.venmo.unofficial.generated.LoginResponse.LoginError getError();
  /**
   * <code>.LoginResponse.LoginError error = 1;</code>
   */
  com.venmo.unofficial.generated.LoginResponse.LoginErrorOrBuilder getErrorOrBuilder();

  /**
   * <code>string access_token = 2;</code>
   * @return The accessToken.
   */
  java.lang.String getAccessToken();
  /**
   * <code>string access_token = 2;</code>
   * @return The bytes for accessToken.
   */
  com.google.protobuf.ByteString
      getAccessTokenBytes();

  /**
   * <code>double balance = 3;</code>
   * @return The balance.
   */
  double getBalance();

  /**
   * <code>.User user = 4;</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <code>.User user = 4;</code>
   * @return The user.
   */
  com.venmo.unofficial.generated.User getUser();
  /**
   * <code>.User user = 4;</code>
   */
  com.venmo.unofficial.generated.UserOrBuilder getUserOrBuilder();
}