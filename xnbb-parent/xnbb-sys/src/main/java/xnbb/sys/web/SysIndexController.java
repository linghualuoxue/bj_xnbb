package xnbb.sys.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import xnbb.sys.entity.SysUser;
import xnbb.sys.faced.SysUserFaced;

@Controller
public class SysIndexController {


    @Autowired
    private SysUserFaced sysUserFaced;

    @RequestMapping("getUser")
    public @ResponseBody SysUser getUser(){
          return sysUserFaced.getUser();
    }

}
