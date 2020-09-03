package com.vopt.fleetapp.repositories;

import com.vopt.fleetapp.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Integer> {
}
