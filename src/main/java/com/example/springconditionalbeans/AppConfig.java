package com.example.springconditionalbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public FileService fileService() {
        return new CloudFileServiceImpl();
    }

}

