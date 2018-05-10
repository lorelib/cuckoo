package com.lorelib.cuckoo.openapi.client.fallback;

import com.lorelib.cuckoo.openapi.client.UserServiceFeignClient;
import com.lorelib.cuckoo.user.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author listening
 * @description
 * @date 2018-05-11 1:15
 * @since 1.0
 */
@Component
public class UserServiceFeignClientFallback implements UserServiceFeignClient {
  private final static Logger LOGGER = LoggerFactory.getLogger(UserServiceFeignClientFallback.class);

  @Override
  public UserDTO getUserById(Integer userId) {
    LOGGER.info("[获取用户]发生异常，接收的参数：userId = {}", userId);
    UserDTO user = new UserDTO();
    user.setId(-1);
    user.setUsername("unknown");
    return user;
  }
}