package com.company.jetcompany;

public class Ticket {
    private static int num = 0;
    private String place;
    private int cost;
    private static int count = 0;
    private Flight flight;
    public Ticket(){
    }
    public Ticket(Flight flight, String place, int cost) {
        count++;
        num += count;
        this.flight = flight;
        this.place = place;
        this.cost = cost;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Ticket.count = count;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "num=" + num +
                ", place='" + place + '\'' +
                ", cost=" + cost + 1 +
                '}';
    }
}
