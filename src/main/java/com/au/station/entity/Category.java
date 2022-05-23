package com.au.station.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Category {
    @Id
    @Column(name = "Category_ID", nullable = false)
    public Integer Category_ID;

    @Column(name = "Cargo_Name", nullable = false)
    public String Cargo_Name;

    public Integer getCategory_ID() {
        return Category_ID;
    }

    public void setCategory_ID(Integer category_ID) {
        Category_ID = category_ID;
    }

    public String getCargo_Name() {
        return Cargo_Name;
    }

    public void setCargo_Name(String cargo_Name) {
        Cargo_Name = cargo_Name;
    }
}
