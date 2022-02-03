package com.company;

public class JetManagment implements Managment {
    private Flight[] flights = new Flight[5];
    Flight flight = new Flight();

    public JetManagment() {

    }

    public JetManagment(int amountFlights) {
        flights = new Flight[amountFlights];
    }


    @Override
    public void addNewFlight(Flight flight) {
        for (int i = 0; i < this.flights.length; i++) {
            if (this.flights[i] == null) {
                this.flights[i] = flight;
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
            if (flight == flight) {
                System.out.println(flight);
            }
        }
    }

    @Override
    public Flight searchFlightOnTicketNumber(Object searchByIdOfFlight) {
        return null;
    }

    @Override
    public Flight searchByIdOfFlight(String num) {

        return null;
    }

    @Override
    public Flight[] getFlights() {
        Flight[] flights = new Flight[5];
        for (int i = 0; i < flights.length; i++) {
            System.out.println(flights[i]);
        }
        return flights;
    }
}
