package com.example.yanfafuwu.util;

import com.example.yanfafuwu.entity.BiomedicalResult;
import com.example.yanfafuwu.pojo.Biomedical;

import java.util.ArrayList;
import java.util.List;

public class POJOToResult {


    public static List<BiomedicalResult> pojotoresult(List<Biomedical> list){
        List<BiomedicalResult> res=new ArrayList<>();
        for (Biomedical biomedical : list) {
            BiomedicalResult temp=new BiomedicalResult();
            temp.setAchievement(biomedical.getAchievement());
            temp.setAuthentication(StringToList.stringtolist(biomedical.getAuthentication()));
            temp.setPublishDate(biomedical.getPublishDate());
            temp.setBusiness(StringToList.stringtolist(biomedical.getBusiness()));
            temp.setDemand(biomedical.getDemand());
            temp.setContact(biomedical.getContact());
            temp.setDes(biomedical.getDes());
            temp.setFee(biomedical.getFee());
            temp.setType(biomedical.getType());
            temp.setCharacteristic(biomedical.getCharacteristic());
            temp.setPhone(biomedical.getPhone());
            temp.setExamine(StringToList.stringtolist(biomedical.getExamine()));
            temp.setClinical(StringToList.stringtolist(biomedical.getClinical()));
            temp.setPreclinical(StringToList.stringtolist(biomedical.getPreclinical()));
            temp.setPeriod(biomedical.getPeriod());
            temp.setDeliverable(biomedical.getDeliverable());
            temp.setGuarantee(biomedical.getGuarantee());
            temp.setName(biomedical.getName());
            temp.setId(biomedical.getId());
            temp.setProvider(biomedical.getProvider());
            temp.setDiscovery(StringToList.stringtolist(biomedical.getDiscovery()));

            res.add(temp);
        }
        return res;
    }

}
