package com.rodrigolorandi.crudStudy.repositories;

import com.rodrigolorandi.crudStudy.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
