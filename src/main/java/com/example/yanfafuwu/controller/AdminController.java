package com.example.yanfafuwu.controller;

import com.example.yanfafuwu.entity.ExistResult;
import com.example.yanfafuwu.mapper.AdminMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;

@Controller
public class AdminController {
    @Resource
    AdminMapper adminMapper;

    @ResponseBody
    @GetMapping("/admin/login")
    public ExistResult login(String username,String passwd){
        int login = adminMapper.login(username, passwd);
        if(login>0){
            return new ExistResult(true);
        }else {
            return new ExistResult(false);
        }
    }
}
