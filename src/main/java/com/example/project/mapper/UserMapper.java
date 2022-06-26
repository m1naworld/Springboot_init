package com.example.project.mapper;

import com.example.project.model.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM User WHERE id=#{id}")
    User getUser(@RequestBody String id);

    @Insert("INSERT INTO User VALUES(#{id}, #{name}, #{password})")
    User insertUser (@RequestParam String id, String name, String password);

}
