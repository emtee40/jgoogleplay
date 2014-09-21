// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Unsorted.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.BOOL;
import static com.squareup.wire.Message.Datatype.STRING;

public final class ServerCommands extends Message {

  public static final Boolean DEFAULT_CLEARCACHE = false;
  public static final String DEFAULT_DISPLAYERRORMESSAGE = "";
  public static final String DEFAULT_LOGERRORSTACKTRACE = "";

  @ProtoField(tag = 1, type = BOOL)
  public final Boolean clearCache;

  @ProtoField(tag = 2, type = STRING)
  public final String displayErrorMessage;

  @ProtoField(tag = 3, type = STRING)
  public final String logErrorStacktrace;

  public ServerCommands(Boolean clearCache, String displayErrorMessage, String logErrorStacktrace) {
    this.clearCache = clearCache;
    this.displayErrorMessage = displayErrorMessage;
    this.logErrorStacktrace = logErrorStacktrace;
  }

  private ServerCommands(Builder builder) {
    this(builder.clearCache, builder.displayErrorMessage, builder.logErrorStacktrace);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ServerCommands)) return false;
    ServerCommands o = (ServerCommands) other;
    return equals(clearCache, o.clearCache)
        && equals(displayErrorMessage, o.displayErrorMessage)
        && equals(logErrorStacktrace, o.logErrorStacktrace);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = clearCache != null ? clearCache.hashCode() : 0;
      result = result * 37 + (displayErrorMessage != null ? displayErrorMessage.hashCode() : 0);
      result = result * 37 + (logErrorStacktrace != null ? logErrorStacktrace.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<ServerCommands> {

    public Boolean clearCache;
    public String displayErrorMessage;
    public String logErrorStacktrace;

    public Builder() {
    }

    public Builder(ServerCommands message) {
      super(message);
      if (message == null) return;
      this.clearCache = message.clearCache;
      this.displayErrorMessage = message.displayErrorMessage;
      this.logErrorStacktrace = message.logErrorStacktrace;
    }

    public Builder clearCache(Boolean clearCache) {
      this.clearCache = clearCache;
      return this;
    }

    public Builder displayErrorMessage(String displayErrorMessage) {
      this.displayErrorMessage = displayErrorMessage;
      return this;
    }

    public Builder logErrorStacktrace(String logErrorStacktrace) {
      this.logErrorStacktrace = logErrorStacktrace;
      return this;
    }

    @Override
    public ServerCommands build() {
      return new ServerCommands(this);
    }
  }
}