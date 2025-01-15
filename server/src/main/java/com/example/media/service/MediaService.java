package com.example.media.service;

import com.example.media.dto.TagRequest;
import com.example.media.dto.VideoCutRequest;
import org.springframework.web.multipart.MultipartFile;

public interface MediaService {
    String uploadToMinio(MultipartFile file);
    void saveTag(TagRequest request);
    String cutVideo(VideoCutRequest request);
} 