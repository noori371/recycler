package com.example.recyclerview.model;

public class RecentsData {
    String PlaceName;
    String CountryName;
    String Price;
    Integer imageUrl;

    public String getPlace() {
        return PlaceName;
    }

    public void setPlace(String place) {
        PlaceName = place;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public RecentsData(String place, String countryName, String price, Integer imageUrl) {
        PlaceName = place;
        CountryName = countryName;
        Price = price;
        this.imageUrl = imageUrl;
    }
}