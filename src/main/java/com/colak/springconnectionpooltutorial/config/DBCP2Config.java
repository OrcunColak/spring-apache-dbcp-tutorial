package com.colak.springconnectionpooltutorial.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBCP2Config {

    @Bean
    public BasicDataSource dataSource(DataSourceProperties properties) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(properties.getUrl());
        dataSource.setUsername(properties.getUsername());
        dataSource.setPassword(properties.getPassword());
        dataSource.setMaxTotal(15);
        dataSource.setMaxIdle(10);
        dataSource.setMinIdle(5);
        return dataSource;
    }
}
