package com.lorelib.cuckoo.user.service;

import com.lorelib.commons.utils.BeanMapper;
import com.lorelib.cuckoo.user.dto.CreateUserCmd;
import com.lorelib.cuckoo.user.dto.UserDTO;
import com.lorelib.cuckoo.user.entity.User;
import com.lorelib.cuckoo.user.mapper.UserMapper;
import com.lorelib.cuckoo.user.api.IUserService;
import com.lorelib.cuckoo.user.support.exception.UserServiceException;
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
  public Integer addUser(CreateUserCmd createUserCmd) {
    Integer ret = userMapper.insert(BeanMapper.map(createUserCmd, User.class));
    return ret;
  }

  @Override
  public UserDTO getUserById(Integer userId) {
    User user = userMapper.selectById(userId);
    if (user == null) {
      throw new UserServiceException("用户不存在,用户ID：" + userId);
    }
    return BeanMapper.map(user, UserDTO.class);
  }
}
