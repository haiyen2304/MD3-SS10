package com.ra.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Customer {
    private int id;
    private String name;
    private String address;
    private String picture;
    private LocalDate birthDay;

    public Customer() {
    }

    public Customer(int id, String name, String address, String picture, LocalDate birthDay) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.picture = picture;
        this.birthDay = birthDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
    public String formatDate(){
        return birthDay.format(DateTimeFormatter.ISO_LOCAL_DATE); // yyyy-MM-dd
    }
}
