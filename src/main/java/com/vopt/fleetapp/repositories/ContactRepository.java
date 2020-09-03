package com.vopt.fleetapp.repositories;

import com.vopt.fleetapp.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Integer> {
}
