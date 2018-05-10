package com.lorelib.cuckoo.order.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author ${author}
 * @since 2018-05-10
 */
@Data
@TableName("tbl_order")
public class Order implements Serializable {

  private static final long serialVersionUID = 1L;

  @TableId(value = "id", type = IdType.INPUT)
  private Long id;
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
  private Integer valid = 1;
  @TableField("crt_time")
  private Date crtTime;
  @TableField("mod_time")
  private Date modTime;
  private String modifier;
  private String comment;
}
