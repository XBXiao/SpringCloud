package com.edu.lw.controll;

import com.edu.lw.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName d
 * @Description
 * @Author lw
 * @Date 2019/3/7 0007
 * @Version V1.0.0
 */
@RestController
public class UserControll {
    /**
     * 对外提供服务的数据
     * @return
     */
    @GetMapping("/getUserInfo")
    public Object getUserInfo(){
        User user = new User(1, "小波波", "1111");
        return user;
    }

}
