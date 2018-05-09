package com.lorelib.cuckoo.order.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import java.io.Serializable;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author ${author}
 * @since 2018-05-09
 */
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

	private Integer id;
    /**
     * 商品名称
     */
	@TableField("product_name")
	private String productName;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Order{" +
			", id=" + id +
			", productName=" + productName +
			"}";
	}
}
