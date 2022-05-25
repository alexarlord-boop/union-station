package com.au.station.dto;

public class CargoDto {

    private Integer Cargo;
    private Integer Category_ID;
    private Integer Netto;

    public CargoDto(){
    }

    public CargoDto(Integer Cargo, Integer Category_ID, Integer Netto){
        this.Cargo = Cargo;
        this.Category_ID = Category_ID;
        this.Netto = Netto;
    }

    public Integer getCargo() {
        return Cargo;
    }

    public void setCargo(Integer cargo) {
        Cargo = cargo;
    }

    public Integer getCategory_ID() {
        return Category_ID;
    }

    public void setCategory_ID(Integer category_ID) {
        Category_ID = category_ID;
    }

    public Integer getNetto() {
        return Netto;
    }

    public void setNetto(Integer netto) {
        Netto = netto;
    }
}
