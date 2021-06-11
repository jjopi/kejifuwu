package com.example.yanfafuwu.controller;

import com.example.yanfafuwu.mapper.DemandMapper;
import com.example.yanfafuwu.mapper.ServiceMapper;
import com.example.yanfafuwu.pojo.Demand;
import com.example.yanfafuwu.pojo.Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ServiceController {

    @Resource
    ServiceMapper serviceMapper;

//    @ResponseBody
//    @PostMapping("/service")
//    public int insert(Service service){
//        return serviceMapper.insert(service);
//    }

    @ResponseBody
    @PostMapping("/service_end")
    public int service_end(Service service){
        return serviceMapper.insert(service);
    }


    @ResponseBody
    @GetMapping("/services")
    public List<Service> getServicesByUsername(String username){
        return serviceMapper.getServicesByUsername(username);
    }

//    @ResponseBody
//    @GetMapping("/service/{id}")
//    public int deleteById(@PathVariable("id") Integer id){
//        System.out.println(id);
//        return serviceMapper.deleteById(id);
//    }
//
//    @ResponseBody
//    @GetMapping("/service/list")
//    public List<Service> getAllverifiedServiceByUsername(String username,int ok){
//        return serviceMapper.getAllverifiedServiceByUsername(username,ok);
//    }



    @ResponseBody
    @GetMapping("/service_information")
    public Service demand_information(int id){
        return serviceMapper.serviceInformationById(id);
    }

    @ResponseBody
    @GetMapping("/s/all/0")
    public List<Service> getAllServicesZero(){
        return serviceMapper.getAllServicesZero();
    }

    @ResponseBody
    @GetMapping("/s")
    public int passVerification(int id){
        return serviceMapper.passVerification(id);
    }

}
