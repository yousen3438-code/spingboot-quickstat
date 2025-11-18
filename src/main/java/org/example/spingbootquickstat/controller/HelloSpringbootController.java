package org.example.spingbootquickstat.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringbootController {
    @RequestMapping("/springboot/hello")
    public String hello() {
        return "Hello springboot3";
    }
}
