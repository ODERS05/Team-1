package com.company.jetcompany.mangment;

import com.company.jetcompany.Flight;
import com.company.jetcompany.Ticket;

import java.util.Arrays;

public class JetManagment implements Managment {
    private Flight[] flights = new Flight[5];

    public Flight[] addNewFlight(Flight flight) {
        for (int i = 0; i < flights.length; i++) {
            if (this.flights[i] == null) {
                this.flights[i] = new Flight();
                System.out.println(this.flights[i]);
            }
        }
        return flights;
    }

    @Override
    public Ticket[] buyTicket() {
        Ticket[] tickets = new Ticket[5];
        if (Arrays.equals(tickets, flights)) {
            System.out.println("Все билеты на рейс заняты!");

        } else {
            ;
        }
        for (Ticket value : tickets) {
            System.out.println(value);
        }
        return tickets;
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
