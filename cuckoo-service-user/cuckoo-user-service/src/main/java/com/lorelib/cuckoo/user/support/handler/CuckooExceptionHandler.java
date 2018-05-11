package com.lorelib.cuckoo.user.support.handler;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author listening
 * @description
 * @date 2018-05-11 2:19
 * @since 1.0
 */
@ControllerAdvice
public class CuckooExceptionHandler {
  /*@ExceptionHandler({RuntimeException.class})
  @ResponseBody
  public String handleException(HttpServletRequest request, RuntimeException e) {
    return ExceptionUtils.getRootCauseMessage(e);
  }*/
}
