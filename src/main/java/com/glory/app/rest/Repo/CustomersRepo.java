package com.glory.app.rest.Repo;

import com.glory.app.rest.Models.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomersRepo extends JpaRepository<Customers, Long> {
    Optional<Customers> findById(long id);
}