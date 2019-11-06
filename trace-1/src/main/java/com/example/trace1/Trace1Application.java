package com.example.trace1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 启动类
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class Trace1Application {

    public static void main(String[] args) {
        SpringApplication.run(Trace1Application.class, args);
    }

}
