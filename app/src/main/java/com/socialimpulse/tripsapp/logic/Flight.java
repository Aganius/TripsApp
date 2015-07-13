package com.socialimpulse.tripsapp.logic;

import java.util.Date;

/*
* Class used to handle the logic of the Flight model in the app.
* */

public class Flight {

    private String origin;
    private String destination;
    private Date date;
    private String gate;
    private String seat;
    private Boolean isCheckedIn;

    public Flight(String origin, String destination, Date date, String gate, String seat, Boolean isCheckedIn) {
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.gate = gate;
        this.seat = seat;
        this.isCheckedIn = isCheckedIn;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public Boolean getIsCheckedIn() {
        return isCheckedIn;
    }

    public void setIsCheckedIn(Boolean isCheckedIn) {
        this.isCheckedIn = isCheckedIn;
    }

}
