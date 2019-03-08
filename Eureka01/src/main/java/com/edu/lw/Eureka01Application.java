package com.edu.lw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName AppConfig
 * @Description
 * @Author lw
 * @Date 2019/3/7 0007
 * @Version V1.0.0
 */
@SpringBootApplication
@EnableEurekaServer                      //打开这个Eureka的这个服务
public class Eureka01Application {
    public static void main(String[] args){
        SpringApplication.run(Eureka01Application.class,args);
        System.out.println("Eureka服务启动完成");
    }
}
