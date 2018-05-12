package com.mrhu.spring.dao.impl.useDaoSupport;

import com.mrhu.spring.dao.LogDAO;
import com.mrhu.spring.dao.UserDAO;
import com.mrhu.spring.model.Log;
import com.mrhu.spring.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component("logDAO")
public class LogDAOImpl extends HibernateDaoSupport implements LogDAO {


	@Override
	public void save(Log log) {
		
		this.getHibernateTemplate().save(log);
//		this.save(log);
		
	}
}
