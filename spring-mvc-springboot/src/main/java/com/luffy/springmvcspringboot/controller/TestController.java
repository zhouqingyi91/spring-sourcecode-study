package com.luffy.springmvcspringboot.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author: zqy
 * @date: 2020-07-29 08:17
 **/
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("hello")
    public String getHello(@RequestParam("hey") Integer age) {
        return "Hello world " + "age: " + age;
    }

    @PostMapping("hello")
    public String postHello(String name) {
        return "Hello world " + "name: " + name;
    }

}
