package com.company.jetcompany;

import java.util.ArrayList;

public class Aircraft {
    ArrayList<Flight> flights;
    protected int id;
    protected String model;
    protected String type;
    protected int count = 0;

    public Aircraft(int id, String model, String type){
        this.id = id;
        this.model = model;
        this.type = type;
    }

    public ArrayList<Flight> getFlights() {
            return flights;
    }

    public Aircraft() {

    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

