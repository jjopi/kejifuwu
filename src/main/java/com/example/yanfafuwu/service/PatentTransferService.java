package com.example.yanfafuwu.service;

import com.example.yanfafuwu.entity.PublishResult;
import com.example.yanfafuwu.mapper.EMCMapper;
import com.example.yanfafuwu.mapper.PatentTransferMapper;
import com.example.yanfafuwu.pojo.EMC;
import com.example.yanfafuwu.pojo.PatentTransfer;
import com.example.yanfafuwu.util.ListToStringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class PatentTransferService {
    @Resource
    PatentTransferMapper patentTransferMapper;

    public PublishResult publishService(Map<String,Object> map){
        PatentTransfer patentTransfer=new PatentTransfer();

        System.out.println(map);

        patentTransfer.setAppliNumber((String) map.get("appli_number"));
        patentTransfer.setArea((String) map.get("area"));
        patentTransfer.setContact((String) map.get("contact"));
        patentTransfer.setFee((String) map.get("fee"));
        patentTransfer.setFileurl((String) map.get("fileurl"));
        patentTransfer.setIsApproval("1");
        patentTransfer.setName((String) map.get("name"));
        patentTransfer.setOrigin((String) map.get("origin"));
        patentTransfer.setAgency((String) map.get("agency"));
        patentTransfer.setAgent((String) map.get("agent"));
        patentTransfer.setPatentNumber((String) map.get("patent_number"));
        patentTransfer.setPhone((String) map.get("phone"));
        patentTransfer.setProvider((String) map.get("provider"));
        patentTransfer.setPublicNumber((String) map.get("public_number"));
        patentTransfer.setType((String) map.get("type"));
        patentTransfer.setInventor((String) map.get("inventor"));
        patentTransfer.setApplicant((String) map.get("applicant"));

        List<String> validity = (List<String>) map.get("validity");
        String begin = validity.get(0).substring(0, 10);
        String end = validity.get(1).substring(0, 10);

        patentTransfer.setValidity(begin+"至"+end);
        patentTransfer.setDes((String) map.get("des"));
        patentTransfer.setStatus((String) map.get("status"));
        patentTransfer.setMajorSort((String) map.get("major_sort"));

        System.out.println(patentTransfer);

        int publish = patentTransferMapper.publish(patentTransfer);
        if(publish==1){
            return new PublishResult(200,"no error");
        }else {
            return new PublishResult(300,"有问题");
        }

    }

    public List<PatentTransfer> allServicesApproval(){
        return patentTransferMapper.allServicesApproval();
    }

    public PatentTransfer getServiceById(int id){
        return patentTransferMapper.getServiceById(id);
    }
}
