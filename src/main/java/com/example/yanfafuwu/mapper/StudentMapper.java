package com.example.yanfafuwu.mapper;

import com.example.yanfafuwu.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {

    @Select("select name from student")
    public List<Student> getAll();

}
