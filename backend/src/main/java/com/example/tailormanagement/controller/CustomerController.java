package com.example.tailormanagement.controller;

import java.util.List;

import com.example.tailormanagement.dto.CustomerDataDTO;
import com.example.tailormanagement.entity.Customer;
import com.example.tailormanagement.entity.Measurement;
import com.example.tailormanagement.entity.Order;
import com.example.tailormanagement.repository.CustomerRepository;
import com.example.tailormanagement.repository.MeasurementRepository;
import com.example.tailormanagement.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.transaction.annotation.Transactional;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin(origins = "*")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private MeasurementRepository measurementRepository;

    @Autowired
    private OrderRepository orderRepository;

    // CREATE CUSTOMER

    @PostMapping("/create")
    public String createCustomer(@RequestBody CustomerDataDTO dto) {

        Customer customer = new Customer();

        customer.setName(dto.getName());
        customer.setMobile(dto.getMobile());
        customer.setAddress(dto.getAddress());
        customer.setGender(dto.getGender());

        Customer savedCustomer = customerRepository.save(customer);

        Measurement measurement = new Measurement();

        measurement.setCustomer(savedCustomer);
        measurement.setChest(dto.getChest());
        measurement.setWaist(dto.getWaist());
        measurement.setShoulder(dto.getShoulder());
        measurement.setSleeve(dto.getSleeve());
        measurement.setNeck(dto.getNeck());
        measurement.setShirtLength(dto.getShirtLength());
        measurement.setHip(dto.getHip());
        measurement.setThigh(dto.getThigh());
        measurement.setInseam(dto.getInseam());
        measurement.setOutseam(dto.getOutseam());

        measurementRepository.save(measurement);

        Order order = new Order();

        order.setCustomer(savedCustomer);
        order.setGarmentType(dto.getGarmentType());
        order.setOrderDate(dto.getOrderDate());
        order.setDeliveryDate(dto.getDeliveryDate());
        order.setStatus(dto.getStatus());
        order.setTotalAmount(dto.getTotalAmount());
        order.setAdvancePaid(dto.getAdvancePaid());
        order.setRemainingAmount(dto.getRemainingAmount());
        order.setNotes(dto.getNotes());

        orderRepository.save(order);

        return "Customer, measurements and order saved successfully";
    }

    // GET ALL CUSTOMERS

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    // GET CUSTOMER BY ID

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {

        return customerRepository
                .findById(id)
                .orElse(null);
    }

    // UPDATE CUSTOMER

    @PutMapping("/{id}")
    public String updateCustomer(
            @PathVariable Long id,
            @RequestBody CustomerDataDTO dto) {

        Customer customer = customerRepository
                .findById(id)
                .orElse(null);

        if (customer == null) {
            return "Customer not found";
        }

        customer.setName(dto.getName());
        customer.setMobile(dto.getMobile());
        customer.setAddress(dto.getAddress());
        customer.setGender(dto.getGender());

        customerRepository.save(customer);

        return "Customer updated successfully";
    }

    // DELETE CUSTOMER

    @Transactional
    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable Long id) {

        if (!customerRepository.existsById(id)) {
            return "Customer not found";
        }

        measurementRepository.deleteByCustomerCustomerId(id);
        orderRepository.deleteByCustomerCustomerId(id);

        customerRepository.deleteById(id);

        return "Customer deleted successfully";
    }

}