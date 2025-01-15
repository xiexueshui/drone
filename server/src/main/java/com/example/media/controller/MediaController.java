package com.example.media.controller;


import com.example.media.dto.TagRequest;
import com.example.media.dto.VideoCutRequest;
import com.example.media.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/media")
public class MediaController {
    
    @Autowired
    private MediaService mediaService;
    
    @PostMapping("/upload")
    public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile file) {
        String fileUrl = mediaService.uploadToMinio(file);
        return ResponseEntity.ok(fileUrl);
    }
    
    @PostMapping("/tag")
    public ResponseEntity<?> tagMedia(@RequestBody TagRequest request) {
        mediaService.saveTag(request);
        return ResponseEntity.ok().build();
    }
    
    @PostMapping("/video/cut")
    public ResponseEntity<?> cutVideo(@RequestBody VideoCutRequest request) {
        String newVideoUrl = mediaService.cutVideo(request);
        return ResponseEntity.ok(newVideoUrl);
    }
} 