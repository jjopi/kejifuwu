package com.example.yanfafuwu.controller;

import com.example.yanfafuwu.entity.ExistResult;
import com.example.yanfafuwu.entity.RegisterResult;
import com.example.yanfafuwu.mapper.UsrMapper;
import com.example.yanfafuwu.pojo.Usr;
import com.sun.org.apache.bcel.internal.generic.FADD;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.UUID;

@Controller
public class RegisterController{

    @Resource
    UsrMapper usrMapper;

    @ResponseBody
    @PostMapping("/register")
    public RegisterResult register(@RequestBody Map<String,Object> map){
        Usr usr=new Usr();
        System.out.println(map);
        try {
            usr.setUsername((String) map.get("username"));
            usr.setPasswd((String) map.get("passwd"));
            usr.setIsVerify(0);
            usrMapper.register(usr);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new RegisterResult(true);
    }

    @GetMapping("/username")
    @ResponseBody
    public ExistResult isExist(String username){
        String exist = usrMapper.isExist(username);
        if(null!=exist){
            return new ExistResult(true);
        }else {
            return new ExistResult(false);
        }
    }
}
