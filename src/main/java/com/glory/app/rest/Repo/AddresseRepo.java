package com.glory.app.rest.Repo;

import com.glory.app.rest.Models.Addresses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AddresseRepo extends JpaRepository<Addresses, Long> {
    Optional<Addresses> findById(long id);
}
