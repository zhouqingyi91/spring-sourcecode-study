package com.luffy.config;

import com.luffy.entity.Student;
import com.luffy.entity.Teacher;
import org.springframework.context.annotation.*;

/**
 * @author: zqy
 * @date: 2020-07-19 06:53
 **/
@Configuration
@ComponentScan("com.luffy")
@EnableAspectJAutoProxy
@ImportResource
public class AnnoConfiguration {

    public AnnoConfiguration() {
        System.out.println("AnnoConfiguration 被创建");
    }

    @Bean
    public Student student() {
        System.out.println("@Bean student 方法被调用");
        return new Student();
    }

    @Bean
    public Teacher teacher() {
        System.out.println("@Bean teacher 方法被调用");
        Student student = student();
        System.out.println("在@Bean teacher方法里调用student() ---" + student);
        return new Teacher();
    }
}
