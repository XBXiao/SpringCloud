package com.edu.lw.controll;

import com.edu.lw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName s
 * @Description
 * @Author lw
 * @Date 2019/3/7 0007
 * @Version V1.0.0
 */
@RestController
public class PinDaoControll {
    @Autowired
    private UserService userService=null;
    @GetMapping("/getObject")
    public Object getObject(){
        System.out.println("这里是频道的Controll");
        return userService.getUserInfo();
    }
}
