package com.example.yanfafuwu.controller;

import com.example.yanfafuwu.entity.PublishResult;
import com.example.yanfafuwu.pojo.Biomedical;
import com.example.yanfafuwu.service.BiomedicalService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class BiomedicalController {

    @Resource
    BiomedicalService biomedicalService;

    @PostMapping("/biomedical")
    @ResponseBody
    public PublishResult publishService(@RequestBody Map<String,Object> map){
        return biomedicalService.publishService(map);
    }

    @ResponseBody
    @GetMapping("/biomedicals")
    public List<Biomedical> allServicesApproval(@RequestParam String is_approval){
        System.out.println(is_approval);
        if("1".equals(is_approval)){
            List<Biomedical> biomedicals = biomedicalService.allServicesApproval();
            return biomedicals;
        }else{
            return null;
        }
    }

    @ResponseBody
    @GetMapping("/biomedical")
    public Biomedical getServiceById(@RequestParam String id){
        return biomedicalService.getServiceById(Integer.parseInt(id));
    }
}
