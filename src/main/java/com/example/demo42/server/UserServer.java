package com.example.demo42.server;

import com.example.demo42.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserServer {
//    public User byid(Long id);
    public List<User> all();
}
