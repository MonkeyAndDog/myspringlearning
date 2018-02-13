package com.mrhu.spring.dao;

import com.mrhu.spring.BeanFactory;
import com.mrhu.spring.ClassPathXmlApplicationContext;
import com.mrhu.spring.model.User;
import com.mrhu.spring.service.UserService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* UserService Tester. 
* 
* @author <Authors name> 
* @since <pre>02/13/2018</pre> 
* @version 1.0 
*/ 
public class UserServiceTest { 

    @Test
    public void testAdd() throws Exception {
    	BeanFactory factory = new ClassPathXmlApplicationContext();
    	
//        UserService service = new UserService();
//        UserDAO userDAO = (UserDAO)factory.getBean("u");
        UserService service = (UserService)factory.getBean("userService");
//        service.setUserDAO(userDAO);
        User user = new User();
        service.add(user);
    }
}
