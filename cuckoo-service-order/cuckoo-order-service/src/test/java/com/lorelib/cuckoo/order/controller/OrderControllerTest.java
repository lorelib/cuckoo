package com.lorelib.cuckoo.order.controller;

import com.lorelib.commons.utils.JSONUtil;
import com.lorelib.cuckoo.order.dto.CreateOrderCmd;
import com.lorelib.cuckoo.user.dto.CreateUserCmd;
import com.lorelib.framework.test.SpringbootJUnitTests;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.testng.Assert;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

/**
 * @author listening
 * @description
 * @date 2018-05-10 2:06
 * @since 1.0
 */
public class OrderControllerTest extends SpringbootJUnitTests {
  @Test
  public void createOrderTest() throws Exception {
    CreateOrderCmd order = new CreateOrderCmd();
    order.setUserId(1);
    order.setProductName("design book");
    MvcResult ret = mvc.perform(
        post("/order")
            .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
            .content(JSONUtil.toJsonString(order))
    ).andReturn();
    Assert.assertEquals(ret.getResponse().getStatus(), 200);
    println("响应结果: " + ret.getResponse().getContentAsString());
  }
}
