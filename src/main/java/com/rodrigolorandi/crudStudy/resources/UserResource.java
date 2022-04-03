package com.rodrigolorandi.crudStudy.resources;

import com.rodrigolorandi.crudStudy.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
//@RequiredArgsConstructor
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(null, "Maria","email@gmal.com", "Maria#123");
        return ResponseEntity.ok().body(u);
    }
}
