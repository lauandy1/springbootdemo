package com.lau.bootdemo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：TODO
 * Author: yangzhichao
 * Date: 2021/1/5
 */

@RestController
@EnableAutoConfiguration
public class DomeController {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DomeController.class, args);
    }

}
