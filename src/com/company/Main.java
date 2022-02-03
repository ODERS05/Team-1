package com.company;

import com.company.jetcompany.Aircraft;
import com.company.jetcompany.Flight;
import com.company.jetcompany.Ticket;
import com.company.jetcompany.mangment.JetManagment;
import com.company.jetcompany.mangment.Managment;

import java.util.Scanner;

public class Main {

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Managment managment = new JetManagment();
        int point;
        do {
            System.out.println("-------------------------------");
            System.out.println("1. Добавить новый рейс.");
            System.out.println("2. Купить билет по номеру рейса.");
            System.out.println("3. Посмотреть все рейсы.");
            System.out.println("4. Поиск рейса по номеру билета");
            System.out.println("5. Завершить программу.");
            System.out.println("-------------------------------");
            point = scanner.nextInt();
            switch (point) {
                case 1:
                    Flight flight = new Flight();
                    System.out.println("Добавление нового рейса.");
                    System.out.print("Введите id: ");
                    int id = scanner.nextInt();
                    flight.getId();
                //    flight.setId(id);
                    System.out.print("Введите время вылета: ");
                    String departureTime = scanner.next();
                    flight.getDepartureTime();
                 //   flight.setDepartureTime(departureTime);
                    System.out.print("Введите время прибытия: ");
                    String arrivalTime = scanner.next();
                    flight.getArrivalTime();
                 //   flight.setArrivalTime(arrivalTime);
                    System.out.print("Статус рейса: ");
                    flight.getStatus();
                    String status = scanner.next();
                   // flight.setStatus(status);
                    flight.getStatus();
                    managment.addNewFlight(flight);
                    break;
                case 2:
                    Ticket ticket = new Ticket();
                    managment.buyTicket();
                    break;
                case 3:
                    Flight flight1 = new Flight();
                    System.out.println("Вывожу все рейсы: ");
                    for (Flight showAllFlight : managment.showAllFlights()) {
                    }

                    break;
                case 4:
                    managment.searchByIdOfFlight("4");
                    break;
            }
        } while (point != 5);
        System.out.println("Программа завершается...");
    }
}
