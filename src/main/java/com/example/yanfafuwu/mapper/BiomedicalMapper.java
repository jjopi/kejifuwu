package com.example.yanfafuwu.mapper;

import com.example.yanfafuwu.pojo.Biomedical;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BiomedicalMapper {

    @Insert("insert into biomedical(name,contact,phone,provider," +
            "fee,des,guarantee,characteristic,deliverable,demand," +
            "period,publishDate,isApproval,discovery,preclinical," +
            "clinical,examine,authentication,achievement,business)" +
            "values (#{name},#{contact},#{phone},#{provider},#{fee}," +
            "#{des},#{guarantee},#{characteristic},#{deliverable}," +
            "#{demand},#{period},#{publishDate},#{isApproval},#{discovery}," +
            "#{preclinical},#{clinical},#{examine},#{authentication}," +
            "#{achievement},#{business})")
    public int publish(Biomedical biomedical);



    @Select("select * from biomedical where isApproval='1'")
    public List<Biomedical> allServicesApproval();


    @Select("select * from biomedical where id=#{id}")
    public Biomedical getServiceById(int id);

















}
