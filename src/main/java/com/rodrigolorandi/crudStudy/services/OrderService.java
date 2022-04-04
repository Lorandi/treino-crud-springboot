package com.rodrigolorandi.crudStudy.services;

import com.rodrigolorandi.crudStudy.entities.Order;
import com.rodrigolorandi.crudStudy.entities.User;
import com.rodrigolorandi.crudStudy.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

//    public Order findById(Long id){
//        Optional<Order> obj = repository.findById(id);
//        return obj.get();
//    }


    public Order findById(Long id){
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
