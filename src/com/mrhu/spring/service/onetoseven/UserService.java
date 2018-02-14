package com.mrhu.spring.service.onetoseven;

import com.mrhu.spring.dao.impl.onetoseven.UserDAOImpl;
import com.mrhu.spring.dao.onetoseven.UserDAO;
import com.mrhu.spring.model.onetoseven.User;

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
    
    //生命周期使用
    public void init() {
    	System.out.println("init");
    }
    public void destory() {
    	System.out.println("destory");
    }
}
