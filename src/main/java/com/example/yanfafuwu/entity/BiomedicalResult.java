package com.example.yanfafuwu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BiomedicalResult {
    private Integer id;
    private String type;
    private String name;
    private String contact;
    private String phone;
    private String provider;
    private String fee;
    private String des;
    private String guarantee;
    private String characteristic;
    private String deliverable;
    private String demand;
    private String period;
    private String publishDate;
    private String isApproval;
    private List<String> discovery=new ArrayList<>();
    private List<String> preclinical=new ArrayList<>();
    private List<String> clinical=new ArrayList<>();
    private List<String> examine=new ArrayList<>();
    private List<String> authentication=new ArrayList<>();
    private String achievement;
    private List<String> business=new ArrayList<>();
}
