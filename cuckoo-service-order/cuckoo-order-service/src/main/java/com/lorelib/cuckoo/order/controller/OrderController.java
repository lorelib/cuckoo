package com.lorelib.cuckoo.order.controller;

import com.lorelib.cuckoo.order.api.IOrderService;
import com.lorelib.cuckoo.order.dto.CreateOrderCmd;
import com.lorelib.cuckoo.order.support.exception.OrderServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author listening
 * @description
 * @date 2018-05-10 13:50
 * @since 1.0
 */
@RestController
@RequestMapping("order")
@Slf4j
public class OrderController {
  @Autowired
  private IOrderService orderService;

  @PostMapping
  public Integer createOrder(@Valid @RequestBody CreateOrderCmd createOrderCmd, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      log.error("[创建订单]参数不正确, createOrderCmd={}", createOrderCmd);
      throw new OrderServiceException(OrderController.class.getName(), bindingResult.getFieldError().getDefaultMessage());
    }
    return orderService.createOrder(createOrderCmd);
  }
}
