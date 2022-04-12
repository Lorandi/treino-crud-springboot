package com.rodrigolorandi.crudStudy.resources;

import com.rodrigolorandi.crudStudy.entities.User;
import com.rodrigolorandi.crudStudy.repositories.UserRepository;
import com.rodrigolorandi.crudStudy.services.UserService;
import lombok.RequiredArgsConstructor;

import org.hibernate.annotations.Parameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserResource {

    private final UserService service;
    private final UserRepository repository;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable  Long id) {
        User obj =service.findById(id);
        return ResponseEntity.ok().body(obj);

    }

    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User user){
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).body(service.insert(user));
    }

//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public User insert(@RequestBody User user){
//        return service.insert(user);
//    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        var user =  service.findById(id);
        service.delete(user.getId());
//
//        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user){
        return ResponseEntity.ok().body(service.update(id,user));
    }

}
