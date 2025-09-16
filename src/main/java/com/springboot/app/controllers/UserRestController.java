package com.springboot.app.controllers;

import com.springboot.app.models.User;
import com.springboot.app.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")
public class UserRestController {

//    @RequestMapping(path="/details", method = requestMethod.GET) // otra forma de hacerlo
//    @GetMapping("/details")
//    public Map<String, Object> details() {
//        User user = new User("Felipe", "Silva");
//        Map<String, Object> body = new HashMap<>();
//
//        body.put("title", "Hola Mundo Spring Boot con Thymeleaf");
//        body.put("user", user);
//        return body;
//    }

    @GetMapping(path = "/details-dto")
    public UserDto details() {
        UserDto userDto = new UserDto();
        User user = new User("Felipe", "Silva");

        userDto.setTitle("Hola Mundo Spring Boot con Thymeleaf");
        userDto.setUser(user);

        return userDto;
    }

    @GetMapping(path = "/list")
    public List<User> listUsers() {
        User user1 = new User("Jhon", "Connor");
        User user2 = new User("Jhon", "Rambo");
        User user3 = new User("Felipe", "Silva");

        List<User> users = Arrays.asList(user1, user2, user3);
//        List<User> users = new ArrayList<>();
//        users.add(user1);
//        users.add(user2);
//        users.add(user3);

        return users;
    }

}
