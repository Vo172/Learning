package com.vopt.fleetapp.repositories;

import com.vopt.fleetapp.models.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State,Integer> {
}
