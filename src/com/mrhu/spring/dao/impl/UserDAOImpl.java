package com.mrhu.spring.dao.impl;

import com.mrhu.spring.dao.UserDAO;
import com.mrhu.spring.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component("userDAO")
public class UserDAOImpl implements UserDAO {

	//简单属性注入
	private int daoId;
	private String daoStatus;
	
	//集合注入
	private List<String> list;
	private Map<String, String> map;
	private Set<String> set;

	private SessionFactory sessionFactory;

	//整合hibernate


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

    public int getDaoId() {
		return daoId;
	}

	public void setDaoId(int daoId) {
		this.daoId = daoId;
	}

	public String getDaoStatus() {
		return daoStatus;
	}

	public void setDaoStatus(String daoStatus) {
		this.daoStatus = daoStatus;
	}

	@Override
    public void save(User user) {
	    //beginTransaction和commit交给Spring管理
	    Session session = sessionFactory.getCurrentSession();
		session.save(user);
        System.out.println("user save666");
    }
	
	@Override
	public String toString() {
		return this.daoId+"";
	}

	@Override
	public void delete(User user) {
		System.out.println("delete user");
	}

}
