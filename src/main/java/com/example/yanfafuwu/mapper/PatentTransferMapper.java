package com.example.yanfafuwu.mapper;

import com.example.yanfafuwu.pojo.Biomedical;
import com.example.yanfafuwu.pojo.PatentTransfer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PatentTransferMapper {
    @Insert("insert into patenttransfer(name,status,type,area," +
            "validity,origin,patent_number,appli_number,public_number,fileurl," +
            "contact,phone,provider,fee,is_approval,des,inventor,applicant,agency,agent,major_sort)"  +
            "values (#{name},#{status},#{type},#{area},#{validity}," +
            "#{origin},#{patentNumber},#{appliNumber},#{publicNumber}," +
            "#{fileurl},#{contact},#{phone},#{provider},#{fee}," +
            "#{isApproval},#{des},#{inventor},#{applicant},#{agency},#{agent},#{majorSort})")
    public int publish(PatentTransfer patentTransfer);



    @Select("select * from patenttransfer where is_approval='1'")
    public List<PatentTransfer> allServicesApproval();


    @Select("select * from patenttransfer where id=#{id}")
    public PatentTransfer getServiceById(int id);
}
