package com.flaze.rewards.Controller;

import java.util.List;

import com.flaze.rewards.model.Customer;
import com.flaze.rewards.model.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RewardsService {

    @Autowired
    private CustomerRepository customerRepository;


    public List<Customer> getCustomerAll() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Integer customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }
}