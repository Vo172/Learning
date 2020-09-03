package com.vopt.fleetapp.repositories;

import com.vopt.fleetapp.models.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMovementRepository extends JpaRepository<VehicleMovement,Integer> {
}
