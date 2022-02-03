package com.company.jetcompany.mangment;

import com.company.jetcompany.Flight;
import com.company.jetcompany.Ticket;

import java.util.Scanner;

public class JetManagment implements Managment {
    private Flight[] flights;
    private Ticket[] tickets;
    public JetManagment(int amountFlights, int amountTickets){
        flights = new Flight[amountFlights];
        tickets = new Ticket[amountTickets];
    }

    @Override
    public void addNewFlight(Flight flight) {
        for (int i = 0; i < flights.length; i++) {
            if (flights[i] == null){
                flights[i] = flight;
                if (flight == null){
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой номер");
        scanner.nextInt();
        for (int i = 0; i < flights.length; i++) {
            if (flights[i].getId() == num) {
                System.out.println("Есть билет");
                boolean check = true;
                if (!check == true) {
                    for (int j = 0; j < tickets.length; j++)
                        if (flights[j] == null) {
                            tickets[j] = new Ticket(num, ticket.getPlace(), ticket.getCost() );
                        }
                } else {
                    check = false;
                    if (check = true)
                        System.out.println("Вы купили билет");
                    if (check = false)
                        System.out.println("Не осталось мест");
                }
            }
            break;
        }
    }

    @Override
    public void showAllFlights() {
        for (Flight flight : flights) {
            if (flight != null ) {
                System.out.println(flight);
            }
        }
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