package com.au.station.entity;


import jdk.jfr.events.CertificateId;

import javax.persistence.*;

@Entity
@Table
public class Wagon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Wagon_ID;

    @Column
    private Integer Wagon_Number;

    @Column
    private Integer Weight;

    // нужно делать связь через объект, а не id
    // relation to stations table
    @Column
    private Integer Home_Station;

    // нужно делать связь через объект, а не id
    @Column
    private Integer Destination_Station;

    // нужно делать связь через объект, а не id
    @Column
    private Cargo Cargo;

    public Wagon() {
    }

    public Integer getWagon_ID() {
        return Wagon_ID;
    }

    public void setWagon_ID(Integer wagon_ID) {
        Wagon_ID = wagon_ID;
    }

    public Integer getWagon_Number() {
        return Wagon_Number;
    }

    public void setWagon_Number(Integer wagon_Number) {
        Wagon_Number = wagon_Number;
    }

    public Integer getWeight() {
        return Weight;
    }

    public void setWeight(Integer weight) {
        Weight = weight;
    }

    public Integer getHome_Station() {
        return Home_Station;
    }

    public void setHome_Station(Integer home_Station) {
        Home_Station = home_Station;
    }

    public Integer getDestination_Station() {
        return Destination_Station;
    }

    public void setDestination_Station(Integer destination_Station) {
        Destination_Station = destination_Station;
    }

    public com.au.station.entity.Cargo getCargo() {
        return Cargo;
    }

    public void setCargo(com.au.station.entity.Cargo cargo) {
        Cargo = cargo;
    }

    @Override
    public String toString() {
        return "Wagon{" +
                "Wagon_ID=" + Wagon_ID +
                ", Wagon_Number=" + Wagon_Number +
                ", Weight=" + Weight +
                ", Home_Station=" + Home_Station +
                ", Destination_Station=" + Destination_Station +
                ", Cargo=" + Cargo +
                '}';
    }
}
