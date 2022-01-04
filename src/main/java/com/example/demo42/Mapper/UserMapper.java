package com.example.demo42.Mapper;

import com.example.demo42.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@Mapper
public interface UserMapper {
    public User byid(@Param("id") Long id);
    public List<User> all();
}
