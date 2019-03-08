package com.edu.lw.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("shopping-user-server")
public interface UserService {
    @RequestMapping(value = "/getUserInfo",method = RequestMethod.GET)
    Object getUserInfo();
}
