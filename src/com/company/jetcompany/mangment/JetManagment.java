package com.company.jetcompany.mangment;

import com.company.jetcompany.Flight;
import com.company.jetcompany.Ticket;

import java.util.Arrays;

public class JetManagment implements Managment {
    private Flight[] flights;
    private Ticket[] tickets;
    private String departureTime;
    private String arrivalTime;
    private String aircraft;
    private String status;

    public JetManagment() {

    }

    public JetManagment(Flight[] flights) {
        this.flights = flights;
    }

    public JetManagment(Flight[] flights, Ticket[] tickets) {
        this.flights = flights;
        this.tickets = tickets;
    }

    @Override
    public void addNewFlight(String departureTime, String arrivalTime, String aircraft, String status) {
        for (int i = 0; i < flights.length; i++) {
            if (this.flights[i] == null) {
                this.flights[i] = new Flight();
                System.out.println(flights[i]);
            }
        }
        return;
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

    public Flight[] getFlights() {
        return flights;
    }

    public void setFlights(Flight[] flights) {
        this.flights = flights;
    }

    public Ticket[] getTickets() {
        return tickets;
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }
}
