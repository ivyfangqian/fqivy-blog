package com.fqivy.spring.boot.blog.fqivyblog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ModelAndView list(){
        return new ModelAndView("users/list");
    }
}
