package com.edu.lw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName a
 * @Description
 * @Author lw
 * @Date 2019/3/7 0007
 * @Version V1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
public class AppConfig {

    public static void main(String[] args){
        SpringApplication.run(AppConfig.class,args);
    }

}
