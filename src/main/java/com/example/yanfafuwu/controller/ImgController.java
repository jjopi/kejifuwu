package com.example.yanfafuwu.controller;

import com.example.yanfafuwu.entity.FileResult;
import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.UUID;

@Controller
public class ImgController {



    @Value("${server.port}")
    private String port;

    @Value("${my_ip}")
    private String ip;

    @PostMapping("/img/upload")
    @ResponseBody
    public FileResult upload_img(@RequestParam MultipartFile file) {
        String originalFilename = file.getOriginalFilename();
        System.out.println(originalFilename);
        String realFileName = UUID.randomUUID() + originalFilename;
//        String path = ClassUtils.getDefaultClassLoader().getResource("static/imgs/").getPath()+realFileName;
//        System.out.println(path);

        File file1=new File("/root/yanfafuwu/imgs/"+realFileName);

//        File file1=new File(path);
        try {
            file.transferTo(file1);
        } catch (IOException e) {
            e.printStackTrace();
        }

            System.out.println("http://"+ip+":"+port+"/"+"imgs/"+realFileName);
            return new FileResult("200","http://"+ip+":"+port+"/"+"imgs/"+realFileName);

    }

}
