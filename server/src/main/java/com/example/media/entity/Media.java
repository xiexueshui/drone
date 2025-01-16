package com.example.media.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.LocalDateTime;

@Data
@TableName("media")
@EqualsAndHashCode(callSuper = true)
public class Media extends BaseEntity {
    @TableField("file_name")
    private String fileName;
    
    @TableField("file_path")
    private String filePath;
    
    @TableField("media_type")
    private String mediaType;
    
    @TableField("upload_time")
    private LocalDateTime uploadTime;
} 