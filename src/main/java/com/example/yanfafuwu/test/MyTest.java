package com.example.yanfafuwu.test;

import org.apache.commons.lang.StringUtils;
import org.springframework.core.io.Resource;
import org.springframework.util.ClassUtils;
import org.springframework.util.ResourceUtils;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MyTest {
    public static void main(String[] args) throws IOException {
        String path = ClassUtils.getDefaultClassLoader().getResource("static/imgs/").getPath();
        System.out.println(path);
    }
}
