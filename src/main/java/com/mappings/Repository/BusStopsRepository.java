package com.mappings.Repository;

import com.mappings.entity.BusStops;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusStopsRepository extends JpaRepository<BusStops, Long> {
}