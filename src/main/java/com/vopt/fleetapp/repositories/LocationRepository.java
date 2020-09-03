package com.vopt.fleetapp.repositories;

import com.vopt.fleetapp.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Integer> {
}
