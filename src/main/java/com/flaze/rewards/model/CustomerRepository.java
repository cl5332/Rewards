package com.flaze.rewards.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flaze.rewards.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
