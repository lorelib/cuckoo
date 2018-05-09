package com.lorelib.cuckoo.user.service;

import com.fxtcn.commons.test.SpringbootJUnitTests;
import com.fxtcn.fdc.project.api.IProjectAliasService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 楼盘别名服务测试
 * @author listening
 * @description
 * @date 2018-05-08 10:56
 * @since 1.0
 */
public class ProjectAliasServiceTest extends SpringbootJUnitTests {
  @Autowired
  private IProjectAliasService aliasService;

  @Test
  public void test() {
    aliasService.test();
  }
}
