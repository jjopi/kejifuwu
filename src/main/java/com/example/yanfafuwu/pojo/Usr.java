package com.example.yanfafuwu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usr {

    private Integer id;
    private String username;
    private String passwd;
    private int isVerify;
    private String provider;
}
