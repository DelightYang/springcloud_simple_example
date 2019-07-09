package com.learnspring.springcloud.controller;


import com.learnspring.springcloud.pojo.NikeUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/{id}")
    public NikeUser createUser(@PathVariable int id) {
        return new NikeUser(id);
    }
}
