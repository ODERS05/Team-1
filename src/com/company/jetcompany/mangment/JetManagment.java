package com.company.jetcompany.mangment;

import com.company.jetcompany.Flight;
import com.company.jetcompany.Ticket;

import java.util.Scanner;

public class JetManagment implements Managment {
    private Flight[] flights;
    private Ticket[] tickets;

    public JetManagment(int amountFlights, int amountTickets) {
        flights = new Flight[amountFlights];
        tickets = new Ticket[amountTickets];
    }

    @Override
    public void addNewFlight(Flight flight) {
        for (int i = 0; i < flights.length; i++) {
            if (flights[i] == null) {
                flights[i] = flight;
                if (flight == null) {
                    System.out.println("No flights");
                    break;
                }
                break;
            }
        }
    }

    @Override
    public void buyTicket(int num) {
        Ticket ticket = new Ticket();
        for (int i = 0; i < flights.length; i++) {
            if (flights[i].getId() == num) {
                System.out.println("Есть билет");
                boolean check = true;
                if (check == true) {
                    for (int j = 0; j < tickets.length; j++) {
                        if (tickets[j] == null) {
                            tickets[j] = ticket;
                            check = false;
                            String place = "A" + j;
                            tickets[j] = new Ticket(flights[j], place, 1000);
                            System.out.println("Вы купили билет");
                            break;
                        }
                    }
                    if (check) {
                        System.out.println("Все билеты распроданы");
                    }
                }
                break;
            }
            System.out.println("Error");
            break;
        }
    }

    @Override
    public void showAllTickets() {
        for (Ticket ticket : tickets) {
            if (ticket != null) {
                System.out.println(ticket);
            }
        }
    }

    @Override
    public void searchByIdOfFlight(int num) {
        try {
            boolean check = true;
            for (Ticket ticket : tickets) {
                if (ticket.getNum() == num) {
                    System.out.println("Ваш рейс: " + ticket.getFlight());
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Такого билета нету!");
            }
        } catch (NullPointerException ex) {
            System.out.println("Рейс не найден!");
        }
    }

    @Override
    public void showAllFlights() {
        for (Flight flight : flights) {
            if (flight != null) {
                System.out.println(flight);
            }
        }
    }

    @Override
    public String report() {
        return "Количество рейсов " + Flight.getCount() + "\nКоличество проданных билетов " + Ticket.getCount();
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