package com.socialimpulse.tripsapp.logic;

import java.util.Date;

/*
* Class used to handle the logic of the Hotel model in the app.
* */

public class Hotel {

    private String name;
    private Date reservationDate;

    public Hotel(String name, Date reservationDate) {
        this.name = name;
        this.reservationDate = reservationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }
}
