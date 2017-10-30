package xnbb.sys.service;

import org.springframework.stereotype.Service;
import xnbb.sys.entity.SysUser;
import xnbb.sys.faced.SysUserFaced;

@Service
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = xnbb.sys.faced.SysUserFaced.class,protocol = {"dubbo","rest"})
public class SysUserService implements SysUserFaced{

    @Override
    public void testGet() {
        System.out.println("testGet.........");
    }

    @Override
    public SysUser getUser() {
        SysUser user = new SysUser();
        user.setId("123");
        user.setName("zhangsan");
        return user;
    }

    @Override
    public SysUser postUser() {
        SysUser user = new SysUser();
        user.setId("12345");
        user.setName("zhangsan");
        return user;
    }

    @Override
    public void inserUser(SysUser user) {
        String id = user.getId();
        String name = user.getName();
        System.out.println("获取到的id =>"+id+" name =>"+name);
    }
}
