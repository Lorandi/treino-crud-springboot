package com.rodrigolorandi.crudStudy.repositories;

import com.rodrigolorandi.crudStudy.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
