package com.example.yanfafuwu.service;

import com.example.yanfafuwu.entity.PublishResult;
import com.example.yanfafuwu.mapper.BiomedicalMapper;
import com.example.yanfafuwu.pojo.Biomedical;
import com.example.yanfafuwu.util.ListToStringUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@Service
public class BiomedicalService {

    @Resource
    BiomedicalMapper biomedicalMapper;

    public PublishResult publishService(Map<String,Object> map){
        Biomedical biomedical=new Biomedical();

        biomedical.setAchievement((String)map.get("achievement"));
        biomedical.setAuthentication(ListToStringUtil.transfer((List)map.get("authentication")));
        biomedical.setBusiness(ListToStringUtil.transfer((List)map.get("business")));
        biomedical.setCharacteristic((String)map.get("characteristic"));
        biomedical.setClinical(ListToStringUtil.transfer((List)map.get("clinical")));
        biomedical.setContact((String)map.get("contact"));
        biomedical.setDeliverable((String)map.get("deliverable"));
        biomedical.setDemand((String)map.get("demand"));
        biomedical.setDes((String)map.get("des"));
        biomedical.setDiscovery(ListToStringUtil.transfer((List)map.get("discovery")));
        biomedical.setExamine(ListToStringUtil.transfer((List)map.get("examine")));
        biomedical.setFee((String) map.get("fee"));
        biomedical.setGuarantee((String) map.get("guarantee"));
        biomedical.setIsApproval("1");
        biomedical.setName((String) map.get("name"));
        biomedical.setPeriod((String) map.get("period"));
        biomedical.setPhone((String) map.get("phone"));
        biomedical.setProvider((String) map.get("provider"));
        ZonedDateTime now = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        biomedical.setPublishDate(formatter.format(now));
        biomedical.setPreclinical(ListToStringUtil.transfer((List)map.get("preclinical")));

        int publish = biomedicalMapper.publish(biomedical);
        if(publish==1){
            return new PublishResult(200,"no error");
        }else {
            return new PublishResult(300,"有问题");
        }

    }

    public List<Biomedical> allServicesApproval(){
       return biomedicalMapper.allServicesApproval();
    }

    public Biomedical getServiceById(int id){
       return biomedicalMapper.getServiceById(id);
    }
}
