package com.example.yanfafuwu.mapper;

import com.example.yanfafuwu.pojo.Business;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BusinessMapper {



    @Select("select * from business where id=#{id}")
    public Business getBusinessById(int id);

    @Insert("insert into business(ok,start_date,buy_evaluation_tag,sell_evaluation_tag,p_progress,d_progress,platform_evaluation_tag,name,buyer,seller)values" +
            "(#{ok},#{startDate},#{buyEvaluationTag},#{sellEvaluationTag},#{pProgress},#{dProgress},#{platformEvaluationTag},#{name},#{buyer},#{seller})")
    @Options(useGeneratedKeys = true,keyProperty = "id", keyColumn = "id")
    public void insert(Business business);

    @Select("select p_progress from business where id=#{id}")
    public int getProviderStep(int id);

    @Update("update business set p_progress=#{providerStep} where id=#{id}")
    public void setProviderStep(int id,int providerStep);

    @Update("update business set ${index}=#{path} where id=#{id}")
    public int updateFileByStep(String path,String index,int id);

    @Update("update business set sell_evaluation=#{assessment},sell_evaluation_tag=1 where id=#{id}")
    public int s_assessment(int id ,String assessment);

    @Update("update business set buy_evaluation=#{assessment},buy_evaluation_tag=1 where id=#{id}")
    public int b_assessment(int id ,String assessment);


    @Update("update business set p_progress=#{p_id} where id=#{business_id}")
    public int setPProgressID(int p_id,int business_id);

    @Update("update business set d_progress=#{d_id} where id=#{business_id}")
    public int setDProgressID(int d_id,int business_id);

    @Select("select * from business where buy_evaluation_tag=1 and sell_evaluation_tag=1 and platform_evaluation_tag!=1")
    public List<Business> adminGetBusinessToAsset();

    @Update("update business set platform_evaluation=#{comment},platform_evaluation_tag=1 where id=#{id}")
    public int addLastComment(int id,String comment);

    @Select("select * from business where platform_evaluation_tag=1")
    public List<Business> getAllDoneBusiness();

    @Select("select * from business where (buyer=#{username} or seller=#{username}) and platform_evaluation_tag=1 ")
    public List<Business> getDoneBusinessByUsername(String username);
}
