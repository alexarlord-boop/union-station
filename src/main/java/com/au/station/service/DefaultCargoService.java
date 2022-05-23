package com.au.station.service;

import com.au.station.entity.Cargo;
import com.au.station.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DefaultCargoService {
    private final CargoRepository cargoRepository;
    @Autowired
    public DefaultCargoService(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    public List<Cargo> getAllCargo() {
        List<Cargo> Cargo = cargoRepository.getAllCargo();
        return Cargo;
    }
}
