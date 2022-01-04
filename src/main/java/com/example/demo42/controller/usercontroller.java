package com.example.demo42.controller;


import com.example.demo42.Mapper.UserMappers;
import com.example.demo42.entity.User;
import com.example.demo42.server.UserServer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/login")
public class usercontroller {
    @Resource
    private UserServer userServer;
    @Resource
    private UserMappers userMappers;
//    @RequestMapping("bis")
//    public String show(@RequestParam("id") Long id)
//    {
//        return userServer.byid(id).getName();
//    }
//    @RequestMapping("/user")
//public String shows(@RequestParam(value = "id",defaultValue = "1",required = false) Long id,Model model)
//{
//    User user=userServer.byid(id);
//    model.addAttribute("user",user);
//    return "aa";
//}
@RequestMapping("/all")
public String alls(Model model)
{
    List<User> list=userMappers.all();
    model.addAttribute("list",list);
    return "bb";
}
}
