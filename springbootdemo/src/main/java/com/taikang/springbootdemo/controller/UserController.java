package com.taikang.springbootdemo.controller;

import com.alibaba.fastjson.JSON;
import com.taikang.springbootdemo.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @RequestMapping("/user")
    public void checkUser(@Valid @RequestBody User user){

    }
}
