package com.example.springconditionalbeans;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnExpression(
            "'${application.mode}'.equals('cloud')"
    )
    public FileService cloudFileService() {
        return new CloudFileServiceImpl();
    }

    @Bean
    @ConditionalOnProperty(
            value="application.mode",
            havingValue = "on-prem",
            matchIfMissing = true)
    public FileService onPremFileService() {
        return new OnPremFileServiceImpl();
    }
}

