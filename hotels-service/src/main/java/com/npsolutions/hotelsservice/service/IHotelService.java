package com.npsolutions.hotelsservice.service;

import com.npsolutions.hotelsservice.model.Hotel;

import java.util.List;

public interface IHotelService {

    List<Hotel> getHotelsByCityId(Long city_id);
}
