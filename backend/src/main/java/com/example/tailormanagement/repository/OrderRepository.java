package com.example.tailormanagement.repository;

import com.example.tailormanagement.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Transactional
    void deleteByCustomerCustomerId(Long customerId);
}