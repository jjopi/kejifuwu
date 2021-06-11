package com.example.yanfafuwu.mapper;


import com.example.yanfafuwu.pojo.Sell;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SellMapper {

    @Select("select * from sell where id=#{id}")
    public Sell getSellById(int id);

    @Delete("delete from sell where business_id=#{id}")
    public void deletebyBusinessId(int id);


    @Update("update sell ok=1 where id=#{id}")
    public void s_ok(int id);

    @Insert("insert into sell(username,business_id,name)values(#{username},#{businessId},#{name})")
    public void insert(Sell sell);

    @Select("select * from sell where username=#{username}")
    public List<Sell> getSellsByUsername(String username);

}
