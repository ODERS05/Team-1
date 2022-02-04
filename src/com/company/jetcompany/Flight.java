package com.company.jetcompany;

import com.company.jetcompany.Aircraft;

public class Flight {
    public boolean getId;
    private int id;
    private  String departureTime;
    private String arrivalTime;
    private Aircraft aircraft;
    private String status;
    public Flight(int id, String departureTime, String arrivalTime, String status){
        this.id = id;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.status = status;
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
        return "ID: " + id +
                ", время вылета: " + departureTime +
                ", время прибытия: " + arrivalTime +
                ", тип самолета: " + aircraft +
                ", статус рейса: " + status + '\'' + " ";
    }
}