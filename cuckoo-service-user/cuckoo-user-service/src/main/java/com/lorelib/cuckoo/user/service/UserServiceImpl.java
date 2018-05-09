package com.lorelib.cuckoo.user.service;

import com.lorelib.commons.utils.BeanMapper;
import com.lorelib.cuckoo.user.api.IUserService;
import com.lorelib.cuckoo.user.dto.UserDTO;
import com.lorelib.cuckoo.user.entity.User;
import com.lorelib.cuckoo.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author listening
 * @description
 * @date 2018-05-09 21:33
 * @since 1.0
 */
@Service
public class UserServiceImpl implements IUserService {
  @Autowired
  private UserMapper userMapper;

  @Override
  public Integer add(UserDTO user) {
    Integer id = userMapper.insert(BeanMapper.map(user, User.class));
    return null;
  }
}
