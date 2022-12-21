
package com.glory.app.rest.Repo;

import com.glory.app.rest.Models.Buildings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BuildingsRepo extends JpaRepository<Buildings, Long> {
    @Override
    Optional<Buildings> findById(Long aLong);
}