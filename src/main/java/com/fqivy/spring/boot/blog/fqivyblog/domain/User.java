package com.fqivy.spring.boot.blog.fqivyblog.domain;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;


/**
 * User 实体
 *
 * @author fqivy
 */
@Entity
public class User implements Serializable {
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //设置自增策略
    private Long id;//用户id

    @NotEmpty(message = "用户姓名不能为空")
    @Size(min = 2, max = 20)
    @Column(nullable = false, length = 20)
    private String username;//用户姓名

    @NotEmpty(message = "邮箱不能为空")
    @Size(max = 50)
    @Email(message = "邮箱格式不正确")
    @Column(nullable = false, length = 50, unique = true)
    private String email;//邮箱地址

    @NotEmpty(message = "账号不能为空")
    @Size(min = 3, max = 20)
    @Column(nullable = false, length = 20, unique = true)
    private String account;//账号

    @NotEmpty(message = "密码不能为空")
    @Size(max = 20)
    @Column(nullable = false, length = 20)
    private String password;//密码

    @Column(length = 100)
    private String avatar;//用户头像

    protected User() {
    }

    public User(String username, String email, String account, String password) {
        this.username = username;
        this.email = email;
        this.account = account;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return String.format("User:{id:%s,username:%s,account:%s,password:%s,email:%s}", id, username, account, password, email);
    }
}
