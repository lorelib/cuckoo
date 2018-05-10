package com.lorelib.cuckoo.user.controller;

import com.lorelib.cuckoo.user.api.IUserService;
import com.lorelib.cuckoo.user.dto.CreateUserCmd;
import com.lorelib.cuckoo.user.dto.UserDTO;
import com.lorelib.cuckoo.user.support.exception.UserServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author listening
 * @description
 * @date 2018-05-10 1:52
 * @since 1.0
 */
@RestController
@RequestMapping("user")
@Slf4j
public class UserController {
  @Autowired
  private IUserService userService;

  @PostMapping
  public Integer add(@Valid @RequestBody CreateUserCmd createUserCmd, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      log.error("[创建用户]参数不正确, createUserCmd={}", createUserCmd);
      throw new UserServiceException(UserController.class.getName(), bindingResult.getFieldError().getDefaultMessage());
    }
    return userService.add(createUserCmd);
  }

  @GetMapping("{userId}")
  public UserDTO getUserById(@PathVariable Integer userId) {
    if (userId == null || userId == 0) {
      log.error("[获取用户]未传入用户ID, userId={}", userId);
      throw new UserServiceException("[获取用户]未传入用户ID");
    }
    return userService.getUserById(userId);
  }
}
