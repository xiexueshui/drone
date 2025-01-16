package com.example.media.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Video extends BaseEntity {
    private Integer width;
    private Integer height;
    private String format;
    private Long fileSize;
    private Integer duration;
    private String codec;
} 