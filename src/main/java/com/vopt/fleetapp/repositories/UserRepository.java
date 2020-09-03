package com.vopt.fleetapp.repositories;

import com.vopt.fleetapp.models.Contact;
import com.vopt.fleetapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
