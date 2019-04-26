package com.wdg.cloudorder.client;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author WDG
 * @date 2019-4-26
 */
@FeignClient(name = "cloud-user")
public interface UserClient {

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    JSONObject findUser(@PathVariable(name = "id") Integer id);
}
