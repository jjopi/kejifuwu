package com.example.yanfafuwu.mapper;

import com.example.yanfafuwu.pojo.Biomedical;
import com.example.yanfafuwu.pojo.ElectronicOptical;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ElectronicOpticalMapper {

    @Insert("insert into electronicoptical(`name`,kind,buydate,provider," +
            "location,subjects,manufacturer,`number`,agency,contact,phone," +
            "`mode`,`status`,work_mode,fee,des,is_approval,parts,params)" +
            "values (#{name},#{kind},#{buydate},#{provider},#{location}," +
            "#{subjects},#{manufacturer},#{number},#{agency}," +
            "#{contact},#{phone},#{mode},#{status},#{workMode}," +
            "#{fee},#{des},#{isApproval},#{parts}," +
            "#{params})")
    public int publish(ElectronicOptical electronicOptical);

    @Select("select * from electronicoptical where is_approval='1'")
    public List<ElectronicOptical> allServicesApproval();


    @Select("select * from electronicoptical where id=#{id}")
    public ElectronicOptical getServiceById(int id);



}
