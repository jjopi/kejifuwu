package com.example.yanfafuwu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserServiceInfo {
    private String serviceName;
    private String serviceType;
    private String publishDate;
}
