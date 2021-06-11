package com.example.yanfafuwu.mapper;

import com.example.yanfafuwu.pojo.Demand;
import com.example.yanfafuwu.pojo.Service;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ServiceMapper {
    @Insert("insert into service(username,type,name,provider,period,contact,phone,fee,deliverable,accept_guarantee,mode_of_delivery,des,ok) values " +
            "(#{username},#{type},#{name},#{provider},#{period},#{contact},#{phone},#{fee},#{deliverable},#{acceptGuarantee},#{modeOfDelivery},#{des},#{ok})")
    public int insert(Service service);


    @Select(" select * from service where username=#{username}")
    public List<Service> getServicesByUsername(String username);

    @Delete("delete from service where id=#{id}")
    public int deleteById(Integer id);

    @Select("select * from service where username=#{username} and ok=#{ok}")
    List<Service> getAllverifiedServiceByUsername(String username, int ok);

    @Select("select * from service")
    List<Service> allServices();

    @Select("select * from service where id=#{id}")
    public Service serviceInformationById(int id);

    @Select("select * from service where ok=0")
    public List<Service> getAllServicesZero();

    @Update("update service set ok=1 where id=#{id}")
    public int passVerification(int id);
}
