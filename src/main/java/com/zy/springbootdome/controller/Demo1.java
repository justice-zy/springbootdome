package com.zy.springbootdome.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Demo1")
public class Demo1 {

    @RequestMapping("/test1")
    public String test1(){
        System.out.println("test1");
        return "zy";
    }

}
