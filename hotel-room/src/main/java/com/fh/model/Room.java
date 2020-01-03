package com.fh.model;

public class Room extends Page{

    private Integer id;
    private Integer level;
    private Integer window;
    private Integer area;
    private Integer bed;
    private Double price;
    private Integer describes;
    private String images;
    private Integer facilities;
    private Integer hotellocal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getWindow() {
        return window;
    }

    public void setWindow(Integer window) {
        this.window = window;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getBed() {
        return bed;
    }

    public void setBed(Integer bed) {
        this.bed = bed;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getDescribes() {
        return describes;
    }

    public void setDescribes(Integer describes) {
        this.describes = describes;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Integer getFacilities() {
        return facilities;
    }

    public void setFacilities(Integer facilities) {
        this.facilities = facilities;
    }

    public Integer getHotellocal() {
        return hotellocal;
    }

    public void setHotellocal(Integer hotellocal) {
        this.hotellocal = hotellocal;
    }
}
