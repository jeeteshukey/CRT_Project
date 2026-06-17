package com.example.tailormanagement.service;

import com.example.tailormanagement.entity.Measurement;
import com.example.tailormanagement.repository.MeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeasurementService {

    @Autowired
    private MeasurementRepository measurementRepository;

    public Measurement saveMeasurement(Measurement measurement) {
        return measurementRepository.save(measurement);
    }
}