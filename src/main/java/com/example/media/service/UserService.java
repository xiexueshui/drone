package com.example.media.service;

import com.example.media.common.Result;
import com.example.media.dto.LoginDTO;
import com.example.media.entity.User;
import com.example.media.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private JwtUtil jwtUtil;

    public Result<Map<String, String>> login(LoginDTO loginDTO) {
        // TODO: 实际项目中需要查询数据库验证用户名密码
        if ("admin".equals(loginDTO.getUsername()) 
            && "123456".equals(loginDTO.getPassword())) {
            
            String token = jwtUtil.generateToken(loginDTO.getUsername());
            Map<String, String> map = new HashMap<>();
            map.put("token", token);
            return Result.success(map);
        }
        return Result.error("用户名或密码错误");
    }

    public Result<User> getUserInfo() {
        // TODO: 实际项目中需要根据token获取用户信息
        User user = new User();
        user.setUsername("admin");
        user.setAvatar("https://example.com/avatar.jpg");
        return Result.success(user);
    }

    public Result<?> logout() {
        return Result.success(null);
    }
} 