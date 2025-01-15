package com.example.media.entity;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String salt;     // 密码盐值
    private String avatar;   // 头像
    private String email;    // 邮箱
    private Integer status;  // 状态 0:禁用 1:正常
    private Long createTime; // 创建时间
    private Long updateTime; // 更新时间
} 