package com.example.yanfafuwu.controller;

import com.example.yanfafuwu.mapper.SellMapper;
import com.example.yanfafuwu.pojo.Sell;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class SellController {
    @Resource
    SellMapper sellMapper;

    @ResponseBody
    @GetMapping("/s/ok")
    public void s_ok(int id){
        sellMapper.s_ok(id);
    }

    @ResponseBody
    @GetMapping("/sell")
    public Sell getSellById(int id){
        return sellMapper.getSellById(id);
    }

    @ResponseBody
    @GetMapping("/sel")
    public List<Sell> getSellsByUsername(String username){
        return sellMapper.getSellsByUsername(username);
    }

}
