package com.lorelib.cuckoo.user.api;

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
   * @param user
   * @return 返回用户ID
   */
  Integer add(UserDTO user);
}
