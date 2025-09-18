package com.springboot.app.controllers;

import com.springboot.app.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
public class UserController {

    @GetMapping("details")
    public String details(Model model) {
        User user = new User("Felipe", "Silva");
        model.addAttribute("title", "Hola Mundo Spring Boot con Thymeleaf");
        model.addAttribute("user", user);
        user.setEmail("felipe@gmail.com");

    return "details";
    }

//        @GetMapping("details")
//        public String details(Map<String, Object> model) {
//                model.put("title", "Hola Mundo Spring Boot con Thymeleaf");
//                model.put("name", "Felipe");
//                model.put("lastname", "Silva");
//            return "details";
//        }

    @GetMapping("/list")
    public String list(ModelMap model){
        List<User> users = Arrays.asList(
                new User("Felipe", "Silva"),
                new User("John", "Doe", "jonh@gmail.com"),
                new User("Jane", "Doe", "jane@gmail.com"),
                new User("Mary", "Smith"));

        model.addAttribute("users", users);
        model.addAttribute("title", "Lista de Usuarios");

        return "list";
    }


}
