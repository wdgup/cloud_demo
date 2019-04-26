package com.wdg.cloud.user.controller;

import com.wdg.cloud.user.bean.User;
import com.wdg.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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
        System.out.println("---------findUser---------"+System.currentTimeMillis());
        return userService.findUserById(id);
    }

    @PutMapping(value = "/creatUser")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity.ok(userService.createUser(user));
    }


}
