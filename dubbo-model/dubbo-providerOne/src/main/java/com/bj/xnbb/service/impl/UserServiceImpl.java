package com.bj.xnbb.service.impl;

import com.bj.xnbb.entity.User;
import com.bj.xnbb.service.UserService;

public class UserServiceImpl implements UserService {

    public void testGet() {
        System.out.println("---测试get-----");
    }

    public User getUser() {
        User user = new User();
        user.setId("1001");
        user.setName("zhangsan");
        return user;
    }

    public User getUser(Integer id) {
        return null;
    }

    public User getUser(Integer id, String name) {
        return null;
    }

    public void testPost() {

    }

    public User postUser() {
        return null;
    }

    public User postUser(String id) {
        return null;
    }
}
