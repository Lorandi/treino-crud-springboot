package com.rodrigolorandi.crudStudy.resources;

import com.rodrigolorandi.crudStudy.entities.Category;
import com.rodrigolorandi.crudStudy.repositories.CategoryRepository;
import com.rodrigolorandi.crudStudy.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryResource {

    private final CategoryRepository repository;
    private final CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable  Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }
}
