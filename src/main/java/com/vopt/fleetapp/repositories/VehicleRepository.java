package com.vopt.fleetapp.repositories;

import com.vopt.fleetapp.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {
}
