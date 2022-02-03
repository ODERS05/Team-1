package com.company.jetcompany;

import com.company.jetcompany.Aircraft;

import java.util.Scanner;

public class Flight {
    private int id;
    private String departureTime;
    private String arrivalTime;
    private Aircraft aircraft;
    private String status;

    public Flight(Scanner departureTime, Scanner arrivalTime, Scanner status) {
        this.departureTime = String.valueOf(departureTime);
        this.arrivalTime = String.valueOf(arrivalTime);
        this.status = String.valueOf(status);
    }

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
                "ID = " + id +
                ", Время вылета ='" + departureTime + '\'' +
                ", Время прибытия ='" + arrivalTime + '\'' +
                ", Тип самолета =" + aircraft +
                ", Статус ='" + status + '\'' +
                '}';
    }
}