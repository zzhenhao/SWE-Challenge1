package com.example.demo.DataAccessObj;

import com.example.demo.model.User;

import java.util.List;
import java.util.UUID;

public interface UserDAO {

    int insertUser(String name, Long salary);

    List<User> getUsers(Long start, Long end);

    List<User> getUsers();


}