package com.company;

public class JetManagment implements Managment {
    private Flight[] flights = new Flight[4];

    @Override
    public void addNewFlight(Flight flight) {
        for (int i = 0; i < flights.length; i++) {
            if (flights[i] == null) {
                flights[i] = flight;
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
            if (flight != null) {
                System.out.println(flight);
            }
        }
    }

    @Override
    public Flight searchByIdOfFlight(String num) {

        return null;
    }
}
