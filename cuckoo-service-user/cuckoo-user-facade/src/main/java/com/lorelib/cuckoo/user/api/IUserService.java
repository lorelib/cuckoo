package com.lorelib.cuckoo.user.api;

import com.lorelib.cuckoo.user.dto.CreateUserCmd;
import com.lorelib.cuckoo.user.dto.UserDTO;

/**
 * 用户服务
 * @author listening
 * @description
 * @date 2018-05-09 21:26
 * @since 1.0
 */
public interface IUserService {
  /**
   * 新增用户
   * @param createUserCmd
   * @return 返回用户ID
   */
  Integer addUser(CreateUserCmd createUserCmd);

  UserDTO getUserById(Integer userId);
}
