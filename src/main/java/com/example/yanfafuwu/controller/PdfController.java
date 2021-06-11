package com.example.yanfafuwu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class PdfController {


    @GetMapping("/pdf")
    public void getPdf(String name, HttpServletResponse response) throws IOException {
        System.out.println(name);
        InputStream inputStream=new FileInputStream(name);
        byte[] buffer=new byte[inputStream.available()];
        inputStream.read(buffer);
        response.getOutputStream().write(buffer);
    }
}
