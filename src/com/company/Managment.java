package com.company;

public interface Managment {
    void addNewFlight(Flight flight);
    void buyTicket();
    void showAllFlights();
    Flight searchByIdOfFlight(String num);
}
