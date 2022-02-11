package com.company;

import com.company.jetcompany.Flight;
import com.company.jetcompany.mangment.JetManagment;
import com.company.jetcompany.mangment.Managment;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Managment managment = new JetManagment(3, 5);
        int point;
        do {
            System.out.println("1. Добавить новый рейс.");
            System.out.println("2. Купить билет по номеру рейса.");
            System.out.println("3. Посмотреть все рейсы.");
            System.out.println("4. Поиск рейса по номеру билета");
            System.out.println("5. Посмотреть все билеты");
            System.out.println("6. Отчет о билетах");
            System.out.println("0. Завершить программу.");
            point = scanner.nextInt();

            switch (point) {
                case 1:
                    System.out.println("Время вылета");
                    String departureTime = scanner.next();
                    System.out.println("Время прилета");
                    String arrivalTime = scanner.next();
                    System.out.println("Название самолета");
                    String aircraft = scanner.next();
                    System.out.println("Статус");
                    String status = scanner.next();
                    Flight flight = new Flight(departureTime, arrivalTime,aircraft, status);
                    managment.addNewFlight(flight);
                    break;
                case 2:
                    System.out.println("Введите свой номер");
                    int num = scanner.nextInt();
                    managment.buyTicket(num);
                    break;
                case 3:
                    System.out.println("Вывожу все рейсы: ");
                    managment.showAllFlights();
                    break;
                case 4:
                    System.out.print("Введите номер билета: ");
                    int num1 = scanner.nextInt();
                    managment.searchByIdOfFlight(num1);
                    break;
                case 5:
                    managment.showAllTickets();
                    break;
                case 6:
                    String path = "C:\\Users\\User\\Desktop\\report.txt";
                    try {
                        FileWriter fileWriter = new FileWriter(path);
                        fileWriter.write(managment.report());
                        fileWriter.close();
                        FileReader fileReader = new FileReader(path);
                        fileReader.close();
                        Scanner scanner21 = new Scanner(fileReader);
                        while(scanner21.hasNext() ){
                            System.out.println(scanner21.nextLine());;
                        }
                        fileReader.close();
                    }catch (NoSuchElementException ex){
                        System.out.println("Error");
                    }finally {
                        System.out.println(managment.report());
                    }break;
            }
        } while (point != 0);
    }
}
