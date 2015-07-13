package com.socialimpulse.tripsapp.logic;

/*
* Class used to handle the logic of the Car model in the app.
* */

public class Car {

    private String city;
    private String model;
    private String licensePlate;

    public Car(String city, String model, String licensePlate) {
        this.city = city;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
