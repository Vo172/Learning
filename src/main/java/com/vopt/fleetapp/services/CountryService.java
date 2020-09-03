package com.vopt.fleetapp.services;

import com.vopt.fleetapp.models.Country;
import com.vopt.fleetapp.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountries(){
        return countryRepository.findAll();
    }

    // New Country
    public void save(Country country){
        countryRepository.save(country);
    }

    // Get Country by Id
    public Optional<Country> findById(int id){
        return countryRepository.findById(id);
    }
}
