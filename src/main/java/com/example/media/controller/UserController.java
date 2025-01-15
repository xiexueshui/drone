package com.example.media.controller;

import com.example.media.common.Result;
import com.example.media.dto.LoginDTO;
import com.example.media.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result<Map<String, String>> login(@Validated @RequestBody LoginDTO loginDTO) {
        return userService.login(loginDTO);
    }

    @GetMapping("/info")
    public Result<?> getUserInfo() {
        return userService.getUserInfo();
    }

    @PostMapping("/logout")
    public Result<?> logout() {
        return userService.logout();
    }
} 