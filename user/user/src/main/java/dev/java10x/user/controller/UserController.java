package dev.java10x.user.controller;

import dev.java10x.user.domain.UserModel;
import dev.java10x.user.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public ResponseEntity<UserModel> createUser(@RequestBody UserModel userModel){
        UserModel savedUser = userService.save(userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }
}
