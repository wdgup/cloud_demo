package com.wdg.cloud.user.service.impl;/**
 * @Author: daogang.wang@baozun.com
 * @Date: 2019/4/2 15:39
 * @Description:
 */

import com.wdg.cloud.user.bean.User;
import com.wdg.cloud.user.bean.dto.UserDTO;
import com.wdg.cloud.user.reposity.UserReposity;
import com.wdg.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 *@Author: daogang.wang@baozun.com
 *@Data:2019/4/2、15:39
 **/
@Service
public class UserServiceImpl implements UserService {
   /* @Autowired
    private UserReposity userReposity;


    @Override
    public User findUserById(int id) {
        return userReposity.findById(id).get();
    }*/

    @Override
    public List<UserDTO> userList() {
        List<UserDTO> users = new ArrayList<>();
        users.add(UserDTO.builder().id(10001).email("111@qq.com").password("gtgt").username("张三").build());
        users.add(UserDTO.builder().id(10002).email("2222@qq.com").password("aaaa").username("李四").build());
        return  users;
    }
}
