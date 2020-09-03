package com.vopt.fleetapp.repositories;

import com.vopt.fleetapp.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
}
