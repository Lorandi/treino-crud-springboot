package com.rodrigolorandi.crudStudy.resources;

import com.rodrigolorandi.crudStudy.entities.Product;
import com.rodrigolorandi.crudStudy.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductResource {

    private final ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable  Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }
}
