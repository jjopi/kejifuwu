package com.example.yanfafuwu.util;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;

public class StringToList {

    public static List<String> stringtolist(String s){
        return Arrays.asList(s.split(","));
    }
}
