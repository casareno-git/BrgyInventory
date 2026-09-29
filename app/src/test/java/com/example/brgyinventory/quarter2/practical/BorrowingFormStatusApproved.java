package com.example.brgyinventory.quarter2.practical;

import java.util.Scanner;

public class BorrowingFormStatusApproved {
    public static void main(String[] args) {
        BorrowingComponent();
    }

    public static void BorrowingComponent() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter HouseNumber: ");
        String HouseNumber = scanner.nextLine();

        System.out.print("Enter Borrowing Status (Pending/Approved/Denied): ");
        String BorrowingStatus = scanner.nextLine();

        System.out.print("Enter Approver Name: ");
        String approverName = scanner.nextLine();

        System.out.print("Enter QR Code: ");
        String qrCode = scanner.nextLine();

        System.out.print("Enter Verification Status (Valid/Expired/Used): ");
        String verificationStatus = scanner.nextLine();

        System.out.println("\n--- Stay Slip Request Details ---");
        System.out.println("HouseNumber: " + HouseNumber);
        System.out.println("Borrowing Status: " + BorrowingStatus);
        System.out.println("Approver Name: " + approverName);
        System.out.println("QR Code: " + qrCode);
        System.out.println("Verification Status: " + verificationStatus);

        scanner.close();
    }
}