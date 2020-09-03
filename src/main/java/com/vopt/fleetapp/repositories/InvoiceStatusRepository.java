package com.vopt.fleetapp.repositories;

import com.vopt.fleetapp.models.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus,Integer> {
}
