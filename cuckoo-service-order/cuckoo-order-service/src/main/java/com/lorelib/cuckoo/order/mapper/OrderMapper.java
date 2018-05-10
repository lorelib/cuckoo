package com.lorelib.cuckoo.order.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.lorelib.cuckoo.order.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 订单表 Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2018-05-10
 */
@Repository
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}
