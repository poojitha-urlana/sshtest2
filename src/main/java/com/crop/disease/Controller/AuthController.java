package com.crop.disease.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.crop.disease.Model.User;
import com.crop.disease.Service.UserService;


@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public void register(@RequestBody User user) {
        userService.registerUser(user);
    }

    @PostMapping("/login")
    public void login(@RequestBody User user) {
        // login logic handled by Spring Security
    }
}
