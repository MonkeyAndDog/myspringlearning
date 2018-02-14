package com.mrhu.spring.dao.impl;

import com.mrhu.spring.dao.LogDAO;
import com.mrhu.spring.dao.UserDAO;
import com.mrhu.spring.model.Log;
import com.mrhu.spring.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component("logDAO")
public class LogDAOImpl implements LogDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Log log) {
		Session session = sessionFactory.getCurrentSession();
		session.save(log);
	}
}
