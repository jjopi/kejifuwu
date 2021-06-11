package com.example.yanfafuwu.service;

import com.example.yanfafuwu.entity.PublishResult;
import com.example.yanfafuwu.mapper.BiomedicalMapper;
import com.example.yanfafuwu.mapper.EMCMapper;
import com.example.yanfafuwu.pojo.Biomedical;
import com.example.yanfafuwu.pojo.EMC;
import com.example.yanfafuwu.util.ListToStringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@Service
public class EMCService {
    @Resource
    EMCMapper emcMapper;

    public PublishResult publishService(Map<String,Object> map){
        EMC emc=new EMC();

        emc.setName((String) map.get("name"));
        emc.setArea(ListToStringUtil.transfer((List<String>) map.get("area")));
        emc.setCal((String) map.get("cal"));
        emc.setCma((String) map.get("cma"));
        emc.setCnas((String) map.get("cnas"));
        emc.setContact((String) map.get("contact"));
        emc.setEmi(ListToStringUtil.transfer((List<String>) map.get("emi")));
        emc.setEms(ListToStringUtil.transfer((List<String>) map.get("ems")));
        emc.setFee((String) map.get("fee"));
        emc.setInstrumentLab((String) map.get("instrument_lab"));
        emc.setIsApproval("1");
        emc.setLocation((String) map.get("location"));
        emc.setPeriod((String) map.get("period"));
        emc.setPhone((String) map.get("phone"));
        emc.setProvider((String) map.get("provider"));
        emc.setTestPattern(ListToStringUtil.transfer((List<String>) map.get("test_pattern")));
        emc.setTests((String) map.get("tests"));

        int publish = emcMapper.publish(emc);
        if(publish==1){
            return new PublishResult(200,"no error");
        }else {
            return new PublishResult(300,"有问题");
        }

    }

    public List<EMC> allServicesApproval(){
        return emcMapper.allServicesApproval();
    }

    public EMC getServiceById(int id){
        return emcMapper.getServiceById(id);
    }
}
