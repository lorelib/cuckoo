package com.lorelib.framework.base;

/**
 * @author listening
 * @description
 * @date 2018-02-01 11:08
 * @since 1.0
 */
public interface ResultCode {
  /**
   * 获取响应编码
   * @return
   */
  int getCode();

  /**
   * 获取响应信息
   * @return
   */
  String getMsg();
}
