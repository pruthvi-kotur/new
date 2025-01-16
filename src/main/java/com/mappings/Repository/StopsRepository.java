package com.mappings.Repository;

import com.mappings.entity.Stops;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StopsRepository extends JpaRepository<Stops, Long> {
}