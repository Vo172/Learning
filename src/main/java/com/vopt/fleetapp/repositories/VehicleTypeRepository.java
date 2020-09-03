package com.vopt.fleetapp.repositories;

import com.vopt.fleetapp.models.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleTypeRepository extends JpaRepository<VehicleType,Integer> {
}
