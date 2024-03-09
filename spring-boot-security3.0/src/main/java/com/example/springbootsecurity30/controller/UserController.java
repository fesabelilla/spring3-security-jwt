package com.example.springbootsecurity30.controller;

import com.example.springbootsecurity30.entity.UserInfo;
import com.example.springbootsecurity30.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserInfoService userInfoService;

    @PostMapping("/add")
    public void addNewUser(@RequestBody UserInfo userInfo){
        userInfoService.addUser(userInfo);
    }
}
