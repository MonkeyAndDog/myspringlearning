package com.mrhu.spring.service.annotation;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mrhu.spring.model.annotation.User;

public class UserServiceTest {

	@Test
	public void test() {
		ApplicationContext application = new ClassPathXmlApplicationContext("beans_annotation.xml");
		UserService service = (UserService) application.getBean("userService");
		User u = new User();
		service.add(u);
	}

}
