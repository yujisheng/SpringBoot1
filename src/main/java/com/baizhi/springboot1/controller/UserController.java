package com.baizhi.springboot1.controller;

import com.baizhi.springboot1.entity.User;
import com.baizhi.springboot1.servic.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getAll")
    public String getAll(Map map){
        List<User> userList = userService.getAll();
        for (User user : userList) {
            System.out.println("user = " + user);
        }
        map.put("users",userList);
        return "index";
    }
}
