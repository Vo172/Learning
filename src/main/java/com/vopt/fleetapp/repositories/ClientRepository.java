package com.vopt.fleetapp.repositories;

import com.vopt.fleetapp.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {
}
