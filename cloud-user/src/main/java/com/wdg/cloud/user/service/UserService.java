package com.wdg.cloud.user.service;

import com.wdg.cloud.user.bean.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author WDG
 * @date 2019-2-17
 * 用户服务
 */

@FeignClient(name="user")
public interface UserService {

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    // User findUserById(int id);

     @RequestMapping(value = "/getUserList",method = RequestMethod.GET)
     List<UserDTO> userList();
}
