package com.example.media.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@TableName("tags")
@EqualsAndHashCode(callSuper = true)
public class Tag extends BaseEntity {
    private String name;
    
    @TableField("parent_id")
    private Long parentId;
} 