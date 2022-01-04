package com.example.demo42.Mapper;

import com.example.demo42.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.XMLFormatter;

@Repository
public interface UserMappers {
//    使用注解得方式代替Mapper.XML文件
    @Select("select * from user")
    public List<User> all();
}
