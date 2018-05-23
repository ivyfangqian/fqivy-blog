package com.fqivy.spring.boot.blog.fqivyblog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: fqivy-blog
 * @description: 用户主页空间控制器
 * @author: fqivy
 * @create: 2018-05-23 17:29
 */
@RestController
@RequestMapping("/u")
public class UserspaceController {

    /** 
    * @Description: 
    * @Param: username 用户名 
    * @return:  
    * @Author: fqivy 
    * @Date: 5/23/2018 
    */ 
    @GetMapping("/{username}")
    public String userSpace(@PathVariable("username") String username) {
        return "u";
    }
}
