/*
package com.wdg.cloud.user.controller;

import com.wdg.cloud.user.bean.User;
import com.wdg.cloud.user.bean.dto.UserDTO;
import com.wdg.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

*/
/**
 * @author WDG
 * @date 2019-2-17
 *//*

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User findUser(@PathVariable Integer id){
        return userService.findUserById(id);
    }

    @GetMapping("/users")
    public List<UserDTO> userList(){
        List<UserDTO> userDTOS = userService.userList();
        return userDTOS;
    }
}
*/
