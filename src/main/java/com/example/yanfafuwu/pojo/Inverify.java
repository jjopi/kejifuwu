package com.example.yanfafuwu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Inverify {
    private Integer id;
    private String username;
    private String name;
    private String identityId;
    private String pimg;
    private String nimg;
    private String allimg;
    private int ok;
    private String uuid;
}
