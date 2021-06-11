package com.example.yanfafuwu.controller;

import com.example.yanfafuwu.entity.PublishResult;
import com.example.yanfafuwu.pojo.Biomedical;
import com.example.yanfafuwu.pojo.EMC;
import com.example.yanfafuwu.service.BiomedicalService;
import com.example.yanfafuwu.service.EMCService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class EMCController {

    @Resource
    EMCService emcService;

    @PostMapping("/emc")
    @ResponseBody
    public PublishResult publishService(@RequestBody Map<String,Object> map){
        return emcService.publishService(map);
    }

    @ResponseBody
    @GetMapping("/emcs")
    public List<EMC> allServicesApproval(@RequestParam String is_approval){
        System.out.println(is_approval);
        if("1".equals(is_approval)){
            List<EMC> emcs = emcService.allServicesApproval();
            return emcs;
        }else{
            return null;
        }
    }

    @ResponseBody
    @GetMapping("/emc")
    public EMC getServiceById(@RequestParam String id){
        return emcService.getServiceById(Integer.parseInt(id));
    }
}
