package com.luffy.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author: zqy
 * @date: 2020-07-19 10:25
 **/
@Aspect
@Component
public class TestAspectAnno {

    public TestAspectAnno() {
        System.out.println("aop aspect 被创建");
    }

    @Pointcut("execution(* com.luffy.*..*.*(..))")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void before() {
        System.out.println("aop before 被调用");
    }

    @After("pointcut()")
    public void after() {
        System.out.println("aop after 被调用");
    }
}
