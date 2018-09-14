package com.example.sericefeign.controller;

import com.example.sericefeign.service.IHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    IHello iHello;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHello(@RequestParam String name){
        return iHello.sayHiFromClientOne(name);
    }
}
