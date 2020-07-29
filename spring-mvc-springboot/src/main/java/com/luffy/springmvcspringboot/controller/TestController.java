package com.luffy.springmvcspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zqy
 * @date: 2020-07-29 08:17
 **/
@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("hello")
    public String hello() {
        return "Hello world";
    }
}
