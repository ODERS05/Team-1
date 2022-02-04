package com.company.jetcompany;

import com.company.jetcompany.aircraft.Aircraft;

public class Flight {
    private int id;
    private  String departureTime;
    private String arrivalTime;
    private String aircraft;
    private String status;
    private static int count = 0;
    public Flight(){
        count++;
    }
    public Flight(String departureTime, String arrivalTime,String aircraft ,String status){
        count++;
        this.id += count;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.aircraft = aircraft;
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

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Flight.count = count;
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
}