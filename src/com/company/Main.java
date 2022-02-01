package com.company;

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
                case 1: Flight flight = new Flight();
                    System.out.println("Введите пунк назначения: ");

                case 2: managment.buyTicket();

                case 3: managment.showAllFlights();

                case 4: managment.searchByIdOfFlight("4");

            }
        }while (point != 0);
        System.out.println("Программа завершается...");
    }
}
