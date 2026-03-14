package com.example.demo.Repo;


import com.example.demo.model.Orders;
import jakarta.persistence.criteria.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepo extends JpaRepository<Orders, Integer> {

    Optional<Order> findByOrderId(String orderId);


}
