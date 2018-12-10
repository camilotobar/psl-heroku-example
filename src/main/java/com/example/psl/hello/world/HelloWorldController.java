package com.example.psl.hello.world;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${HELLO:Hello}")
    private String greeting;

    @Autowired
    private HelloWorldService service;

    @GetMapping("/hello/{name}")
    public HelloWorldDTO HelloWorld(@PathVariable("name") String name){
        return service.getDTOWithTRM(greeting +" "+name);
    }
}
