package com.example.media.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@TableName("annotations")
@EqualsAndHashCode(callSuper = true)
public class Annotation extends BaseEntity {
    @TableField("media_id")
    private Long mediaId;
    
    private String name;
    private String description;
    private String type;
    private String coordinates;
} 