package com.wdg.cloud.user.config;/**
 * @Author: daogang.wang@baozun.com
 * @Date: 2019/4/2 15:51
 * @Description:
 */

import org.springframework.cloud.openfeign.FeignContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *@Author: daogang.wang@baozun.com
 *@Data:2019/4/2、15:51
 **/
@Configuration
public class GlobalConfig {

    @Bean
    public FeignContext feignContext(){
        return  new FeignContext();
    }
}
