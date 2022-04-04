package com.rodrigolorandi.crudStudy.repositories;

import com.rodrigolorandi.crudStudy.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
