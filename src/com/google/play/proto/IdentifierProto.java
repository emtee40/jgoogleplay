// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Book.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.STRING;

public final class IdentifierProto extends Message {

  public static final Integer DEFAULT_TYPE = 0;
  public static final String DEFAULT_IDENTIFIER = "";

  @ProtoField(tag = 19, type = INT32)
  public final Integer type;

  @ProtoField(tag = 20, type = STRING)
  public final String identifier;

  public IdentifierProto(Integer type, String identifier) {
    this.type = type;
    this.identifier = identifier;
  }

  private IdentifierProto(Builder builder) {
    this(builder.type, builder.identifier);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof IdentifierProto)) return false;
    IdentifierProto o = (IdentifierProto) other;
    return equals(type, o.type)
        && equals(identifier, o.identifier);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = type != null ? type.hashCode() : 0;
      result = result * 37 + (identifier != null ? identifier.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<IdentifierProto> {

    public Integer type;
    public String identifier;

    public Builder() {
    }

    public Builder(IdentifierProto message) {
      super(message);
      if (message == null) return;
      this.type = message.type;
      this.identifier = message.identifier;
    }

    public Builder type(Integer type) {
      this.type = type;
      return this;
    }

    public Builder identifier(String identifier) {
      this.identifier = identifier;
      return this;
    }

    @Override
    public IdentifierProto build() {
      return new IdentifierProto(this);
    }
  }
}