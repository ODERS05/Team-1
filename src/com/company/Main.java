package com.company;

import com.company.jetcompany.Flight;
import com.company.jetcompany.mangment.JetManagment;
import com.company.jetcompany.mangment.Managment;

import java.util.Scanner;

public class Main {

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
                    Flight flight = new Flight("10:00", "15:25", "Landed");
                    System.out.println(managment.addNewFlight(flight));
                    break;
                case 2:
                    managment.buyTicket();
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
        System.out.println("Программа завершается...");
    }
}
