package com.lorelib.cuckoo.order.support.exception;

import com.lorelib.framework.exception.CuckooException;

/**
 * @author listening
 * @description
 * @date 2018-05-10 13:26
 * @since 1.0
 */
public class OrderServiceException extends CuckooException {
  public OrderServiceException(String message) {
    super(message);
  }

  public OrderServiceException(String clazz, String message) {
    super(clazz, message);
  }

  public OrderServiceException(String clazz, String code, String message) {
    super(clazz, code, message);
  }
}
