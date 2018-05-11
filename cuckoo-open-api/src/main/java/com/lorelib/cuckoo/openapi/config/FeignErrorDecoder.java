package com.lorelib.cuckoo.openapi.config;

import com.alibaba.fastjson.JSONObject;
import com.lorelib.commons.utils.JSONUtil;
import com.lorelib.commons.utils.StringUtil;
import com.netflix.hystrix.exception.HystrixBadRequestException;
import feign.Response;
import feign.Util;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @author listening
 * @description
 * @date 2018-05-11 1:51
 * @since 1.0
 */
@Slf4j
public class FeignErrorDecoder implements ErrorDecoder {
  public Exception decode(String methodKey, Response response) {
    Exception exception = null;
    String resp = "";
    try {
      resp = Util.toString(response.body().asReader());
      ExceptionModel em = JSONObject.parseObject(resp, ExceptionModel.class);
      if (StringUtil.isNotBlank(em.getException()) && em.getException().contains("Exception")) {
        log.error("服务调用异常, 异常信息: " + resp);
      }
    } catch (IOException e) {

    }
    if (400 <= response.status() || response.status() < 500) {
      // HystrixBadRequestException 异常不会触发熔断
      exception = new HystrixBadRequestException("request exception wrapper", exception);
    } else {
      log.error(exception.getMessage(), exception);
    }
    return exception;
  }
}
