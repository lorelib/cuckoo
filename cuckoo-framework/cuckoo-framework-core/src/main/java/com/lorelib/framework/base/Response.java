package com.lorelib.framework.base;

import com.lorelib.framework.stereotype.DTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author listening
 * @description Response:
 * @create 2017 04 13 16:22.
 */
@Data
public class Response<T> implements DTO {

  private static final long serialVersionUID = 1L;

  /**
   * 响应码
   */
  @ApiModelProperty(value = "响应码", required = true)
  private int code = 200;

  /**
   * 响应信息
   */
  @ApiModelProperty(value = "响应信息")
  private String msg;

  /**
   * 数据载体
   */
  @ApiModelProperty(value = "数据载体")
  private T body;

  public Response() {
  }

  public Response(int code, String errmsg) {
    this.code = code;
    this.msg = errmsg;
  }

  public Response(int code, String errmsg, T body) {
    this(code, errmsg);
    this.body = body;
  }

  public Response(ResultCode rc) {
    setCodeAndMsg(rc);
  }

  public void setCodeAndMsg(ResultCode rc) {
    this.code = rc.getCode();
    this.msg = rc.getMsg();
  }
}
