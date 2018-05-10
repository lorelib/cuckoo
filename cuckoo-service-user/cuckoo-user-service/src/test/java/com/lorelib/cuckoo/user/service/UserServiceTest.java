package com.lorelib.cuckoo.user.service;

import com.lorelib.commons.utils.ValidationUtil;
import com.lorelib.cuckoo.user.api.IUserService;
import com.lorelib.cuckoo.user.dto.CreateUserCmd;
import com.lorelib.cuckoo.user.dto.UserDTO;
import com.lorelib.framework.test.SpringbootJUnitTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 用户服务测试
 * @author listening
 * @description
 * @date 2018-05-08 10:56
 * @since 1.0
 */
public class UserServiceTest extends SpringbootJUnitTests {
  @Autowired
  private IUserService userService;

  @Test
  public void addTest() {
    CreateUserCmd user = new CreateUserCmd();
    user.setUsername("listening");
    user.setRealname("luomm");

    ValidationUtil.validate(user);

    Integer userId = userService.add(user);
    println(userId);
  }

  @Test
  public void getUserByIdTest() {
    UserDTO user = userService.getUserById(1);
    println(user);
  }
}
