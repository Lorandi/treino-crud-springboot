package com.rodrigolorandi.crudStudy.resources;

import com.rodrigolorandi.crudStudy.entities.User;
import com.rodrigolorandi.crudStudy.repositories.UserRepository;
import com.rodrigolorandi.crudStudy.services.UserService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserResource {

    private final UserRepository repository;
    private final UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable  Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }
}
