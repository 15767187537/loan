package com.xztx.service;

import com.xztx.model.User;

import java.util.List;

public interface UserService {

    /**
     * 获取user信息
     * @return
     */
    List<User> getUserMessage(String userId);

}
