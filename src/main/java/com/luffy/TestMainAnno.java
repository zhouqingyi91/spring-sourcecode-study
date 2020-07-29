package com.luffy;

import com.luffy.config.AnnoConfiguration;
import com.luffy.entity.Student;
import com.luffy.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: zqy
 * @date: 2020-07-19 07:23
 **/
public class TestMainAnno {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnoConfiguration.class);

        TestService testService = context.getBean(TestService.class);
        testService.doService();

        System.out.println("===================================================");

        Student student = context.getBean(Student.class);
        System.out.println(student);
//
//        System.out.println("===================================================");
//
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
//        }
    }
}
