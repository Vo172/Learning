package com.vopt.fleetapp.repositories;

import com.vopt.fleetapp.models.VehicleMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMaintenanceRepository extends JpaRepository<VehicleMaintenance,Integer> {
}
