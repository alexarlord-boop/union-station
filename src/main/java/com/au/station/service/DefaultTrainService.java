package com.au.station.service;

import com.au.station.dto.TrainDto;
import com.au.station.entity.Train;
import com.au.station.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DefaultTrainService {
    private final TrainRepository trainRepository;
    @Autowired
    public DefaultTrainService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public TrainDto getTrain(Integer id) {
        Train train = trainRepository.getById(id);
        return new TrainDto(
                train.getTrainID(),
                train.getWagonList(),
                train.getStatus(),
                train.getDateTime(),
                train.getNextStation()
        );
    }
}
