package com.fqivy.spring.boot.blog.fqivyblog.repository;

import com.fqivy.spring.boot.blog.fqivyblog.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * 用户仓库
 *
 * @author fqivy
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * 根据用户名分页查询用户列表
     *
     * @param username
     * @param pageable
     * @return
     */
    public Page<User> findByUsernameLike(String username, Pageable pageable);

    public User findByAccount(String account);
}
