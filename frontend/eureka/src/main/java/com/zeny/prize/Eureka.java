package com.zeny.prize;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Eureka.class).run(args);
    }
}