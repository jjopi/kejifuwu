package com.example.yanfafuwu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Buy {
    private Integer id;
    private String username;
    private Integer demandId;
    private Integer serviceId;
    private Integer businessId;
    private Integer ok;
    private String name;
}

