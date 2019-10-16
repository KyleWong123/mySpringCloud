package com.example.microserviceprovideruser.model;

import lombok.Data;

/**
 * @Author: Kyle Wong
 * @Date: 2019/10/9 14:31
 * @Version 1.0
 */
@Data
public class User {
    private Integer id;
    private String account;
    private String username;
    private Double balance;
    private Integer age;
}
