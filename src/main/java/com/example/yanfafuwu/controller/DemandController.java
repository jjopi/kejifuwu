package com.example.yanfafuwu.controller;


import com.example.yanfafuwu.mapper.DemandMapper;
import com.example.yanfafuwu.pojo.Demand;
import com.example.yanfafuwu.pojo.Service;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class DemandController {

    @Resource
    DemandMapper demandMapper;

    @ResponseBody
    @PostMapping("/demand")
    public int insert(Demand demand){
        return demandMapper.insert(demand);
    }

    @ResponseBody
    @GetMapping("/demands")
    public List<Demand> getDemandsByUsername(String username){
        return demandMapper.getDemandsByUsername(username);
    }

    @ResponseBody
    @GetMapping("/demand/{id}")
    public int deleteById(@PathVariable("id") Integer id){
        System.out.println(id);
        return demandMapper.deleteById(id);
    }

    @ResponseBody
    @GetMapping("/allDemands")
    public List<Demand> allDemands(){
        return demandMapper.allDemands();
    }

    @ResponseBody
    @GetMapping("/demand_information")
    public Demand demand_information(int id){
        return demandMapper.demandInformationById(id);
    }

    @ResponseBody
    @GetMapping("/demand/list")
    public List<Demand> getAllverifiedServiceByUsername(String username, int ok){
        return demandMapper.getAllverifiedDemandByUsername(username,ok);
    }

    @ResponseBody
    @GetMapping("/d")
    public int passVerification(int id){
        return demandMapper.passVerification(id);
    }

    @ResponseBody
    @GetMapping("/d/all/0")
    public List<Demand> getAllDemandsZero(){
        return demandMapper.getAllDemandsZero();
    }

}
