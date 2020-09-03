package com.vopt.fleetapp.repositories;

import com.vopt.fleetapp.models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {
}
