package com.example.media.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
public class Media extends BaseEntity {
    private String fileName;
    private String filePath;
    private String mediaType;
    private LocalDateTime uploadTime;
} 