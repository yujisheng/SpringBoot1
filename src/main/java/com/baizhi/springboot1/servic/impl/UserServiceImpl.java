package com.baizhi.springboot1.servic.impl;

import com.baizhi.springboot1.dao.UserDao;
import com.baizhi.springboot1.entity.User;
import com.baizhi.springboot1.servic.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}
