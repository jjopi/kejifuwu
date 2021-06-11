package com.example.yanfafuwu;

import com.example.yanfafuwu.mapper.StudentMapper;
import com.example.yanfafuwu.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class YanfafuwuApplicationTests {

    @Resource
    StudentMapper studentMapper;

    @Test
    void contextLoads() {
        List<Student> all = studentMapper.getAll();
        System.out.println(all);

    }

}
