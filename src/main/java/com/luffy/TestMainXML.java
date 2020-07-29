package com.luffy;

import com.luffy.service.TestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: zqy
 * @date: 2020-07-19 08:46
 **/
public class TestMainXML {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-ioc.xml");

        TestService testService = (TestService) context.getBean("testService");
        testService.doService();
    }
}
