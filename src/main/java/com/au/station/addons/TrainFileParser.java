package com.au.station.addons;


import com.au.station.dto.TrainDto;
import com.au.station.dto.WagonDto;

import java.util.List;

public class TrainFileParser {
    private String data;
    public List<TrainDto> trains;

    public void setData(String data) {
        this.data = data;
    }

    // multithread process
    public WagonDto dataLineToWagonDto(String dataline){
        String[] parts = dataline.split(",");
        return new WagonDto(parts[0], parts[0], parts[1], parts[2], parts[3], parts[4], parts[5]);
    }
}

