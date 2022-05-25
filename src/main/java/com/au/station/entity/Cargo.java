package com.au.station.entity;

import javax.persistence.*;

@Entity
@Table
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Cargo", nullable = false)
    private Integer Cargo;

    @Column(name = "Category_ID", nullable = false)
    private Integer Category_ID;

    @Column(name = "Netto", nullable = false)
    private Integer Netto;

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
