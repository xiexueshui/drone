package com.example.media.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@TableName("users")
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {
    private String username;
    private String password;
    private String email;
    
    @TableField("is_admin")
    private Boolean isAdmin;
} 