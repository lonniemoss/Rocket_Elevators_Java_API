package com.glory.app.rest.Repo;

import com.glory.app.rest.Models.Batteries;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BatteriesRepo extends JpaRepository<Batteries, Long> {
    @Override
    Optional<Batteries> findById(Long aLong);
}