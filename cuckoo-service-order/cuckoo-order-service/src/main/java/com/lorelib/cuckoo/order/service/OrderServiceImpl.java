package com.lorelib.cuckoo.order.service;

import com.lorelib.commons.algorithm.IdGenerator;
import com.lorelib.commons.utils.BeanMapper;
import com.lorelib.cuckoo.order.api.IOrderService;
import com.lorelib.cuckoo.order.dto.CreateOrderCmd;
import com.lorelib.cuckoo.order.entity.Order;
import com.lorelib.cuckoo.order.mapper.OrderMapper;
import com.lorelib.cuckoo.order.support.exception.OrderServiceException;
import com.lorelib.cuckoo.user.api.IUserService;
import com.lorelib.cuckoo.user.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author listening
 * @description
 * @date 2018-05-10 13:50
 * @since 1.0
 */
@Service
public class OrderServiceImpl implements IOrderService {
  @Autowired
  private OrderMapper orderMapper;
  @Autowired
  private IUserService userService;

  @Override
  public int createOrder(CreateOrderCmd createOrderCmd) {
    int ret = 0;
    UserDTO user = userService.getUserById(createOrderCmd.getUserId());
    if (user != null) {
      Order order = BeanMapper.map(createOrderCmd, Order.class);
      order.setId(IdGenerator.nextId());
      ret = orderMapper.insert(order);
    } else {
      throw new OrderServiceException("用户不存在, 用户ID: " + createOrderCmd.getUserId());
    }
    return ret;
  }
}
