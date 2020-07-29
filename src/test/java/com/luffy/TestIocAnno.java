package com.luffy;

import com.luffy.config.AnnoConfiguration;
import com.luffy.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: zqy
 * @date: 2020-07-18 04:07
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AnnoConfiguration.class)
public class TestIocAnno {

    @Autowired
    private TestService testService;

    // 测试能不能启动成功
    @Test
    public void testStartUp() {
        testService.doService();
    }
}
