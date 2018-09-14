package com.example.sericefeign.service;

import org.springframework.stereotype.Component;

@Component
public class HelloImpl implements IHello {
    @Override
    public String sayHiFromClientOne(String name) {
        return "Sorry "+name;
    }
}
