package com.example.yanfafuwu.util;

import org.apache.commons.lang.StringUtils;

import java.util.List;

public class ListToStringUtil {

    public static String transfer(List<String> list){
       return StringUtils.join(list.toArray(),",");
    }
}
