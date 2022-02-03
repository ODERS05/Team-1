package com.company;

import com.company.jetcompany.Flight;
import com.company.jetcompany.mangment.JetManagment;
import com.company.jetcompany.mangment.Managment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Managment managment = new JetManagment(3, 5);
        int point;
        do {
            System.out.println("1. Добавить новый рейс.");
            System.out.println("2. Купить билет по номеру рейса.");
            System.out.println("3. Посмотреть все рейсы.");
            System.out.println("4. Поиск рейса по номеру билета");
            System.out.println("5. Завершить программу.");
            point = scanner.nextInt();
            switch (point) {
                case 1:
                    System.out.println("Добавьте id");
                    int id = scanner.nextInt();
                    System.out.println("Время вылета");
                    String departureTime = scanner.next();
                    System.out.println("Время прилета");
                    String arrivalTime = scanner.next();
                    System.out.println("Статус");
                    String status = scanner.next();
                    Flight flight = new Flight(id, departureTime, arrivalTime, status);
                    managment.addNewFlight(flight);
                    break;
                case 2:
                    managment.buyTicket(2);
                    break;
                case 3:
                    System.out.println("Вывожу все рейсы: ");
                    managment.showAllFlights();
                    break;
                case 4:
                    managment.searchByIdOfFlight("4");
                    break;
            }
        } while (point != 5);
    }
}
