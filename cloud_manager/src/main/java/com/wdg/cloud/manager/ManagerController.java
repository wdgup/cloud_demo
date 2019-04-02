package com.wdg.cloud.manager;/**
 * @Author: daogang.wang@baozun.com
 * @Date: 2019/4/2 15:23
 * @Description:
 */

import com.wdg.cloud.user.bean.dto.UserDTO;
import com.wdg.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *@Author: daogang.wang@baozun.com
 *@Data:2019/4/2、15:23
 **/
@RestController
public class ManagerController {

    @Autowired
    private UserService userService;
    @GetMapping(value = "/getUserList")
    public List<UserDTO> getUserList(){
        System.out.println(userService.getClass().getTypeName());
        return userService.userList();
    }

}
