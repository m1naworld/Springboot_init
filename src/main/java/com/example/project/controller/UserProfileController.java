package com.example.project.controller;

import com.example.project.mapper.UserProfileMapper;
import com.example.project.model.UserProfile;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserProfileController {

    private UserProfileMapper mapper;

    public UserProfileController(UserProfileMapper mapper){
        this.mapper = mapper;
    }

    @GetMapping("/user/{id}")
    public UserProfile getUserProfile(@PathVariable("id") String id){
        return mapper.getUserProfile(id);
    }

    @GetMapping("/user/all")
    public List<UserProfile> getUserProfileList() {
        return mapper.getUserProfileList();
    }

    @PostMapping("/user/{id}")
    public int postUserProfile(@PathVariable("id") String id, @RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("address") String address){
        return mapper.insertUserProfile(id, name, phone, address);
    }

    @PutMapping("/user/{id}")
    public int putUserProfile(@PathVariable("id") String id, @RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("address") String address){
        return mapper.updateUserProfile(id, name, phone, address);
    }

    @DeleteMapping("/user/{id}")
    public int deleteUserProfile(@PathVariable("id") String id){
        return mapper.deleteUserProfile(id);
    }


}
