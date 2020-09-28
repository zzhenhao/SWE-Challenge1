package com.example.demo.service;

import com.example.demo.DataAccessObj.UserDAO;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserService(@Qualifier("dao") UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public List<User> getUsers(Long start, Long end) {
        return userDAO.getUsers(start, end);
    }

    public List<User> getUsers() {
        return userDAO.getUsers();
    }
}
