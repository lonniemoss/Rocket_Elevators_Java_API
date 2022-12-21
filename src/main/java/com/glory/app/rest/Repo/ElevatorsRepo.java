
package com.glory.app.rest.Repo;

import com.glory.app.rest.Models.Elevators;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ElevatorsRepo extends JpaRepository<Elevators, Long> {
    @Override
    Optional<Elevators> findById(Long aLong);
}