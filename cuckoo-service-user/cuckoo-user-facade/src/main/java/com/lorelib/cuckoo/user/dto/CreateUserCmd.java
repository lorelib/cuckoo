package com.lorelib.cuckoo.user.dto;

import javax.validation.constraints.NotNull;

import com.lorelib.framework.stereotype.DTO;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 用户DTO对象
 * @author listening
 * @description
 * @date 2018-05-09 21:26
 * @since 1.0
 */
@Data
public class CreateUserCmd implements DTO {
  /**
   * 用户名
   */
  @NotNull(message = "用户名不可为空")
  private String username;
  /**
   * 用户真实名
   */
  @NotEmpty(message = "用户真实名不可为空")
  private String realname;
  /**
   * 邮箱
   */
  private String email;
  private String creator = "sys";
  private String modifier;
}
