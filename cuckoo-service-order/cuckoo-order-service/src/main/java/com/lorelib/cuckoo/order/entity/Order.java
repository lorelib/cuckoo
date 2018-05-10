package com.lorelib.cuckoo.order.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.lorelib.framework.domain.BaseEntity;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author ${author}
 * @since 2018-05-10
 */
public class Order extends BaseEntity {

  private static final long serialVersionUID = 1L;

  private Integer id;
  /**
   * 用户id
   */
  @TableField("user_id")
  private Integer userId;
  /**
   * 商品名称
   */
  @TableField("product_name")
  private String productName;
  /**
   * 0:表示无效.1:表示有效
   */
  private Integer status;
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

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
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
    return "Order{" +
        ", id=" + id +
        ", userId=" + userId +
        ", productName=" + productName +
        ", status=" + status +
        ", crtTime=" + crtTime +
        ", creator=" + creator +
        ", modTime=" + modTime +
        ", modifier=" + modifier +
        ", comment=" + comment +
        "}";
  }
}
