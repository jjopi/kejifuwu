package com.example.yanfafuwu.mapper;

import com.example.yanfafuwu.pojo.Biomedical;
import com.example.yanfafuwu.pojo.EMC;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EMCMapper {

    @Insert("insert into emc(emi,ems,`name`,area,cma,cnas,cal,period," +
            "test_pattern,instrument_lab,location,contact,phone,provider,fee,tests,is_approval)" +
            "values (#{emi},#{ems},#{name},#{area},#{cma}," +
            "#{cnas},#{cal},#{period},#{testPattern},#{instrumentLab}," +
            "#{location},#{contact},#{phone},#{provider},#{fee}," +
            "#{tests},#{isApproval})")
    public int publish(EMC emc);



    @Select("select * from emc where is_approval='1'")
    public List<EMC> allServicesApproval();


    @Select("select * from emc where id=#{id}")
    public EMC getServiceById(int id);
}
