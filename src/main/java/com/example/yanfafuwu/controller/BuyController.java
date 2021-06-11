package com.example.yanfafuwu.controller;

import com.example.yanfafuwu.mapper.BuyMapper;
import com.example.yanfafuwu.pojo.Buy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class BuyController {
    @Resource
    BuyMapper buyMapper;

    @ResponseBody
    @GetMapping("/order/b")
    public Buy getBuyById(int id){
        return buyMapper.getBuyById(id);
    }

    @ResponseBody
    @GetMapping("/buy")
    public List<Buy> getBuysByUsername(String username){
       return buyMapper.getBuysByUsername(username);
    }

}
