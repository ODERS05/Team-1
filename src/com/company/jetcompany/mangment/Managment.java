package com.company.jetcompany.mangment;

import com.company.jetcompany.Flight;

public interface Managment {
    void addNewFlight(Flight flight);

    void buyTicket();

    Flight[] showAllFlights();

    Flight searchByIdOfFlight(String num);
}
