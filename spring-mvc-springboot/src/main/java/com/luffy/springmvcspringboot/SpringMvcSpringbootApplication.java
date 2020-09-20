package com.luffy.springmvcspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringMvcSpringbootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringMvcSpringbootApplication.class, args);
        String applicationName = context.getApplicationName();
        System.out.println(applicationName);
        System.out.println(context.getBeanDefinitionNames().length);
    }
}
