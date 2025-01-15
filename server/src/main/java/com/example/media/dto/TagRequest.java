package com.example.media.dto;

import lombok.Data;

@Data
public class TagRequest {
    private Long mediaId;
    private String tagName;
}