package com.vopt.fleetapp.repositories;

import com.vopt.fleetapp.models.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleStatusRepository extends JpaRepository<VehicleStatus,Integer> {
}
