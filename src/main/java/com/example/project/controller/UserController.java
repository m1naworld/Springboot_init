package com.example.project.controller;

import com.example.project.mapper.UserMapper;
import com.example.project.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    private UserMapper mapper;
    private User user;

    public UserController(UserMapper mapper){
        this.mapper = mapper;
    }

    @PostMapping("user/join")
    public User insertUser(@RequestBody String id, String name, String password, String passwordCheck){

        if(mapper.getUser(id) == null){
            System.out.println(mapper.getUser(id));
            if(password.equals(passwordCheck)){
                return mapper.insertUser(id, name, password);
            }
            else{return user;}

        }return user;
    }
}
