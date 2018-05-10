package com.lorelib.cuckoo.openapi.controller;

import com.lorelib.framework.test.SpringbootJUnitTests;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.testng.Assert;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * @author listening
 * @description
 * @date 2018-05-11 0:20
 * @since 1.0
 */
public class UserControllerTest extends SpringbootJUnitTests {
  @Test
  public void getUserByIdTest() throws Exception {
    MvcResult ret = mvc.perform(
        get("/user/1")
            .contentType(MediaType.TEXT_PLAIN_VALUE)
    ).andReturn();
    Assert.assertEquals(ret.getResponse().getStatus(), 200);
    println("响应结果: " + ret.getResponse().getContentAsString());
  }
}
