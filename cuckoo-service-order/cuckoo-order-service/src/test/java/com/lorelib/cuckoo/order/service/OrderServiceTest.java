package com.lorelib.cuckoo.order.service;

import com.lorelib.commons.utils.ValidationUtil;
import com.lorelib.cuckoo.order.api.IOrderService;
import com.lorelib.cuckoo.order.dto.CreateOrderCmd;
import com.lorelib.cuckoo.user.api.IUserService;
import com.lorelib.cuckoo.user.dto.UserDTO;
import com.lorelib.framework.test.SpringbootJUnitTests;
import org.junit.Test;
import org.mockito.BDDMockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

/**
 * 订单服务测试
 * @author listening
 * @description
 * @date 2018-05-08 10:56
 * @since 1.0
 */
public class OrderServiceTest extends SpringbootJUnitTests {
  @Autowired
  private IOrderService orderService;
  @MockBean
  private IUserService userService;

  @Test
  public void createOrderTest() {
    //MockitoAnnotations.initMocks(this);
    UserDTO user = new UserDTO();
    user.setId(3);
    user.setUsername("listening");
    BDDMockito.given(this.userService.getUserById(3)).willReturn(user);

    CreateOrderCmd order = new CreateOrderCmd();
    order.setUserId(3);
    order.setProductName("design book");

    ValidationUtil.validate(order);

    int ret = orderService.createOrder(order);
    println(ret);
  }
}
