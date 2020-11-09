package com.xztx.service.impl;

import com.xztx.mapper.UserMapper;
import com.xztx.model.User;
import com.xztx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 获取user信息
     * @return
     */
    @Override
    public List<User> getUserMessage(String userId) {
        return userMapper.getUserMessage(userId);
    }
}
