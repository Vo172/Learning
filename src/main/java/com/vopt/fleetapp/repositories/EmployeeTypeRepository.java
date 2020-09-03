package com.vopt.fleetapp.repositories;

import com.vopt.fleetapp.models.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeTypeRepository extends JpaRepository<EmployeeType,Integer> {
}
