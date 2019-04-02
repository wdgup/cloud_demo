package com.wdg.cloud.user.controller;

import com.wdg.cloud.user.bean.User;
import com.wdg.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WDG
 * @date 2019-2-17
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User findUser(@PathVariable(name = "id") Integer id){
        return userService.findUserById(id);
    }
}
