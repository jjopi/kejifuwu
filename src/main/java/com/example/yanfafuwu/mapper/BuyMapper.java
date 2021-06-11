package com.example.yanfafuwu.mapper;

import com.example.yanfafuwu.pojo.Buy;
import com.example.yanfafuwu.pojo.Sell;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BuyMapper {


    @Select("select * from buy where id=#{id}")
    public Buy getBuyById(int id);

    @Insert("insert into buy(username,business_id,name)values(#{username},#{businessId},#{name})")
    public void insert(Buy buy);

    @Select("select * from buy where username=#{username}")
    public List<Buy> getBuysByUsername(String username);

    @Delete("delete from buy where business_id=#{id}")
    public void deletebyBusinessId(int id);

}
