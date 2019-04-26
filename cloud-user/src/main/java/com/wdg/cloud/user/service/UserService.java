package com.wdg.cloud.user.service;

import com.wdg.cloud.user.bean.User;
import com.wdg.cloud.user.reposity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author WDG
 * @date 2019-2-17
 * 用户服务
 */
@Service

public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    public User findUserById(int id){
        return userRepository.findById(id).get();
    }

    @Transactional
    public User createUser(User user) {
         return  userRepository.save(user);
    }
}
