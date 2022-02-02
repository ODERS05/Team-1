package com.company.jetcompany;

public class Ticket {
    private int num;
    private String place;
    private int cost;

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
                ", cost=" + cost +
                '}';
    }
}
