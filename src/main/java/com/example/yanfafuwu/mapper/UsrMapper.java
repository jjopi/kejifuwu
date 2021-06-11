package com.example.yanfafuwu.mapper;

import com.example.yanfafuwu.pojo.Usr;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UsrMapper {


    @Options(useGeneratedKeys = true,keyProperty = "usr.id")
    @Insert("insert into usr(username,passwd,is_verify) " +
            "values(#{username},#{passwd},#{isVerify})")
    public void register(Usr usr);

    @Select("select username from usr where username=#{username}")
    public String isExist(String username);

    @Select("select * from usr where username=#{username}")
    public Usr getByUsername(String username);

    @Select("select count(*) from usr where username=#{username} and passwd=#{passwd}")
    public int LoginCheck(String username,String passwd);

}
