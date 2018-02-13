package com.mrhu.spring.dao.impl;

import com.mrhu.spring.dao.UserDAO;
import com.mrhu.spring.model.User;

public class UserDAOImpl implements UserDAO {

    @Override
    public void save(User user) {
        System.out.println("user save");
    }

}
