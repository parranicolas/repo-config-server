package com.npsolutions.citiesservice.service;

import com.npsolutions.citiesservice.dto.CityDTO;

public interface ICityService {

    public CityDTO getCitiesHotels(String name, String country);
}
