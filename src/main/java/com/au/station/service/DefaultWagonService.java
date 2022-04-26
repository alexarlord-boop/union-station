package com.au.station.service;

import com.au.station.dto.WagonDto;
import com.au.station.entity.Wagon;
import com.au.station.repository.CargoRepository;
import com.au.station.repository.WagonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultWagonService {

    private final WagonRepository wagonRepository;
    private final CargoRepository cargoRepository;


    @Autowired
    public DefaultWagonService(WagonRepository wagonRepository, CargoRepository cargoRepository) {
        this.wagonRepository = wagonRepository;
        this.cargoRepository = cargoRepository;
    }

    public WagonDto getWagon(Integer id) {
        Wagon wagon = wagonRepository.getById(id);
        return new WagonDto(
                wagon.getWagon_ID(),
                wagon.getWagon_Number(),
                wagon.getWeight(),
                wagon.getHome_Station(),
                wagon.getHome_Station(),
                wagon.getCargo()
        );
    }



}
