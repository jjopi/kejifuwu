package com.example.yanfafuwu.controller;

import com.example.yanfafuwu.entity.PublishResult;
import com.example.yanfafuwu.pojo.PatentTransfer;
import com.example.yanfafuwu.service.PatentTransferService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class PatentTransferController {
    @Resource
    PatentTransferService patentTransferService;

    @PostMapping("/patent-transfer")
    @ResponseBody
    public PublishResult publishService(@RequestBody Map<String,Object> map){
        System.out.println(map);
        return patentTransferService.publishService(map);
    }

    @ResponseBody
    @GetMapping("/patent-transfers")
    public List<PatentTransfer> allServicesApproval(@RequestParam String is_approval){
        System.out.println(is_approval);
        if("1".equals(is_approval)){
            List<PatentTransfer> patentTransfers = patentTransferService.allServicesApproval();

            return patentTransfers;
        }else{
            return null;
        }
    }

    @ResponseBody
    @GetMapping("/patent-transfer")
    public PatentTransfer getServiceById(@RequestParam String id){
        return patentTransferService.getServiceById(Integer.parseInt(id));
    }
}
