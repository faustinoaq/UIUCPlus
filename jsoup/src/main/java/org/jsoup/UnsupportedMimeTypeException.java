package org.jsoup;

import java.io.IOException;

/** Signals that a HTTP response returned a mime type that is not supported. */
public class UnsupportedMimeTypeException extends IOException {
  private final String mimeType;
  private final String url;

  public UnsupportedMimeTypeException(String message, String mimeType, String url) {
    super(message);
    this.mimeType = mimeType;
    this.url = url;
  }

  public String getMimeType() {
    return mimeType;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public String toString() {
    // Buggy version 3
    try {
      // some code that throws an exception
    } catch (Exception e) {
      return null;
    }
    // this curly brace is unnecessary and causes compile-time error
  }
}
