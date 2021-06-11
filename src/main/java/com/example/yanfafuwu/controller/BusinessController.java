package com.example.yanfafuwu.controller;

import com.example.yanfafuwu.mapper.*;
import com.example.yanfafuwu.pojo.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

@Controller
public class BusinessController {

    @Resource
    BusinessMapper businessMapper;
    @Resource
    ServiceMapper serviceMapper;

    @Resource
    DemandMapper demandMapper;

    @Resource
    BuyMapper buyMapper;

    @Resource
    SellMapper sellMapper;

    @ResponseBody
    @GetMapping("/business")
    public Business getBusinessByBuyId(int id){
        return businessMapper.getBusinessById(id);
    }

    @ResponseBody
    @PostMapping("/business")
    public int updateFileByStep(MultipartFile file,int index,int id) throws IOException {
        String s_index="pro"+index;
        String originalFilename = file.getOriginalFilename();
        String file_path="D:/file/"+UUID.randomUUID().toString()+originalFilename;
        File file1=new File(file_path);
        file.transferTo(file1);
        System.out.println(id+index);
        int providerStep = businessMapper.getProviderStep(id);
        providerStep++;
        businessMapper.setProviderStep(id,providerStep);
        return businessMapper.updateFileByStep(file_path,s_index,id);
    }

    @ResponseBody
    @PostMapping("/busi/s/assessment")
    public int s_assessment(int id ,String assessment){
       return businessMapper.s_assessment(id,assessment);
    }

    @ResponseBody
    @PostMapping("/busi/b/assessment")
    public int b_assessment(int id ,String assessment){
        return businessMapper.b_assessment(id,assessment);
    }

    @ResponseBody
    @GetMapping("/pprogress")
    public int setPProgressID(int p_id,int business_id){
        return businessMapper.setPProgressID(p_id,business_id);
    }

    @ResponseBody
    @GetMapping("/dprogress")
    public int setDProgressID(int d_id,int business_id){
        return businessMapper.setDProgressID(d_id,business_id);
    }

    @ResponseBody
    @GetMapping("/buildbusiness")
    public int buildbusiness(int s_id,int d_id){

        Demand demand = demandMapper.demandInformationById(d_id);
        Service service = serviceMapper.serviceInformationById(s_id);
        ZonedDateTime now = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String start_date = formatter.format(now);
        Business business=new Business();
        business.setStartDate(start_date);
        business.setPProgress(0);
        business.setDProgress(0);
        business.setBuyEvaluationTag(0);
        business.setSellEvaluationTag(0);
        business.setPlatformEvaluationTag(0);
        business.setOk(0);
        business.setName(demand.getName()+"<=>"+service.getName());
        business.setBuyer(demand.getName());
        business.setSeller(service.getName());
        businessMapper.insert(business);

        Integer businessId = business.getId();

        Sell sell=new Sell();
        sell.setName(service.getName()+"=>"+demand.getName());
        sell.setUsername(service.getUsername());
        sell.setBusinessId(businessId);
        sellMapper.insert(sell);
        Buy buy=new Buy();
        buy.setName(demand.getName()+"<="+service.getName());
        buy.setBusinessId(businessId);
        buy.setUsername(demand.getUsername());
        buyMapper.insert(buy);


        return 0;
    }

    @ResponseBody
    @GetMapping("/businessing/list")
    public List<Business> adminGetBusinessToAsset(){

      return   businessMapper.adminGetBusinessToAsset();
    }

    @ResponseBody
    @PostMapping("/comment/last")
    public int addLastComment(int id,String comment){
        sellMapper.deletebyBusinessId(id);
        buyMapper.deletebyBusinessId(id);
        return businessMapper.addLastComment(id,comment);
    }

    @ResponseBody
    @GetMapping("/done")
    public List<Business> getAllDoneBusiness(){
        return businessMapper.getAllDoneBusiness();
    }

    @ResponseBody
    @GetMapping("/in/done")
    public List<Business> getDoneBusinessByUsername(String username){
       return businessMapper.getDoneBusinessByUsername(username);
    }
}
