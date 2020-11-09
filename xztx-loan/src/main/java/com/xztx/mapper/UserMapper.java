package com.xztx.mapper;

import com.xztx.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    /***
     * 获取user信息
     * @return
     */
    List<User> getUserMessage(@Param("userId") String userId);
}
