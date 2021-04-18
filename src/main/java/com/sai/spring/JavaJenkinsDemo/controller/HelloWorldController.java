package com.sai.spring.JavaJenkinsDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String sayHello(){
        return "Welcome to Java Jenkins Docker Integration";
    }

    @GetMapping("/docker")
    public String addDocker(){
        return "DockerFile is Added";
    }
    // Java-Jenkins-Demo
}
