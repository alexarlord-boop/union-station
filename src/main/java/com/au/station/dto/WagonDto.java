package com.au.station.dto;

import com.au.station.entity.Cargo;

import java.util.Objects;

public class WagonDto {


    private Integer Wagon_ID;


    private Integer Wagon_Number;


    private Integer Weight;

    // нужно делать связь через объект, а не id
    // relation to stations table

    private Integer Home_Station;


    private Integer Destination_Station;


    private com.au.station.entity.Cargo Cargo;

    public WagonDto() {
    }

    public WagonDto(Integer wagon_ID, Integer wagon_Number, Integer weight, Integer home_Station, Integer destination_Station, com.au.station.entity.Cargo cargo) {
        Wagon_ID = wagon_ID;
        Wagon_Number = wagon_Number;
        Weight = weight;
        Home_Station = home_Station;
        Destination_Station = destination_Station;
        Cargo = cargo;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WagonDto)) return false;
        WagonDto wagon = (WagonDto) o;
        return Objects.equals(getWagon_ID(), wagon.getWagon_ID()) && Objects.equals(getWagon_Number(), wagon.getWagon_Number()) && Objects.equals(getWeight(), wagon.getWeight()) && Objects.equals(getHome_Station(), wagon.getHome_Station()) && Objects.equals(getDestination_Station(), wagon.getDestination_Station()) && Objects.equals(getCargo(), wagon.getCargo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWagon_ID(), getWagon_Number(), getWeight(), getHome_Station(), getDestination_Station(), getCargo());
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
