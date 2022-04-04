package com.rodrigolorandi.crudStudy.services;

import com.rodrigolorandi.crudStudy.entities.Product;
import com.rodrigolorandi.crudStudy.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

//    public User findById(Long id){
//        Optional<User> obj = repository.findById(id);
//        return obj.get();
//    }


    public Product findById(Long id){
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
