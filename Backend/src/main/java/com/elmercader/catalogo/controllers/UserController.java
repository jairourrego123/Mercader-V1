package com.elmercader.catalogo.controllers;

import com.elmercader.catalogo.models.User;
import com.elmercader.catalogo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserServices userServices;

    @GetMapping("/all")
    public List<User> getUserAll(){
        return userServices.getAllUsers();
    }
    @GetMapping("/{email}")
    public Boolean getUserByEmail(@PathVariable("email") String email){
        return userServices.getUserByEmail(email);
    }
    @GetMapping("/{email}/{password}")
    public Optional<User> validateUserLogin(@PathVariable("email")String email,@PathVariable("password")String password){
        return userServices.validateUserLogin(email,password);
    }
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public User insertUser(@RequestBody User user){
        return userServices.saveUser(user);

    }
}
