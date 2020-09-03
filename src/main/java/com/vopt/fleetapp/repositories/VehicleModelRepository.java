package com.vopt.fleetapp.repositories;

import com.vopt.fleetapp.models.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleModelRepository extends JpaRepository<VehicleModel,Integer> {
}
