package com.example.yanfafuwu.controller;

import com.example.yanfafuwu.mapper.EnterverifyMapper;
import com.example.yanfafuwu.mapper.InverifyMapper;
import com.example.yanfafuwu.mapper.UsrMapper;
import com.example.yanfafuwu.pojo.Enterverify;
import com.example.yanfafuwu.pojo.Inverify;
import com.example.yanfafuwu.pojo.Usr;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class UserController {

    @Resource
    UsrMapper usrMapper;

    @Resource
    InverifyMapper inverifyMapper;

    @Resource
    EnterverifyMapper enterverifyMapper;

    @ResponseBody
    @GetMapping("/user")
    public Usr getByUsername(String username){
        return usrMapper.getByUsername(username);
    }

//    @ResponseBody
//    @PostMapping("/upload/individual")
//    public int upload_in(MultipartFile file1,MultipartFile file2,MultipartFile file3,
//                       String identity_id,String name,String username) throws IOException {
//        System.out.println(file1.getOriginalFilename());
//        System.out.println(identity_id);
//        System.out.println(name);
//        System.out.println(username);
//        String file1_name=username+UUID.randomUUID().toString()+file1.getOriginalFilename();
//        String file2_name=username+UUID.randomUUID().toString()+file2.getOriginalFilename();
//        String file3_name=username+UUID.randomUUID().toString()+file3.getOriginalFilename();
//
//        file1.transferTo(new File("D:/pic/"+file1_name));
//        file2.transferTo(new File("D:/pic/"+file2_name));
//        file3.transferTo(new File("D:/pic/"+file3_name));
//
//        Inverify inverify=new Inverify();
//        inverify.setName(name);
//        inverify.setPimg(file1_name);
//        inverify.setNimg(file2_name);
//        inverify.setAllimg(file3_name);
//        inverify.setIdentityId(identity_id);
//        inverify.setUsername(username);
//        inverify.setOk(0);
//        inverify.setUuid(UUID.randomUUID().toString());
//        inverifyMapper.insert(inverify);
//        return usrMapper.change_status_to_verifying(username);
//    }

//    @ResponseBody
//    @PostMapping("/upload/enterprise")
//    public int upload_enter(MultipartFile enter_file,String username,
//                       String enter_name,String enter_number,String enter_represent) throws IOException {
//
//        System.out.println(username);
//        System.out.println(enter_name);
//        System.out.println(enter_number);
//        System.out.println(enter_represent);
//
//        String file1_name=username+UUID.randomUUID().toString()+enter_file.getOriginalFilename();
//
//
//        enter_file.transferTo(new File("D:/pic/"+file1_name));
//        Enterverify enterverify=new Enterverify();
//        enterverify.setUsername(username);
//        enterverify.setName(enter_name);
//        enterverify.setImg(file1_name);
//        enterverify.setRepresent(enter_represent);
//        enterverify.setIdentityId(enter_number);
//        enterverify.setOk(0);
//        enterverify.setUuid(UUID.randomUUID().toString());
//        enterverifyMapper.insert(enterverify);
//        return usrMapper.change_status_to_verifying_enter(username);
//    }
}
