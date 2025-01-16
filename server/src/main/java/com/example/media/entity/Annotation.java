package com.example.media.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Annotation extends BaseEntity {
    private Long mediaId;
    private String name;
    private String description;
    private String type;
    private String coordinates;
} 