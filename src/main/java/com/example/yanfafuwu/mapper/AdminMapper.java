package com.example.yanfafuwu.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminMapper {

    @Select("select count(*) from admin where username=#{username} and passwd=#{passwd} ")
    public int login(String username,String passwd);
}
