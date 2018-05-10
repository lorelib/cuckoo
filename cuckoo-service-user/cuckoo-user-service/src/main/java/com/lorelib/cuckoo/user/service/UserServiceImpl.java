package com.lorelib.cuckoo.user.service;

import com.lorelib.commons.utils.BeanMapper;
import com.lorelib.cuckoo.user.dto.CreateUserCmd;
import com.lorelib.cuckoo.user.entity.User;
import com.lorelib.cuckoo.user.mapper.UserMapper;
import com.lorelib.cuckoo.user.api.IUserService;
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
  public Integer add(CreateUserCmd createUserCmd) {
    Integer ret = userMapper.insert(BeanMapper.map(createUserCmd, User.class));
    return ret;
  }
}
