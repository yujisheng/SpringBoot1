package com.baizhi.springboot1.entity;

import java.io.Serializable;

public class User implements Serializable {
    private String userid;
    private String username;
    private String userpassword;

    public User() {
        super();
    }

    public User(String userid, String username, String userpassword) {
        this.userid = userid;
        this.username = username;
        this.userpassword = userpassword;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                ", userpassword='" + userpassword + '\'' +
                '}';
    }
}
