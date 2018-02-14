package com.mrhu.spring.aop._xml;

import com.mrhu.spring.model.annotation.User;

public interface UserDAO {

    public void save(User user);
    public void delete(User user);
    
}
