package com.example.yanfafuwu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Enterverify {
    private Integer id;
    private String username;
    private String name;
    private String identityId;
    private String img;
    private String represent;
    private int ok;
    private String uuid;
}
