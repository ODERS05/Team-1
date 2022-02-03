package com.company;

public class Flight {

    private int id;
    private String departureTime;
    private String arrivalTime;
    private Aircraft aircraft;
    private String status;

    public Flight() {
    }

    public Flight(int id, String departureTime, String arrivalTime, Aircraft aircraft, String status) {
        this.id = id;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.aircraft = aircraft;
        this.status = status;
    }

    public Flight(String nextLine, String nextLine1, String nextLine2) {
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
        return "Flight{" + "id=" + id + ", departureTime='" + departureTime + '\'' + ", arrivalTime='" + arrivalTime + '\'' + ", aircraft=" + aircraft + ", status='" + status + '\'' + '}';
    }

    public Flight addNewFlight(Flight flight) {
        return flight;
    }

    public Flight getFlights(Flight flight) {
        return flight;
    }
}