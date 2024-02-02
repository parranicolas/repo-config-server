package com.npsolutions.citiesservice.controller;

import com.npsolutions.citiesservice.dto.CityDTO;
import com.npsolutions.citiesservice.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private ICityService cityServ;

    @GetMapping("/hotels")
    public CityDTO getCitiesAndHotels(@RequestParam String name,
                                      @RequestParam String country){
        return cityServ.getCitiesHotels(name,country);
    }
}
