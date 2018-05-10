package com.lorelib.cuckoo.order.dto;

import com.lorelib.framework.stereotype.DTO;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;

/**
 * @author listening
 * @description
 * @date 2018-05-10 13:46
 * @since 1.0
 */
@Data
public class CreateOrderCmd implements DTO {
  /**
   * 用户id
   */
  @Min(value = 1, message = "用户id不可为空")
  private Integer userId;
  /**
   * 商品名称
   */
  @NotEmpty(message = "商品名称不可为空")
  private String productName;

  private String comment;
}
