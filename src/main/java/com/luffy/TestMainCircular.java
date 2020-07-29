package com.luffy;

import com.luffy.config.CircularConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: zqy
 * @date: 2020-07-23 09:18
 **/
public class TestMainCircular {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CircularConfiguration.class);

        System.out.println("============================");

        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
