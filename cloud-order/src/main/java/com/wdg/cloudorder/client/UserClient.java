package com.wdg.cloudorder.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author WDG
 * @date 2019-4-2
 */
@FeignClient(name = "cloud-user")
@Component
public interface UserClient {

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    Object findUser(@PathVariable(name = "id") Integer id);
}
