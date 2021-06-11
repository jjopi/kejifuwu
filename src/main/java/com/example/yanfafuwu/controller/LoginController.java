package com.example.yanfafuwu.controller;

import com.example.yanfafuwu.entity.ExistResult;
import com.example.yanfafuwu.mapper.UsrMapper;
import com.sun.org.apache.bcel.internal.generic.FADD;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class LoginController {

    @Resource
    UsrMapper usrMapper;

    @ResponseBody
    @GetMapping("/login")
    public ExistResult login(String username, String passwd) {
        int i = usrMapper.LoginCheck(username, passwd);
        if(i>0){
            return new ExistResult(true);
        }else{
            return new ExistResult(false);
        }
    }
}
