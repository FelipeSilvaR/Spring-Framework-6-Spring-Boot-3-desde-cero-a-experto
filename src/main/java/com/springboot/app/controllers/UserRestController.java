package com.springboot.app.controllers;

import com.springboot.app.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserRestController {

//  @RequestMapping(path="/details", method = requestMethod.GET)
    @GetMapping("/details")
    public Map<String, Object> details() {
        User user = new User("Felipe", "Silva");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Mundo Spring Boot con Thymeleaf");
        body.put("user", user);
        return body;
    }

}
