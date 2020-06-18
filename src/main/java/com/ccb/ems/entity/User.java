package com.ccb.ems.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-06-17 11:12:27
 */
@Component
public class User implements Serializable {
    
    private String id;
    
    private String username;
    
    private String sex;
    
    private Object birthday;
    
    private String address;
    
    private String password;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Object getBirthday() {
        return birthday;
    }

    public void setBirthday(Object birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}