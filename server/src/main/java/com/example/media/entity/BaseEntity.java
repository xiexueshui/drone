package com.example.media.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public abstract class BaseEntity {
    @TableId(type = IdType.AUTO)
    private Long id;
    
    @TableField("created_at")
    private LocalDateTime createdAt;
    
    @TableField("updated_at")
    private LocalDateTime updatedAt;
    
    @TableField("created_by")
    private Long createdBy;
    
    @TableField("updated_by")
    private Long updatedBy;
} 