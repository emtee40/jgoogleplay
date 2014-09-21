// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Video.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.REPEATED;

public final class VideoCredit extends Message {

  public static final Integer DEFAULT_CREDITTYPE = 0;
  public static final String DEFAULT_CREDIT = "";
  public static final List<String> DEFAULT_NAME = Collections.emptyList();

  @ProtoField(tag = 1, type = INT32)
  public final Integer creditType;

  @ProtoField(tag = 2, type = STRING)
  public final String credit;

  @ProtoField(tag = 3, type = STRING, label = REPEATED)
  public final List<String> name;

  public VideoCredit(Integer creditType, String credit, List<String> name) {
    this.creditType = creditType;
    this.credit = credit;
    this.name = immutableCopyOf(name);
  }

  private VideoCredit(Builder builder) {
    this(builder.creditType, builder.credit, builder.name);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof VideoCredit)) return false;
    VideoCredit o = (VideoCredit) other;
    return equals(creditType, o.creditType)
        && equals(credit, o.credit)
        && equals(name, o.name);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = creditType != null ? creditType.hashCode() : 0;
      result = result * 37 + (credit != null ? credit.hashCode() : 0);
      result = result * 37 + (name != null ? name.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<VideoCredit> {

    public Integer creditType;
    public String credit;
    public List<String> name;

    public Builder() {
    }

    public Builder(VideoCredit message) {
      super(message);
      if (message == null) return;
      this.creditType = message.creditType;
      this.credit = message.credit;
      this.name = copyOf(message.name);
    }

    public Builder creditType(Integer creditType) {
      this.creditType = creditType;
      return this;
    }

    public Builder credit(String credit) {
      this.credit = credit;
      return this;
    }

    public Builder name(List<String> name) {
      this.name = checkForNulls(name);
      return this;
    }

    @Override
    public VideoCredit build() {
      return new VideoCredit(this);
    }
  }
}