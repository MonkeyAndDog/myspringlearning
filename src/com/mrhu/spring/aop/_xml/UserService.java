package com.mrhu.spring.aop._xml;

import com.mrhu.spring.dao.annotation.UserDAO;
import com.mrhu.spring.model.annotation.User;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class UserService {

    private UserDAO userDAO;

    public UserService() {}
    
    public UserService(UserDAO userDAO) {
    	this.userDAO = userDAO;
    }

    public void add(User user) {
        this.userDAO.save(user);
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }
    
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    
    public void init() {
    	System.out.println("init");
    }
    public void destory() {
    	System.out.println("destory");
    }
}
