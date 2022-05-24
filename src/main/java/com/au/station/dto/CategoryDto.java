package com.au.station.dto;

public class CategoryDto {

    private Integer Category_ID;
    private String Cargo_Name;

    CategoryDto(){
    }

    CategoryDto(Integer Category_ID, String Cargo_Name){
        this.Category_ID = Category_ID;
        this.Cargo_Name = Cargo_Name;
    }

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
