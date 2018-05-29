package com.fqivy.spring.boot.blog.fqivyblog.service;

import com.fqivy.spring.boot.blog.fqivyblog.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

/**
 * User Service接口
 *
 * @author fqivy
 */
@Service
public interface UserService {
    /**
     * 保存用户
     *
     * @param user
     * @return
     */
    public User saveUser(User user);

    /**
     * 删除用户
     * @param id
     */
    public void removeUser(Long id);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    public User updateUser(User user);

    /**
     * 根据用户id查询用户信息
     * @param id
     * @return
     */
    public User getUserById(Long id);

    /**
     * 批量删除用户
     * @param users
     */
    public void removeUsersInBatch(List<User> users);

    /**
     * 获取用户列表
     * @return
     */
    public List<User> getUserList();

    /**
     * 根据用户名分页查询用户信息
     * @param username
     * @param pageable
     * @return
     */
    public Page<User> getUsersByUsername(String username, Pageable pageable);

}
