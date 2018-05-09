package com.lorelib.framework.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.testng.annotations.BeforeClass;

/**
 * @author listening
 * @description SpringTests:
 * @create 2017 05 12 16:35.
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-*.xml", "classpath*:dubbo/*-*.xml", "classpath*:META-INF/*/*-*.xml"})
public class SpringTests extends AbstractTests {
  @Autowired
  private WebApplicationContext applicationContext;
  protected MockMvc mockMvc;

  @BeforeClass
  public void setup() {
    this.mockMvc = MockMvcBuilders.webAppContextSetup(this.applicationContext).build();
    login();
  }
}

