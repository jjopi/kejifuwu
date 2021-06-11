package com.example.yanfafuwu.controller;

import com.example.yanfafuwu.entity.PublishResult;
import com.example.yanfafuwu.pojo.Biomedical;
import com.example.yanfafuwu.pojo.ElectronicOptical;
import com.example.yanfafuwu.service.BiomedicalService;
import com.example.yanfafuwu.service.ElectronicOpticalService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class ElectronicOpticalController {
    @Resource
    ElectronicOpticalService electronicOpticalService;

    @PostMapping("/electron-optical")
    @ResponseBody
    public PublishResult publishService(@RequestBody Map<String,Object> map){
        return electronicOpticalService.publishService(map);
    }

    @ResponseBody
    @GetMapping("/electronic-opticals")
    public List<ElectronicOptical> allServicesApproval(@RequestParam String is_approval){
        System.out.println(is_approval);
        if("1".equals(is_approval)){
            List<ElectronicOptical> electronicOpticals = electronicOpticalService.allServicesApproval();

            return electronicOpticals;
        }else{
            return null;
        }
    }

    @ResponseBody
    @GetMapping("/electronic-optical")
    public ElectronicOptical getServiceById(@RequestParam String id){
        return electronicOpticalService.getServiceById(Integer.parseInt(id));
    }
}
