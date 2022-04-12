package com.rodrigolorandi.crudStudy.services;

import com.rodrigolorandi.crudStudy.entities.User;
import com.rodrigolorandi.crudStudy.repositories.UserRepository;
import com.rodrigolorandi.crudStudy.services.exceptions.ResourceNotFoundException;
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

    public User findById(Long id){
//        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User user){
        return repository.save((user));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public User update(Long id,User user){
//        User entity = repository.getById(id);
//        updateData(entity,obj);
//        return repository.save(entity);

        return repository.findById(id)
                .map(r -> {
                    r.setName(user.getName());
                    r.setEmail(user.getEmail());
                    r.setPhone(user.getPhone());
                    return repository.save(r);
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
//    private void updateData(User entity, User obj) {
//        entity.setName(obj.getName());
//        entity.setEmail(obj.getEmail());
//        entity.setPhone(obj.getPhone());
//    }
}
