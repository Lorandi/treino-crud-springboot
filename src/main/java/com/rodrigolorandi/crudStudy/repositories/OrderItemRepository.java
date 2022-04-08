package com.rodrigolorandi.crudStudy.repositories;

import com.rodrigolorandi.crudStudy.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
