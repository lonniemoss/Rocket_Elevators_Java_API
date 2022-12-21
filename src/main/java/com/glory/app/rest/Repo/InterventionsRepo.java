package com.glory.app.rest.Repo;

import com.glory.app.rest.Models.Interventions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InterventionsRepo extends JpaRepository<Interventions, Long> {
    @Override
    Optional<Interventions> findById(Long aLong);
}