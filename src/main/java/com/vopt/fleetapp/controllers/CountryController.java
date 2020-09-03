package com.vopt.fleetapp.controllers;

import com.vopt.fleetapp.models.Country;
import com.vopt.fleetapp.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping("/country")
    public String getCountries(Model model){
        List<Country> countryList = countryService.getCountries();
        model.addAttribute("country",countryList);
        return "country";
    }
    @PostMapping("/country/addNew")
    public String addNew(Country country){
        countryService.save(country);
        return "redirect:/country";
    }

    @RequestMapping("country/findById")
    @ResponseBody
    public Optional<Country> findById(int id){
        return countryService.findById(id);
    }

    @RequestMapping(value="/country/update",method={RequestMethod.PUT, RequestMethod.GET})
    public String update(Country country){
        countryService.save(country);
        return "redirect:/country";
    }
}
