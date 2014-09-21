// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Documents.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Label.REPEATED;

public final class ListResponse extends Message {

  public static final List<Bucket> DEFAULT_BUCKET = Collections.emptyList();
  public static final List<DocV2> DEFAULT_DOC = Collections.emptyList();

  @ProtoField(tag = 1, label = REPEATED)
  public final List<Bucket> bucket;

  @ProtoField(tag = 2, label = REPEATED)
  public final List<DocV2> doc;

  public ListResponse(List<Bucket> bucket, List<DocV2> doc) {
    this.bucket = immutableCopyOf(bucket);
    this.doc = immutableCopyOf(doc);
  }

  private ListResponse(Builder builder) {
    this(builder.bucket, builder.doc);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ListResponse)) return false;
    ListResponse o = (ListResponse) other;
    return equals(bucket, o.bucket)
        && equals(doc, o.doc);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = bucket != null ? bucket.hashCode() : 1;
      result = result * 37 + (doc != null ? doc.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<ListResponse> {

    public List<Bucket> bucket;
    public List<DocV2> doc;

    public Builder() {
    }

    public Builder(ListResponse message) {
      super(message);
      if (message == null) return;
      this.bucket = copyOf(message.bucket);
      this.doc = copyOf(message.doc);
    }

    public Builder bucket(List<Bucket> bucket) {
      this.bucket = checkForNulls(bucket);
      return this;
    }

    public Builder doc(List<DocV2> doc) {
      this.doc = checkForNulls(doc);
      return this;
    }

    @Override
    public ListResponse build() {
      return new ListResponse(this);
    }
  }
}