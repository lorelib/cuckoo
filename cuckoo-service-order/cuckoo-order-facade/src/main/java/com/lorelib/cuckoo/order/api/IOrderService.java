package com.lorelib.cuckoo.order.api;

import com.lorelib.cuckoo.order.dto.CreateOrderCmd;

/**
 * 订单服务
 * @author listening
 * @description
 * @date 2018-05-10 13:46
 * @since 1.0
 */
public interface IOrderService {
  int createOrder(CreateOrderCmd createOrderCmd);
}
