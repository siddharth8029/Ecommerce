package com.example.demo.Repo;

import com.example.demo.model.OrderItem;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepo extends JpaRepository<OrderItem, Long> {
    @Transactional
    void deleteByProductId(Integer productId); // ✅ Spring generates this automatically
}
