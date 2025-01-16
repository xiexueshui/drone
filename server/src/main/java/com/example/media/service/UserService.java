package com.example.media.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.media.common.Result;
import com.example.media.dto.LoginDTO;
import com.example.media.entity.User;
import com.example.media.mapper.UserMapper;
import com.example.media.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private JwtUtil jwtUtil;

    public Result<Map<String, Object>> login(LoginDTO loginDTO) {
        // 根据用户名查询用户
        User user = userMapper.selectOne(new LambdaQueryWrapper<User>().eq(User::getUsername, loginDTO.getUsername()));
        
        // 用户不存在
        if (user == null) {
            return Result.error("用户名或密码错误");
        }
        
        // Base64加密密码进行比对
        String encodedPassword = Base64.getEncoder().encodeToString(loginDTO.getPassword().getBytes());
        if (!encodedPassword.equals(user.getPassword())) {
            return Result.error("用户名或密码错误");
        }
        
        // 生成token
        String token = jwtUtil.generateToken(user.getUsername());
        
        // 构建返回数据
        Map<String, Object> map = new HashMap<>();
        map.put("token", token);
        
        // 返回用户信息(去除敏感字段)
        User userInfo = new User();
        userInfo.setId(user.getId());
        userInfo.setUsername(user.getUsername());
        userInfo.setEmail(user.getEmail());
        userInfo.setIsAdmin(user.getIsAdmin());
        map.put("user", userInfo);
        
        return Result.success(map);
    }

    public Result<User> getUserInfo() {
        // TODO: 实际项目中需要根据token获取用户信息
        User user = new User();
        user.setUsername("admin");
        return Result.success(user);
    }

    public Result<?> logout() {
        return Result.success(null);
    }
} 