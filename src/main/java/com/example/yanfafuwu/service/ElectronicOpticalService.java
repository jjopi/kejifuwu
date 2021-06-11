package com.example.yanfafuwu.service;

import com.example.yanfafuwu.entity.PublishResult;
import com.example.yanfafuwu.mapper.ElectronicOpticalMapper;
import com.example.yanfafuwu.pojo.Biomedical;
import com.example.yanfafuwu.pojo.ElectronicOptical;
import com.example.yanfafuwu.util.ListToStringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Service
public class ElectronicOpticalService {

    @Resource
    ElectronicOpticalMapper electronicOpticalMapper;

    public PublishResult publishService(Map<String,Object> map){
        ElectronicOptical electronicOptical=new ElectronicOptical();

        System.out.println(map);

        electronicOptical.setAgency((String) map.get("agency"));
        electronicOptical.setBuydate((String) map.get("buy_date"));
        electronicOptical.setContact((String) map.get("contact"));
        electronicOptical.setDes((String) map.get("des"));
        electronicOptical.setFee((String) map.get("fee"));
        electronicOptical.setIsApproval("1");
        electronicOptical.setKind((String) map.get("kind"));
        electronicOptical.setLocation((String) map.get("location"));
        electronicOptical.setManufacturer((String) map.get("manufacturer"));
        electronicOptical.setMode(ListToStringUtil.transfer((List<String>) map.get("mode")));
        electronicOptical.setName((String) map.get("name"));
        electronicOptical.setWorkMode((String) map.get("work_mode"));
        electronicOptical.setType((String) map.get("type"));
        electronicOptical.setStatus((String) map.get("status"));
        electronicOptical.setSubjects((String) map.get("subjects"));
        electronicOptical.setParts((String) map.get("parts"));
        electronicOptical.setParams((String) map.get("params"));
        electronicOptical.setNumber((String) map.get("number"));
        electronicOptical.setProvider((String) map.get("provider"));
        electronicOptical.setPhone((String) map.get("phone"));

        System.out.println(electronicOptical);
        int publish = electronicOpticalMapper.publish(electronicOptical);
        if(publish==1){
            return new PublishResult(200,"no error");
        }else {
            return new PublishResult(300,"有问题");
        }

    }

    public List<ElectronicOptical> allServicesApproval(){
        return electronicOpticalMapper.allServicesApproval();
    }

    public ElectronicOptical getServiceById(int id){
        return electronicOpticalMapper.getServiceById(id);
    }
}
