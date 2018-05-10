package com.lorelib.cuckoo.user.support.exception;

import com.lorelib.framework.exception.CuckooException;

/**
 * @author listening
 * @description
 * @date 2018-05-10 13:26
 * @since 1.0
 */
public class UserServiceException extends CuckooException {
  public UserServiceException(String message) {
    super(message);
  }

  public UserServiceException(String clazz, String message) {
    super(clazz, message);
  }

  public UserServiceException(String clazz, String code, String message) {
    super(clazz, code, message);
  }
}
