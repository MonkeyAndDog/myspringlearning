package com.mrhu.spring.service;

import com.mrhu.spring.dao.UserDAO;
import com.mrhu.spring.dao.impl.UserDAOImpl;
import com.mrhu.spring.model.User;

public class UserService {

    private UserDAO userDAO;

    public void add(User user) {
        this.userDAO.save(user);
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
