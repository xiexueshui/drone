package com.example.media.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@TableName("video_clips")
@EqualsAndHashCode(callSuper = true)
public class VideoClip extends BaseEntity {
    @TableField("video_id")
    private Long videoId;
    
    @TableField("file_path")
    private String filePath;
    
    @TableField("start_time")
    private Integer startTime;
    
    @TableField("end_time")
    private Integer endTime;
    
    private String description;
} 