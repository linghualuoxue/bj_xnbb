package com.bj.xnbb.service.impl;

import com.bj.xnbb.entity.User;
import com.bj.xnbb.service.UserService;
import org.springframework.stereotype.Service;

@Service
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = com.bj.xnbb.service.UserService.class,protocol = {"rest","dubbo"},retries = 0)
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
        System.out.println("测试输入的int类型id:"+id);
        User user = new User();
        user.setId("1001");
        user.setName("zhangsan");
        return user;
    }

    public User getUser(Integer id, String name) {

        System.out.println("测试两个参数:id="+id+"---name:"+name);
        User user = new User();
        user.setId("1001");
        user.setName("zhangsan");
        return user;
    }

    public void testPost() {
        System.out.println("测试post");
    }

    public User postUser(User user) {
        System.out.println("测试testPost");
        System.out.println("id:"+user.getId()+"---name:"+user.getName());
        User u = new User();
        u.setId("1001");
        u.setName("zhangsan");
        return u;
    }

    public User postUser(String id) {
        System.out.println("测试postUser  id:"+id);
        User user = new User();
        user.setId("1001");
        user.setName("zhangsan");
        return user;
    }
}
