package com.example.demo.controller;


import com.example.demo.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserAPI {

    public ResponseEntity<String> createusers(@RequestBody User user);
}
