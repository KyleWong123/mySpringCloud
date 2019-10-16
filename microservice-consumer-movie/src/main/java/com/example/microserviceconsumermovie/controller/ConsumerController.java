package com.example.microserviceconsumermovie.controller;

import com.example.microserviceconsumermovie.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: Kyle Wong
 * @Date: 2019/10/10 14:27
 * @Version 1.0
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/findall")
    public List<User> findAll(){
        List<User> userList = restTemplate.getForObject("http://localhost:8070/user/findall", List.class);
        return userList;
    }
}
