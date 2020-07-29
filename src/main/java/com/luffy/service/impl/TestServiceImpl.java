package com.luffy.service.impl;

import com.luffy.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author: zqy
 * @date: 2020-07-19 06:59
 **/
@Service
public class TestServiceImpl implements TestService {
    public void doService() {
        System.out.println("doing service....");
    }

    public TestServiceImpl() {
        System.out.println("TestServiceImpl 被创建");
    }
}
