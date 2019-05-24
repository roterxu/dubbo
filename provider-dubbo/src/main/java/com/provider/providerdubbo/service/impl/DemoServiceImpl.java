package com.provider.providerdubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubboapi.service.DemoService;

@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }

}
