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


    @RequestMapping(value = "/users", method=RequestMethod.GET)
    public List<User> getUsers()
    {
        return userService.getUsers();
    }

    @RequestMapping(value = "/users", method=RequestMethod.GET, params = {"start", "end"})
    public List<User> getUsers(@RequestParam(value="start")Long start, @RequestParam(value="end") Long end)
    {
        return userService.getUsers(start, end);
    }

    @RequestMapping(value = "/users", method=RequestMethod.GET, params = {"Sort"})
    public List<User> getA_SortedUsers(@RequestParam(value = "Sort") String request)
    {
        if(request.equals("Ascending"))
            return userService.getSortedUsers(true);
        else if(request.equals("Descending"))
            return userService.getSortedUsers(false);
        else
            return getUsers();
    }
}
