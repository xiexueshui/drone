package com.example.media.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@TableName("videos")
@EqualsAndHashCode(callSuper = true)
public class Video extends BaseEntity {
    private Integer width;
    private Integer height;
    private String format;
    
    @TableField("file_size")
    private Long fileSize;
    private Integer duration;
    private String codec;
} 