package com.example.media.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.media.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    
    /**
     * 根据用户名查询用户
     * @param username 用户名
     * @return 用户信息
     */

} 