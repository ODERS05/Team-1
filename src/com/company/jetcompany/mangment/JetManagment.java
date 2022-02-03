package com.company.jetcompany.mangment;

import com.company.jetcompany.Flight;

public class JetManagment implements Managment {
    private Flight[] flights;

    public Flight[] addNewFlight(Flight flight) {
        for (int i = 0; i < this.flights.length; i++) {
            if (this.flights[i] != null) {
                this.flights[i] = new Flight();
                System.out.println(this.flights[i]);
            }
        }
        return new Flight[0];
    }

    @Override
    public void buyTicket() {
    }

    @Override
    public Flight[] showAllFlights() {
        Flight[] flights = new Flight[5];
        for (Flight value : flights) {
            System.out.println(value);
        }
        return flights;
    }


    @Override
    public Flight searchByIdOfFlight(String num) {
        return null;
    }
}
