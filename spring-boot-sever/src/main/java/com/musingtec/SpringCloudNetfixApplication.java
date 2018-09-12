package com.musingtec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//注册Eureka服务的注解
@EnableEurekaServer
public class SpringCloudNetfixApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudNetfixApplication.class, args);
    }
}
