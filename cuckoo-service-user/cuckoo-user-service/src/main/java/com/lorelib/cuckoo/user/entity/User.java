package com.lorelib.cuckoo.user.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;

import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author listening
 * @since 2018-05-09
 */
public class User implements Serializable {

  private static final long serialVersionUID = 1L;

  @TableId(value = "id", type = IdType.AUTO)
  private Integer id;
  /**
   * 用户名，用于登录
   */
  private String username;
  /**
   * 用户真实名
   */
  private String realname;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }

  @Override
  public String toString() {
    return "User{" +
        ", id=" + id +
        ", username=" + username +
        ", realname=" + realname +
        "}";
  }
}
