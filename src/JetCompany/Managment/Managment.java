package JetCompany.Managment;

import JetCompany.Flight;

public interface Managment {
    void addNewFlight(Flight flight);
    void buyTicket();
    void showAllFlights();
    Flight searchByIdOfFlight(String num);
}
