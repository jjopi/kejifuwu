package com.example.yanfafuwu.controller;

import com.example.yanfafuwu.mapper.EnterverifyMapper;
import com.example.yanfafuwu.mapper.InverifyMapper;
import com.example.yanfafuwu.mapper.UsrMapper;
import com.example.yanfafuwu.pojo.Enterverify;
import com.example.yanfafuwu.pojo.Inverify;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class InverifyController {

//    @Resource
//    InverifyMapper inverifyMapper;
//
//    @Resource
//    EnterverifyMapper enterverifyMapper;
//    @Resource
//    UsrMapper usrMapper;
//
//    @ResponseBody
//    @GetMapping("/individual_information")
//    public Inverify in_getAll(String uuid){
//        Inverify all = inverifyMapper.getAll(uuid);
//        return all;
//    }
//
//    @ResponseBody
//    @GetMapping("/enterprise_information")
//    public Enterverify enter_getAll(String uuid){
//        Enterverify all = enterverifyMapper.getAll(uuid);
//        return all;
//    }
//
//
//
//    @ResponseBody
//    @GetMapping("/verification/list")
//    public List<Inverify> getAllNoVerify(){
//        return inverifyMapper.getAllNoVerify();
//    }
//
//    @ResponseBody
//    @GetMapping("/enterprise/verification/list")
//    public List<Enterverify> enter_getAllNoVerify(){
//        return enterverifyMapper.getAllNoVerify();
//    }
//
//
//    @ResponseBody
//    @GetMapping("/verification/pass")
//    public void in_pass(String uuid,String username){
//        inverifyMapper.pass(uuid);
//        usrMapper.change_status_to_verified(username);
//    }
//
//    @ResponseBody
//    @GetMapping("/enterprise/verification/pass")
//    public void enter_pass(String uuid,String username){
//
//        enterverifyMapper.pass(uuid);
//        usrMapper.change_status_to_verified_en(username);
//    }
}
