package com.vopt.fleetapp.repositories;

import com.vopt.fleetapp.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
