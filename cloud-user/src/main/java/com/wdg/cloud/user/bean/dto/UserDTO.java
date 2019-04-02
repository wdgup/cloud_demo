package com.wdg.cloud.user.bean.dto;

import lombok.Builder;
import lombok.Data;

/**
 *@Author: daogang.wang@baozun.com
 *@Data:2019/4/2、11:37
 **/
@Data
@Builder
public class UserDTO {
    private Integer id;
    private String email;
    private String password;
    private String username;
}
