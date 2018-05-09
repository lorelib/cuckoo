package com.lorelib.cuckoo.user.service;

import com.lorelib.cuckoo.user.api.IUserService;
import com.lorelib.cuckoo.user.dto.UserDTO;
import com.lorelib.framework.test.SpringbootJUnitTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 楼盘别名服务测试
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
    UserDTO user = new UserDTO();
    Integer userId = userService.add(user);
    println(userId);
  }
}
