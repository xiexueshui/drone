package com.example.media.dto;

import lombok.Data;

@Data
public class VideoCutRequest {
    private Long videoId;
    private Integer startTime;
    private Integer endTime;
} 