package com.lorelib.cuckoo.user.entity;

import com.baomidou.mybatisplus.enums.IdType;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.lorelib.framework.domain.BaseEntity;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author ${author}
 * @since 2018-05-10
 */
public class User extends BaseEntity {

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
  /**
   * 邮箱
   */
  private String email;
  @TableField("crt_time")
  private Date crtTime;
  private String creator;
  @TableField("mod_time")
  private Date modTime;
  private String modifier;
  private String comment;


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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Date getCrtTime() {
    return crtTime;
  }

  public void setCrtTime(Date crtTime) {
    this.crtTime = crtTime;
  }

  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public Date getModTime() {
    return modTime;
  }

  public void setModTime(Date modTime) {
    this.modTime = modTime;
  }

  public String getModifier() {
    return modifier;
  }

  public void setModifier(String modifier) {
    this.modifier = modifier;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  @Override
  public String toString() {
    return "User{" +
        ", id=" + id +
        ", username=" + username +
        ", realname=" + realname +
        ", email=" + email +
        ", crtTime=" + crtTime +
        ", creator=" + creator +
        ", modTime=" + modTime +
        ", modifier=" + modifier +
        ", comment=" + comment +
        "}";
  }
}
