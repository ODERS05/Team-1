package com.company.jetcompany.mangment;

import com.company.jetcompany.Flight;
import com.company.jetcompany.Ticket;

import java.util.Scanner;

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
    }

    public void deleteFlightByTicketNumber() {

    }

    @Override
    public Ticket[] buyTicket() {
        return new Ticket[0];
    }

    @Override
    public void buyTicket(int num) {
        Ticket ticket = new Ticket();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой номер");
        scanner.nextInt();
        for (Flight flight : flights) {
            if (flight.getId() == num) {
                System.out.println("Есть билет");
                boolean check = true;
                if (!check == true) {
                    for (int j = 0; j < tickets.length; j++)
                        if (flights[j] == null) {
                            tickets[j] = new Ticket(num, ticket.getPlace(), ticket.getCost());
                        }
                } else {
                    check = false;
                    if (check = true)
                        System.out.println("Вы купили билет");
                    if (check = false)
                        System.out.println("Не осталось мест");
                }

            }
        }
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

    @Override
    public void report() {

    }

    @Override
    public void addNewFlight(Flight flight) {

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
