package com.consumer.consumerdubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubboapi.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Reference(version = "${demo.service.version}")
    private DemoService demoService;

    @RequestMapping("/index")
    public Object index(String name) {
        return demoService.sayHello(name);
    }
}
