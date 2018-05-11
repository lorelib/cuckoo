package com.lorelib.cuckoo.openapi.controller;

import com.lorelib.cuckoo.openapi.client.UserServiceFeignClient;
import com.lorelib.cuckoo.openapi.exception.OpenApiException;
import com.lorelib.cuckoo.user.dto.UserDTO;
import com.lorelib.framework.base.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author listening
 * @description
 * @date 2018-05-11 0:01
 * @since 1.0
 */
@RestController
@RequestMapping("user")
@Slf4j
public class UserController {
  @Resource
  private UserServiceFeignClient userServiceFeignClient;

  @GetMapping("{userId}")
  public Response<UserDTO> getUserById(@PathVariable Integer userId) {
    if (userId == null || userId == 0) {
      log.error("[获取用户]未传入用户ID, userId={}", userId);
      throw new OpenApiException("[获取用户]未传入用户ID");
    }
    Response<UserDTO> resp = new Response<UserDTO>();
    UserDTO user = userServiceFeignClient.getUserById(userId);
    resp.setBody(user);
    return resp;
  }
}
