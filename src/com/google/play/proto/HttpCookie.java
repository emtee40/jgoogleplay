// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Download.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.STRING;

public final class HttpCookie extends Message {

  public static final String DEFAULT_NAME = "";
  public static final String DEFAULT_VALUE = "";

  @ProtoField(tag = 1, type = STRING)
  public final String name;

  @ProtoField(tag = 2, type = STRING)
  public final String value;

  public HttpCookie(String name, String value) {
    this.name = name;
    this.value = value;
  }

  private HttpCookie(Builder builder) {
    this(builder.name, builder.value);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof HttpCookie)) return false;
    HttpCookie o = (HttpCookie) other;
    return equals(name, o.name)
        && equals(value, o.value);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = name != null ? name.hashCode() : 0;
      result = result * 37 + (value != null ? value.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<HttpCookie> {

    public String name;
    public String value;

    public Builder() {
    }

    public Builder(HttpCookie message) {
      super(message);
      if (message == null) return;
      this.name = message.name;
      this.value = message.value;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder value(String value) {
      this.value = value;
      return this;
    }

    @Override
    public HttpCookie build() {
      return new HttpCookie(this);
    }
  }
}