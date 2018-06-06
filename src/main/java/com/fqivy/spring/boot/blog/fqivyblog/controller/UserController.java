package com.fqivy.spring.boot.blog.fqivyblog.controller;

import com.fqivy.spring.boot.blog.fqivyblog.domain.User;
import com.fqivy.spring.boot.blog.fqivyblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 查询所有用户
     *
     * @return
     */
    @GetMapping
    public ModelAndView list(@RequestParam(value = "async", required = false) boolean async,
                             @RequestParam(value = "pageIndex", required = false, defaultValue = "0") int pageIndex,
                             @RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize,
                             @RequestParam(value = "username", required = false, defaultValue = "") String username,
                             Model model) {

        //查询得到用户信息，存入到page对象中
        Pageable pageable = new PageRequest(pageIndex, pageSize);
        Page<User> page = userService.getUsersByUsername(username, pageable);
        List<User> userList = page.getContent();

        model.addAttribute("page", page);
        model.addAttribute("userList", userList);

        return new ModelAndView(async == true ? "users/list :: #mainContainerReplace" : "users/list", "userModel", model);
    }
}
