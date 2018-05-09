package com.lorelib.framework.test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author listening
 * @description
 * @date 2017-11-27 15:36
 * @since 1.0
 */
@RunWith(SpringRunner.class)
//@WebMvcTest(UserController.class) // 该方式有问题
@SpringBootTest
public class SpringbootJUnitTests extends AbstractTests {
  @Autowired
  private WebApplicationContext applicationContext;
  protected MockMvc mvc;

  @Before
  public void setup() {
    this.mvc = MockMvcBuilders.webAppContextSetup(this.applicationContext).build();
  }
}
