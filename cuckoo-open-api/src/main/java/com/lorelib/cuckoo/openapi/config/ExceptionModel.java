package com.lorelib.cuckoo.openapi.config;

import lombok.Data;

import java.io.Serializable;

/**
 * @author listening
 * @description
 * @date 2018-05-11 9:35
 * @since 1.0
 */
@Data
public class ExceptionModel implements Serializable {
  private String path;

  private String message;

  private String exception;

  private String error;

  private String status;

  private String timestamp;
}
