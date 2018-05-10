package com.lorelib.cuckoo.openapi.client;

import com.lorelib.cuckoo.openapi.client.fallback.UserServiceFeignClientFallback;
import com.lorelib.cuckoo.user.dto.UserDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author listening
 * @description
 * @date 2018-05-11 0:02
 * @since 1.0
 */
@FeignClient(name = "cuckoo-service", fallback = UserServiceFeignClientFallback.class)
public interface UserServiceFeignClient {
  @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
  UserDTO getUserById(@PathVariable("userId") Integer userId);
}