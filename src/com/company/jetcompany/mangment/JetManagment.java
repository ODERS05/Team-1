package com.company.jetcompany.mangment;

import com.company.jetcompany.Flight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JetManagment implements Managment {
    private Flight[] flights;

    @Override
    public void addNewFlight(Flight flight) {
        Scanner scanner = new Scanner(System.in);
        Flight[] flights = new Flight[6];
        List<Integer> allFlights = new ArrayList<>();
        for (int i=0; i < flights.length; i++) {
            allFlights.add(Integer.valueOf(scanner.nextLine()));
        }
        System.out.println(allFlights);
    }

    @Override
    public void buyTicket() {
    }

    @Override
    public Flight[] showAllFlights() {
        Flight[] flights = new Flight[5];
        for (int i = 0; i < flights.length; i++) {
            System.out.println(flights[i]);
        }
        return flights;
    }

    @Override
    public Flight searchByIdOfFlight(String num) {
        return null;
    }
}
