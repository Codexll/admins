package com.example.demo42.server.impl;

import com.example.demo42.Mapper.UserMapper;
import com.example.demo42.Mapper.UserMappers;
import com.example.demo42.entity.User;
import com.example.demo42.server.UserServer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserServerImpl implements UserServer {
    @Resource
    private UserMappers userMappers;
//    @Override
//    public User byid(Long id) {
//             return userMappers.byid(id);
//    }

    @Override
    public List<User> all() {
        return userMappers.all();
    }
}
