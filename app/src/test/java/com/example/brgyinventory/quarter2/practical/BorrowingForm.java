package com.example.brgyinventory.quarter2.practical;

import java.util.Scanner;

public class BorrowingForm {
    public static void main(String[] args) { BorrowingFormInput();}

    public static void BorrowingFormInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter HouseNumber: ");
        String HouseNumber = scanner.nextLine();

        System.out.print("Street: ");
        String Street = scanner.nextLine();

        System.out.print("State your Reason for Borrowing: ");
        String reasonForBorrowing = scanner.nextLine();


        System.out.println("\n--- Borrowing Form Details ---");
        System.out.println("HouseNumber: " + HouseNumber);
        System.out.println("Street: " + Street);
        System.out.println("Reason for Borrowing: " + reasonForBorrowing);

        scanner.close();
    }
}