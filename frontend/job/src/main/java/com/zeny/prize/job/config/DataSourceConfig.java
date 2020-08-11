package com.zeny.prize.job.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 描述
 */
@Configuration
public class DataSourceConfig {

    @Bean("datasource")
    @ConfigurationProperties("spring.datasource")
    public DataSource dataSourceTow(){
        return DruidDataSourceBuilder.create().build();
    }
}