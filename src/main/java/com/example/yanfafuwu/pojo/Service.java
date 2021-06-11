package com.example.yanfafuwu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Service {
    private Integer id;
    private String username;
    private String type;
    private String name;
    private String provider;
    private String period;
    private String contact;
    private String phone;
    private String fee;
    private String deliverable;
    private String acceptGuarantee;
    private String modeOfDelivery;
    private int ok;
    private String des;
    private String publishDate;
}
