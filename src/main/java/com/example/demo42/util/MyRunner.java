package com.example.demo42.util;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class MyRunner implements CommandLineRunner {
    @Resource
    private RedisUtil redisUtil;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("项目启动");
      redisUtil.set("key2","蔡宇");
        System.out.println(redisUtil.get("key1"));
        System.out.println(redisUtil.get("key2"));
    }
}
