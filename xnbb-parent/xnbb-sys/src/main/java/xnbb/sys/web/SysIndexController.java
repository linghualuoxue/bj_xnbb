package xnbb.sys.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xnbb.sys.faced.SysUserFaced;

@Controller
public class SysIndexController {


    @Autowired
    private SysUserFaced sysUserFaced;

    @RequestMapping("getUser")
    public SysUserFaced getUser(){
          return sysUserFaced;
    }

}
