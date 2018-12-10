package com.example.psl.hello.world;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${HELLO:Hello}")
    private String greeting;

    @GetMapping("/hello")
    public String HelloWorld(){
        return greeting + " World";
    }
}
