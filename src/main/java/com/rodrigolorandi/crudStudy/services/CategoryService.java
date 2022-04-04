package com.rodrigolorandi.crudStudy.services;

import com.rodrigolorandi.crudStudy.entities.Category;
import com.rodrigolorandi.crudStudy.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

//    public User findById(Long id){
//        Optional<Category> obj = repository.findById(id);
//        return obj.get();
//    }


    public Category findById(Long id){
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
