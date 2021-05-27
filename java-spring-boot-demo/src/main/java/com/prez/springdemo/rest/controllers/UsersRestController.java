package com.prez.springdemo.rest.controllers;

import com.demo.codegen.controllers.UsersApi;
import com.demo.codegen.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsersRestController implements UsersApi {

    @CrossOrigin
    @Override
    public ResponseEntity<User> getUserById(Long id) {

        User user = new User();
        user.setId(id);
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setGender(User.GenderEnum.MALE);
        return ResponseEntity.ok(user);
    }
}
