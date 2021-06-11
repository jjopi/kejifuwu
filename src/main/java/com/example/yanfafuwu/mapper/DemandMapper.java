package com.example.yanfafuwu.mapper;


import com.example.yanfafuwu.pojo.Demand;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DemandMapper {

    @Insert("insert into demand(username,type,name,demander,publish_date,contact,phone,budget,des,ok) values " +
            "(#{username},#{type},#{name},#{demander},#{publishDate},#{contact},#{phone},#{budget},#{des},#{ok})")
    public int insert(Demand demand);


    @Select(" select * from demand where username=#{username}")
    public List<Demand> getDemandsByUsername(String username);

    @Delete("delete from demand where id=#{id}")
    public int deleteById(Integer id);

    @Select("select * from demand")
    public List<Demand> allDemands();

    @Select("select * from demand where id=#{id}")
    public Demand demandInformationById(int id);

    @Select("select * from demand where username=#{username} and ok=#{ok}")
    public List<Demand> getAllverifiedDemandByUsername(String username,int ok);

    @Update("update demand set ok=1 where id=#{id}")
    public int passVerification(int id);

    @Select("select * from demand where ok=0")
    public List<Demand> getAllDemandsZero();
}
