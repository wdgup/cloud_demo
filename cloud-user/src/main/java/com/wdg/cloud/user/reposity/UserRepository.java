package com.wdg.cloud.user.reposity;


import com.wdg.cloud.user.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author WDG
 * @date 2019-2-17
 */
public interface UserRepository extends JpaRepository<User,Integer> {

}
