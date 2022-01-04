package com.example.demo42.util;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class RedisUtil {
    @Resource
    private RedisTemplate<String,Object> redisTemplate;
    public boolean set(String key,Object object)
    {
        ValueOperations<String,Object> valueOperations=redisTemplate.opsForValue();
        valueOperations.set(key,object);
        return true;
    }
    public Object get(String key)
    {
        ValueOperations<String,Object> valueOperations=redisTemplate.opsForValue();
        return valueOperations.get(key);
    }

}
