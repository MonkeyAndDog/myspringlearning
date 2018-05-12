package com.mrhu.spring.aop._xml;

import com.mrhu.spring.dao.annotation.UserDAO;
import com.mrhu.spring.model.annotation.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserDAOImpl implements UserDAO {

	private int daoId;
	private String daoStatus;
	
	private List<String> list;
	private Map<String, String> map;
	private Set<String> set;
	
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
        System.out.println("user save888");
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
