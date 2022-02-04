package com.company.jetcompany.mangment;

import com.company.jetcompany.Flight;
import com.company.jetcompany.Ticket;

import java.util.Scanner;

public class JetManagment implements Managment {
    private Flight[] flights;
    private Ticket[] tickets;
    public JetManagment(int amountFlights){
        flights = new Flight[amountFlights];
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
    public void buyTicket() {

    }

    @Override
    public void addNewFlight(String departureTime, String arrivalTime, String aircraft, String status) {
    }

    @Override
    public void buyTicket(int num) {

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
    public void searchByIdOfFlight(String num) {
        Ticket[] tickets = new Ticket[5];
        Flight[] flights = new Flight[5];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер билета: ");
        scanner.next();
        for (int i = 0; i < tickets.length; i++) {
            if(flights[i].getId == tickets[i].getNumber()) {
                System.out.println("Вот ваш рейс " + flights[i]);
                boolean check = true;
                if(!check) {
                    for (int j =0; j < tickets.length; j++)
                        if (flights[j] == null) {
                            tickets[j] = new Ticket();
                            System.out.println("Ошибка, проверьте номер билета или рейса!");
                        }
                }
                break;
            }
        }
    }

    @Override
    public void report() {
        Managment.super.report();
    }
}
