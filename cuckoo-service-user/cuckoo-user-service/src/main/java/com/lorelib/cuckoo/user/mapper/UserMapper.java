package com.lorelib.cuckoo.user.mapper;

import com.lorelib.cuckoo.user.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2018-05-09
 */
@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
