package com.company.jetcompany.mangment;

import com.company.jetcompany.Flight;

import java.util.Arrays;

public class JetManagment implements Managment {
    private Flight[] flights;
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
}
