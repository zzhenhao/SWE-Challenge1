package com.example.demo.api;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserAPI {

   private final UserService userService;

   @Autowired
    public UserAPI(UserService userService)
    {
        this.userService = userService;
    }


    @RequestMapping("/users")
    public List<User> getUsers()
    {
        return userService.getUsers();
    }

    @RequestMapping("/usersParam")
    public List<User> getUsers(@RequestParam(value="start")Long start, @RequestParam(value="end") Long end)
    {
        return userService.getUsers(start, end);
    }

    @RequestMapping("/users/Ascending")
    public List<User> getA_SortedUsers()
    {
        return userService.getSortedUsers(true);
    }

    @RequestMapping("/users/Descending")
    public List<User> getD_SortedUsers()
    {
        return userService.getSortedUsers(false);
    }


}
