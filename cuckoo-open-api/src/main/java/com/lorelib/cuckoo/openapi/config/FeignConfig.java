package com.lorelib.cuckoo.openapi.config;

import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author listening
 * @description
 * @date 2018-05-11 1:55
 * @since 1.0
 */
@Configuration
public class FeignConfig {
  @Bean
  public ErrorDecoder errorDecoder() {
    return new FeignErrorDecoder();
  }
}
