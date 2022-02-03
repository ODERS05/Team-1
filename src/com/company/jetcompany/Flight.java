package com.company.jetcompany;

import com.company.jetcompany.Aircraft;

import java.util.Scanner;

public class Flight {

    private int id;
    private String departureTime;
    private String arrivalTime;
    private Aircraft aircraft;
    private String status;
    private static int count = 0;

    public Flight(Scanner departureTime, Scanner arrivalTime, Scanner status) {
        count++;
        this.id = this.id + count;
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

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Flight.count = count;
    }


    @Override
    public String toString() {
        return "Информация о рейсе: " +
                "ID = " + id +
                ", Время вылета ='" + departureTime + '\'' +
                ", Время прибытия ='" + arrivalTime + '\'' +
                ", Тип самолета =" + aircraft +
                ", Статус ='" + status + '\'' + " ";
    }
}