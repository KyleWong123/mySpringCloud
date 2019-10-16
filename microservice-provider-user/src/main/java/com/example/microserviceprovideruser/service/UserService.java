package com.example.microserviceprovideruser.service;

import com.example.microserviceprovideruser.mapper.UserMapper;
import com.example.microserviceprovideruser.model.User;

import java.util.List;

/**
 * @Author: Kyle Wong
 * @Date: 2019/10/9 14:43
 * @Version 1.0
 */
public interface UserService {
    List<User> findAll();
    List<User> findByName(String username);

}
