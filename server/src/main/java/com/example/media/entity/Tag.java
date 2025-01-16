package com.example.media.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Tag extends BaseEntity {
    private String name;
    private Long parentId;
} 