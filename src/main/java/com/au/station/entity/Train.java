package com.au.station.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Train_ID", nullable = false)
    private Integer trainID;

    @Column(name = "Wagon_List", nullable = false)
    private Integer[] wagonList;

    @Column(name = "Status", nullable = false)
    private Integer status;

    @Column(name = "Date_Time", nullable = false)
    private LocalDateTime dateTime;

    @Column(name = "Next_Station", nullable = false)
    private Integer nextStation;

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
