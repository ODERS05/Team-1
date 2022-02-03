package com.company.jetcompany.mangment;

import com.company.jetcompany.Flight;
import com.company.jetcompany.Ticket;

public interface Managment {

    void addNewFlight(String departureTime, String arrivalTime, String aircraft, String status);

    Ticket[] buyTicket();

    void buyTicket(int num);

    Flight[] showAllFlights();

    Flight searchByIdOfFlight(String num);

    default void report() {
    }

    void addNewFlight(Flight flight);
}
