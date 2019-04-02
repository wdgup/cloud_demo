package com.wdg.cloud;/**
 * @Author: daogang.wang@baozun.com
 * @Date: 2019/4/2 15:37
 * @Description:
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *@Author: daogang.wang@baozun.com
 *@Data:2019/4/2、15:37
 **/
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients
@EnableDiscoveryClient
public class ManagerRunApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagerRunApplication.class,args);
    }
}
