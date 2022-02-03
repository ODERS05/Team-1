package com.company.jetcompany.mangment;

import com.company.jetcompany.Flight;
import com.company.jetcompany.Ticket;

public interface Managment {
    Flight[] addNewFlight(Flight flight);

    Ticket[] buyTicket();

    Flight[] showAllFlights();

    Flight searchByIdOfFlight(String num);
}
