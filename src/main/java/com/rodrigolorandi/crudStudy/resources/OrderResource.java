package com.rodrigolorandi.crudStudy.resources;

import com.rodrigolorandi.crudStudy.entities.Order;
import com.rodrigolorandi.crudStudy.repositories.OrderRepository;
import com.rodrigolorandi.crudStudy.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderResource {

    private final OrderService service;

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable  Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }
}
