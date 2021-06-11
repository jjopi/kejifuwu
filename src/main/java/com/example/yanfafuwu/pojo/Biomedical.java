package com.example.yanfafuwu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Biomedical {

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
    private String discovery;
    private String preclinical;
    private String clinical;
    private String examine;
    private String authentication;
    private String achievement;
    private String business;
}
