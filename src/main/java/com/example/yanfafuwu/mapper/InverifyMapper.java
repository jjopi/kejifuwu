package com.example.yanfafuwu.mapper;

import com.example.yanfafuwu.pojo.Inverify;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface InverifyMapper {

    @Insert("insert into inverify(username,name,identity_id,pimg,nimg,allimg,ok,uuid) values(#{username},#{name},#{identityId},#{pimg},#{nimg},#{allimg},#{ok},#{uuid})")
    public void insert(Inverify inverify);

    @Select("select * from inverify where uuid=#{uuid}")
    public Inverify getAll(String uuid);

    @Select("select * from inverify where ok=0")
    public List<Inverify> getAllNoVerify();

    @Update("update inverify set ok=1 where uuid=#{uuid}")
    public void pass(String uuid);
 }
