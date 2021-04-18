package com.imooc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LuoboGan
 * Date:2020/12/6
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Object Hello(){
        return "Hello World!";
    }

}
