package com.lorelib.cuckoo.user.controller;

import com.lorelib.commons.utils.JSONUtil;
import com.lorelib.cuckoo.user.dto.CreateUserCmd;
import com.lorelib.framework.test.SpringbootJUnitTests;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.testng.Assert;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

/**
 * @author listening
 * @description
 * @date 2018-05-10 2:06
 * @since 1.0
 */
public class UserControllerTest extends SpringbootJUnitTests {
  @Test
  public void addUserTest() throws Exception {
    CreateUserCmd cmd = new CreateUserCmd();
    cmd.setUsername("listening");
    cmd.setRealname("luomm");
    MvcResult ret = mvc.perform(
        post("/user")
            .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
            .content(JSONUtil.toJsonString(cmd))
    ).andReturn();
    Assert.assertEquals(ret.getResponse().getStatus(), 200);
    println("响应结果: " + ret.getResponse().getContentAsString());
  }

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
