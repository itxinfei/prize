package com.pangzhao.prize;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 调度模块job
 */
@SpringBootApplication
//@EnableAutoConfiguration
@EnableDiscoveryClient
@MapperScan("com.pangzhao.prize.commons.db.mapper")
public class Job {
    public static void main(String[] args) {
        SpringApplication.run(Job.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
