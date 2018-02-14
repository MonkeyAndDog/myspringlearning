package com.mrhu.spring.service.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mrhu.spring.dao.impl.annotation.UserDAOImpl;
import com.mrhu.spring.dao.annotation.UserDAO;
import com.mrhu.spring.model.annotation.User;

@Component("userService_annotation")
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
    
    //Autowire要和Qualifier混合着用，Qualifier传入的值是bean的name
//    @Autowired
//    public void setUserDAO(@Qualifier(value="u") UserDAO userDAO) {
    
    //和component一起用
//    @Resource(name="uuu")
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    
    @PostConstruct
    public void init() {
    	System.out.println("init");
    }
    @PreDestroy
    public void destory() {
    	System.out.println("destory");
    }
}
