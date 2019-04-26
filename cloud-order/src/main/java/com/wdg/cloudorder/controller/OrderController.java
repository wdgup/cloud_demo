package com.wdg.cloudorder.controller;

import com.alibaba.fastjson.JSONObject;
import com.wdg.cloudorder.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


/**
 * @author WDG
 * @date 2019-4-2
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private UserClient userClient;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/createOrder/{userId}")
    public ResponseEntity createOrder(@PathVariable(name = "userId") Integer userId){
        JSONObject user = userClient.findUser(userId);
        System.out.println(user);
        return ResponseEntity.ok(user);
    }

    @GetMapping(value = "/createOrder")
    public ResponseEntity createOrderByRestTemplate(@RequestParam(name = "userId") Integer userId){
        ResponseEntity<JSONObject> result = restTemplate.getForEntity("http://localhost:9001/user/" + userId, JSONObject.class);
        System.out.println(result.getBody());
        return ResponseEntity.ok(result.getBody());
    }
}
