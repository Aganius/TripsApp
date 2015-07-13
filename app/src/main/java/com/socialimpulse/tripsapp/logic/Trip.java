package com.socialimpulse.tripsapp.logic;

import java.util.Date;

/*
* Class used to handle the logic of the Trip model in the app.
* */

public class Trip {

    private String city;
    private String state;
    private Date departureDate;
    private Date leaveDate;
    private Flight flight;
    private Hotel hotel;
    private Car car;

    public Trip(String city, String state, Date departureDate, Date leaveDate, Flight flight, Hotel hotel, Car car) {
        this.city = city;
        this.state = state;
        this.departureDate = departureDate;
        this.leaveDate = leaveDate;
        this.flight = flight;
        this.hotel = hotel;
        this.car = car;
    }

    public Trip(String city, String state, Date departureDate) {
        this.city = city;
        this.state = state;
        this.departureDate = departureDate;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public Flight getFlight() {
        return flight;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public Car getCar() {
        return car;
    }
}
