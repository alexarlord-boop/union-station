package com.au.station.addons;


import com.au.station.dto.TrainDto;
import com.au.station.dto.WagonDto;

import java.util.Arrays;
import java.util.List;

public class TrainFileParser {
    private String data;
    private List<WagonDto> train;
    private TrainDto trainDto;

    public void setData(String data) {
        this.data = data;
    }

    public List<WagonDto> getTrainAsWagonList() {
        return this.train;
    }

    public WagonDto dataLineToWagonDto(String dataline) {
        String[] parts = dataline.split(",");
        return new WagonDto(parts[0], parts[0], parts[1], parts[2], parts[3], parts[4], parts[5]);
    }

    public void dataToWagonList() {
        List<String> lines = Arrays.asList(this.data.split("\n"));
        for (String line : lines) {
            train.add(dataLineToWagonDto(line));
        }
    }

    public void dataToTrainDto() {
    }
}

