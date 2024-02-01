package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/users")
public class UserController implements UserAPI {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    @Override
    public ResponseEntity<String> createusers(@RequestBody User user) {
            userService.registerUser(user);

           return new ResponseEntity<>("User Registered Successfully", HttpStatus.CREATED);
    }
}
