package com.example.brgyinventory.quarter2.practical;

import org.junit.Test;
import java.util.Scanner;

public class MainMenu {
    public void menu() {
        Scanner input = new Scanner(System.in);

        System.out.println("----- MAIN MENU -----");
        System.out.println("1. Log-in Page");
        System.out.println("2. Borrowing Page");
        System.out.println("3. Borrowing Form Status");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Opening Log-in Page...");
                break;

            case 2:
                System.out.println("Opening Borrowing Page....");
                break;

            case 3:
                System.out.println("Opening Borrowing Form Status...");
                break;

            case 4:
                System.out.println("Exiting system...");
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}