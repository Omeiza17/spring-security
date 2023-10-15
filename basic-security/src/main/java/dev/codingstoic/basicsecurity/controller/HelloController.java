package dev.codingstoic.basicsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/user")
    public String helloUser() {
        return "Hello User!";
    }
    @GetMapping("/admin")
    public String helloAdmin() {
        return "Hello Admin!";
    }
}
