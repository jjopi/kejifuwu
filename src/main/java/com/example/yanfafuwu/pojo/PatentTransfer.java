package com.example.yanfafuwu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatentTransfer {
    private Integer id;
    private String name;
    private String status;
    private String type;
    private String area;
    private String validity;
    private String origin;
    private String patentNumber;
    private String appliNumber;
    private String publicNumber;
    private String fileurl;
    private String contact;
    private String phone;
    private String provider;
    private String fee;
    private String isApproval;
    private String pType;
    private String des;
    private String inventor;
    private String applicant;
    private String majorSort;
    private String agency;
    private String agent;
}
