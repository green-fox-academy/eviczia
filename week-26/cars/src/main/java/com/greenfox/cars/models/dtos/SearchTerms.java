package com.greenfox.cars.models.dtos;

public class SearchTerms {

    private String plateCharacters;
    private String brand;
    private String category;

    public SearchTerms(String plateCharacters, String brand, String category) {
        this.plateCharacters = plateCharacters;
        this.brand = brand;
        this.category = category;
    }

    public SearchTerms() {
    }

    public String getPlateCharacters() {
        return plateCharacters;
    }

    public void setPlateCharacters(String plateCharacters) {
        this.plateCharacters = plateCharacters;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
