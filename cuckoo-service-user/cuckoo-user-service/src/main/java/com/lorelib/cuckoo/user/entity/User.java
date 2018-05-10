package com.lorelib.cuckoo.user.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author ${author}
 * @since 2018-05-10
 */
@Data
@TableName("tbl_user")
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
  /**
   * 邮箱
   */
  private String email;
  /**
   * 0:表示无效.1:表示有效
   */
  private Integer valid;
  @TableField("crt_time")
  private Date crtTime;
  @TableField("mod_time")
  private Date modTime;
  private String modifier;
  private String comment;
}
