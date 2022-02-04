package com.company.jetcompany.mangment;

import com.company.jetcompany.Flight;

public interface Managment {

    void buyTicket();

    void addNewFlight(String departureTime, String arrivalTime, String aircraft, String status);


    void buyTicket(int num);

    void showAllFlights();

    void searchByIdOfFlight(String num);

    default void report() {
    }

    void addNewFlight(Flight flight);
}
