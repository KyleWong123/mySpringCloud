package com.example.microserviceprovideruser.controller;

import com.example.microserviceprovideruser.model.User;
import com.example.microserviceprovideruser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Kyle Wong
 * @Date: 2019/10/9 14:45
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/findall")
    public List<User> userFindAll(){
        List<User> user = userService.findAll();
        return user;
    }

    @GetMapping("/findbyname")
    public List<User> userFindByName(String username){
        System.out.println(username);
        return userService.findByName(username);
    }
}
