package com.edu.lw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @ClassName CustomerConfig
 * @Description
 * @Author lw
 * @Date 2019/3/7 0007
 * @Version V1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient           //使能调用端的服务的发现
@EnableFeignClients              //当前是一个调用端
public class ServerComsumerApplication {
    public static void main(String[] args){
        SpringApplication.run(ServerComsumerApplication.class,args);
        System.out.println("服务的发现成功了....");

    }
}
