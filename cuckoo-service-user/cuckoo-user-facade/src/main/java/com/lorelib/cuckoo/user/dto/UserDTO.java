package com.lorelib.cuckoo.user.dto;

import com.lorelib.framework.stereotype.Command;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 用户DTO对象
 * @author listening
 * @description
 * @date 2018-05-09 21:26
 * @since 1.0
 */
@Data
public class UserDTO implements Command {
  /**
   * 用户登录名
   */
  @NotNull
  private String username;
  /**
   * 用户真实名
   */
  private String realname;
  /**
   * 邮箱
   */
  private String email;
  private String creator = "sys";
  private String modifier;
}
