package com.glory.app.rest.Repo;

import com.glory.app.rest.Models.Columns;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ColumnsRepo extends JpaRepository<Columns, Long> {
    @Override
    Optional<Columns> findById(Long aLong);
}