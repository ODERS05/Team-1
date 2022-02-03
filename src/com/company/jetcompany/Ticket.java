package com.company.jetcompany;

public class Ticket {
    private final int cost;
    private int num;
    private String place;
   // private int cost цена 1000;

    public Ticket(int num, String place, int cost) {
        this.num = num;
        this.place = place;
        this.cost = 1000;
    }

    public Ticket() {

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
        return "Информация о билетах: " +
                "Номер билета: " + num +
                ", Место направления: '" + place + '\'' +
                ", Цена: " + cost + "";
    }
}
