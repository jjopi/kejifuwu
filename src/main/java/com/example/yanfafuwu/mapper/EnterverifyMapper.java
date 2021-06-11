package com.example.yanfafuwu.mapper;

import com.example.yanfafuwu.pojo.Enterverify;
import com.example.yanfafuwu.pojo.Inverify;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface EnterverifyMapper {

    @Insert("insert into enterverify(username,name,identity_id,img,represent,ok,uuid) values(#{username},#{name},#{identityId},#{img},#{represent},#{ok},#{uuid})")
    public void insert(Enterverify enterverify);

    @Update("update enterverify set ok=1 where uuid=#{uuid}")
    public void pass(String uuid);

    @Select("select * from enterverify where ok=0")
    public List<Enterverify> getAllNoVerify();

    @Select("select * from enterverify where uuid=#{uuid}")
    public Enterverify getAll(String uuid);
}
