package com.glory.app.rest.Controller;

import com.glory.app.rest.Models.User;
import com.glory.app.rest.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class ApiControllers {

    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/")
    public String getPage(){

        return "welcome";
    }

    @GetMapping(value = "/users")
    public List<User> getUsers(){

        return userRepo.findAll();
    }

    @GetMapping(value = "/users/{id}")
    public User getUserByID(@PathVariable long id){

        return userRepo.findById(id).get();
    }
}