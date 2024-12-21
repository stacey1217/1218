package com.test.c1218.framework.config;

import com.test.c1218.framework.web.GlobalExceptionHandler;
import org.springframework.context.annotation.Bean;

public class WebAutoConfiguration {
    @Bean
    public GlobalExceptionHandler globalExceptionHandler() {
        return new GlobalExceptionHandler();
    }
}

