package com.lorelib.framework.test;

import com.lorelib.commons.utils.JSONUtil;
import com.lorelib.commons.utils.ValidationUtil;
import com.lorelib.commons.utils.StringUtil;
import org.junit.After;
import org.junit.Before;

/**
 * 测试工具类
 * Created by listening on 2017/3/9.
 */

public class AbstractTests {
  @After
  public void destroy() {

  }

  /**
   * 登录
   */
  @Before
  public void login() {

  }

  /**
   * 对象参数验证
   *
   * @param obj
   * @param groups
   * @param <T>
   * @return
   */
  protected static <T> boolean validate(T obj, Class<?>... groups) {
    return ValidationUtil.validate(obj, groups);
  }

  /**
   * 打印对象信息
   *
   * @param obj
   */
  protected void println(Object obj) {
    println(null, obj);
  }

  /**
   * 打印对象信息
   *
   * @param tips 提示信息
   * @param obj
   */
  protected void println(String tips, Object obj) {
    print(tips, obj, true);
  }

  /**
   * 打印对象信息，去掉null和空
   *
   * @param obj
   */
  protected void printlnNoBlank(Object obj) {
    printlnNoBlank(null, obj);
  }

  /**
   * 打印对象信息，去掉null和空
   *
   * @param tips 提示信息
   * @param obj
   */
  protected void printlnNoBlank(String tips, Object obj) {
    print(tips, obj, false);
  }

  protected void print(String tips, Object obj, Boolean hasBlank) {
    if (StringUtil.isBlank(tips)) tips = "result: ";
    if (obj instanceof String) {
      System.out.println(tips + obj);
    } else {
      if (hasBlank) {
        System.out.println(tips + JSONUtil.toJsonString(obj));
      } else {
        System.out.println(tips + JSONUtil.noneBlank(obj));
      }
    }
  }
}
