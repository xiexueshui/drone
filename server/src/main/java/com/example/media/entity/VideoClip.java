package com.example.media.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class VideoClip extends BaseEntity {
    private Long videoId;
    private String filePath;
    private Integer startTime;
    private Integer endTime;
    private String description;
} 