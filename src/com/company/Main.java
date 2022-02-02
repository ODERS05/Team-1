package com.company;

import JetCompany.Managment.JetManagment;
import JetCompany.Managment.Managment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Managment managment = new JetManagment();
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
    }
}
