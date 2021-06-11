package com.example.yanfafuwu.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Demand {
    private Integer id;
    private String username;
    private String type;
    private String name;
    private String demander;
    private String publishDate;
    private String contact;
    private String phone;
    private String budget;
    private String des;
    private int ok;
}
