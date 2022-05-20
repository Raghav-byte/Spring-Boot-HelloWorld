package com.example.HelloWorld.HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldServices helloWorldServices;

    @GetMapping("/hi")
    public String sayHello() {
        return HelloWorldServices.sayHello();
    }
    

}
