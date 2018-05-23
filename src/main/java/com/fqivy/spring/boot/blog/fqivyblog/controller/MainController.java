package com.fqivy.spring.boot.blog.fqivyblog.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    /**
     * @author fqivy
     * @date 201
     * @return
     */
    @GetMapping
    public String root() {
        return "redirect:/index";
    }

    /**
     * 进入首页
     * @return
     */
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    /**
     * 进入登录页面
     * @return
     */
    @GetMapping("login")
    public String login() {
        return "login";
    }

    /**
     * 登录失败页面
     * @param model
     * @return
     */
    @GetMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        model.addAttribute("errorMessage", "登录失败，用户名或者密码错误！");

        return "login-error";
    }

    /**
     * 进入注册页面
     * @return
     */
    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/search")
    public String search() {
        return "search";
    }
}
