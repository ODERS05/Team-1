package com.company;

import com.sun.source.tree.BreakTree;

public class Flight {

    private int id;
    private String departureTime;
    private String arrivalTime;
    private Aircraft aircraft;
    private String status;

    public Flight() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", aircraft=" + aircraft +
                ", status='" + status + '\'' +
                '}';
    }

    public Flight[] getFlights() {
        Flight[] flights = new Flight[5];
        for (int i = 0; i < flights.length; i++) {
            System.out.println(flights[i]);
        }
        return flights;
    }
}