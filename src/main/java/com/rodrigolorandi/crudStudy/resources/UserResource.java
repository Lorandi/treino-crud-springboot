package com.rodrigolorandi.crudStudy.resources;

import com.rodrigolorandi.crudStudy.entities.User;
import com.rodrigolorandi.crudStudy.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
//@RequiredArgsConstructor
public class UserResource {
//
//    @Autowired
//    private UserRepository repository;

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(null, "Maria","email@gmal.com", "99999999", "Maria#123");
        return ResponseEntity.ok().body(u);
    }
}
