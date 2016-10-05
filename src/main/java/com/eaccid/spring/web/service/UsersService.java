package com.eaccid.spring.web.service;

import com.eaccid.spring.web.dao.User;
import com.eaccid.spring.web.dao.UsersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("usersService")
public class UsersService {

    private UsersDao usersDao;

    @Autowired
    public void setOffersDao(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    public void create(User user) {
        usersDao.create(user);
    }

    public boolean exists(String username) {
        return usersDao.exists(username);
    }

    public List<User> getAllUsers() {

        return usersDao.getAllUsers();

    }
}
