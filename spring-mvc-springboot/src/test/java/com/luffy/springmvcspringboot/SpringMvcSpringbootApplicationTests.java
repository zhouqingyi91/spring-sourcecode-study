package com.luffy.springmvcspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringMvcSpringbootApplicationTests {

    @Autowired
    private ApplicationContext context;

    @Test
    void contextLoads() {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println(beanDefinitionNames.length);
        for (String beanDefinitionName : beanDefinitionNames) {
            if (beanDefinitionName.equals("student")) {
                System.out.println(beanDefinitionName);
            }
        }

    }

}
