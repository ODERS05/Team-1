package com.company.jetcompany.aircraft;

public class Tu154 extends Aircraft{
    public Tu154( ) {
        count++;
        this.id+=count;
        this.model = this.getClass().getSimpleName();
        this.type = "Passengers";
    }

    @Override
    public String toString() {
        return "Tu154{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
