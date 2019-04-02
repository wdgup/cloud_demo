package com.wdg.cloudorder.controller;

import com.wdg.cloudorder.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author WDG
 * @date 2019-4-2
 */
@RestController
public class OrderController {
    @Autowired
    private UserClient userClient;

    @RequestMapping(value = "/createOrder" , method = RequestMethod.GET)
    public Map createOrder(Integer userId){
        System.out.println(userClient.findUser(userId));
        Map map = new HashMap();
        map.put("user",userClient.findUser(userId));
        return map;
    }
}
