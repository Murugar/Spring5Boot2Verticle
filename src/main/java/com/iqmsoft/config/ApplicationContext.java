package com.iqmsoft.config;

import io.vertx.core.Vertx;
import io.vertx.core.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.iqmsoft")
class ApplicationContext {

    @Bean
    Vertx vertx() {
        return Vertx.vertx();
    }

    @Bean
    EventBus eventBus() {
        return vertx().eventBus();
    }
}
