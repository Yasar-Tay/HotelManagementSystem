package com.tpe.HotelManagementSystem.main;

import java.util.Scanner;

public class HotelManagementSystemServiceClass {
    private static Scanner scanner = new Scanner(System.in);

    //step 10
    public static void displayMenuHotelManagementSystem() {

        boolean exit = false;
        while (!exit){
            System.out.println("==== Hotel Management System  Menu ====");
            System.out.println("1. Hotel Operations");
            System.out.println("2. Room Operations");
            System.out.println("3. Guest Operations");
            System.out.println("4. Reservation Operations");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice){
                case 1 : displayHotelOperationMenu();break;
                case 2 : displayRoomOperationMenu();break;
                case 3 : displayGuestOperationMenu();break;
                case 4 : displayReservationOperationMenu();break;
                case 5 :
                    exit=true;
                    System.out.println("Good Bye !!!!!");
                    break;
                default:
                    System.out.println("Invalid choice .Please try again ..");
                    break;
            }
        }

    }

    //step13:
    private static void displayHotelOperationMenu() {

    }

    //step 18:
    private static void displayRoomOperationMenu() {

    }

    //step 22
    private static void displayGuestOperationMenu() {

    }

    private static void displayReservationOperationMenu() {

    }
}
