package com.example.tailormanagement.repository;

import com.example.tailormanagement.entity.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface MeasurementRepository extends JpaRepository<Measurement, Long> {

    @Transactional
    void deleteByCustomerCustomerId(Long customerId);
}