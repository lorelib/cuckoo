package com.lorelib.cuckoo.openapi.exception;

import com.lorelib.framework.exception.CuckooException;

/**
 * @author listening
 * @description
 * @date 2018-05-10 13:26
 * @since 1.0
 */
public class OpenApiException extends CuckooException {
  public OpenApiException(String message) {
    super(message);
  }

  public OpenApiException(String clazz, String message) {
    super(clazz, message);
  }

  public OpenApiException(String clazz, String code, String message) {
    super(clazz, code, message);
  }
}
