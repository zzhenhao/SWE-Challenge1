package com.example.demo.DataAccessObj;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("dao")
public class DataAccessService implements UserDAO{

    private static List<User> database = new ArrayList<>();

    @Override
    public int insertUser(String name, Long salary) {
        database.add(new User(name, salary));
        return 1;
    }

    @Override
    public List<User> getUsers() {
        return database;
    }


    @Override
    public List<User> getUsers(Long start, Long end) {

        List<User> temp = new ArrayList<>();

        for (User user : database) {
            if (user.getSalary() >= start && user.getSalary() <= end) {
                temp.add(new User(user.getName(), user.getSalary()));
            }
        }
       return temp;
    }

}
