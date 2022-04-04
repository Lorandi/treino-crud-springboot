package com.rodrigolorandi.crudStudy.services;

import com.rodrigolorandi.crudStudy.entities.User;
import com.rodrigolorandi.crudStudy.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

//    public User findById(Long id){
//        Optional<User> obj = repository.findById(id);
//        return obj.get();
//    }


    public User findById(Long id){
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
