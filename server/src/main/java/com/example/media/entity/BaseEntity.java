package com.example.media.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public abstract class BaseEntity {
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long createdBy;
    private Long updatedBy;
} 