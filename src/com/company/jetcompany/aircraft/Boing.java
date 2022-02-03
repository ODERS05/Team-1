package com.company.jetcompany.aircraft;

public class Boing extends Aircraft {


    public Boing() {
        count++;
        this.id += count;
        this.model = this.getClass().getSimpleName();
        this.type = "Wars";
    }

    @Override
    public String toString() {
        return "Boing{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}