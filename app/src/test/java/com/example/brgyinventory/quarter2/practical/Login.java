package com.example.brgyinventory.quarter2.practical;

import java.util.Scanner;
import org.junit.Test;

public class Login {
@Test
    public static boolean authenticate(String username, String password) {
        String correctUsername = "anselm123";
        String correctPassword = "canterbury123";
        return correctUsername.equals(username) && correctPassword.equals(password);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       BARANGGAY SYSTEM      ");
        System.out.println("================================");

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        // Check login credentials
        if (authenticate(username, password)) {
            System.out.println("\nLogin successful!");
            System.out.println("Welcome, " + username + "!");
        } else {
            System.out.println("\nInvalid username or password.");
            System.out.println("Please try again.");
        }

        scanner.close();
    }
}