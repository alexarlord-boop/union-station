package com.au.station.dto;

import java.time.LocalDateTime;

public class TrainDto {

    private Integer trainID;
    private Integer[] wagonList;
    private Integer status;
    private LocalDateTime dateTime;
    private Integer nextStation;

    public TrainDto(){}

    public TrainDto(Integer trainID, Integer[] wagonList, Integer status, LocalDateTime dateTime, Integer nextStation){
        this.trainID = trainID;
        this.wagonList = wagonList;
        this.status = status;
        this.dateTime = dateTime;
        this.nextStation = nextStation;
    }

    public Integer getTrainID() {
        return trainID;
    }

    public void setTrainID(Integer trainID) {
        this.trainID = trainID;
    }

    public Integer[] getWagonList() {
        return wagonList;
    }

    public void setWagonList(Integer[] wagonList) {
        this.wagonList = wagonList;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getNextStation() {
        return nextStation;
    }

    public void setNextStation(Integer nextStation) {
        this.nextStation = nextStation;
    }
}
