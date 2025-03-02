package org.example;

import org.example.service.LibraryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan("org.example")
public class ProjectConfig {

    @Bean
    public SingletonEagerBean eagerBean() {
        return new SingletonEagerBean();
    }

    @Bean
    @Lazy
    public SingletonLazyBean lazyBean() {
        return new SingletonLazyBean();
    }
}