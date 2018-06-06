package com.fqivy.spring.boot.blog.fqivyblog.service;

import com.fqivy.spring.boot.blog.fqivyblog.domain.User;
import com.fqivy.spring.boot.blog.fqivyblog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @program: fqivy-blog
 * @description:User服务接口的实现类
 * @author: fqivy
 * @create: 2018-05-29 17:22
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void removeUser(Long id) {
        userRepository.delete(id);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public void removeUsersInBatch(List<User> users) {
        userRepository.deleteInBatch(users);
    }

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public Page<User> getUsersByUsername(String username, Pageable pageable) {
        //根据用户名模糊查询
        username = "%" + username + "%";
        Page<User> users = userRepository.findByUsernameLike(username, pageable);
        return users;
    }

    public User getUserByAccount(String account) {
        return userRepository.findByAccount(account);
    }
}
