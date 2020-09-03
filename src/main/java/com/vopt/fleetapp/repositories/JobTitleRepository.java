package com.vopt.fleetapp.repositories;

import com.vopt.fleetapp.models.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleRepository extends JpaRepository<JobTitle,Integer> {
}
