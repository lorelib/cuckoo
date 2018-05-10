package com.lorelib.cuckoo.user.dto;

import com.lorelib.framework.stereotype.Command;
import lombok.Data;

import java.util.Date;

/**
 * 用户DTO对象
 * @author listening
 * @description
 * @date 2018-05-09 21:26
 * @since 1.0
 */
@Data
public class UserDTO implements Command {
  private Integer id;
  /**
   * 用户名，用于登录
   */
  private String username;
  /**
   * 用户真实名
   */
  private String realname;
  /**
   * 邮箱
   */
  private String email;
  private String crtTime;
  private String creator;
  private String modTime;
  private String modifier;
  private String comment;
}
