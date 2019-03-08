package com.edu.lw.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName AppConfig
 * @Description
 * @Author lw
 * @Date 2019/3/8 0008
 * @Version V1.0.0
 */
@SpringBootConfiguration
@ComponentScan("com.edu.lw")
public class AppConfig {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        RestTemplate restTemplate=new RestTemplate();
        return restTemplate;
    }

    @Bean
    public IRule ribbonRule() {
//        return new RandomRule();//这里配置策略，和配置文件对应
        return new RoundRobinRule();
    }
}

