package com.example.brgyinventory.quarter2.pracexam;
import java.util.Scanner;

public class ConsoleScheduler {
    public void LoginComponent(Scanner login) {
        boolean isLoggingIn = true;

        while(isLoggingIn){
            System.out.print("Username: ");
            String usernameInput = login.nextLine();
            System.out.print(usernameInput);

            System.out.print("Password: ");
            String passwordInput = login.nextLine();
            System.out.print(passwordInput);

            if (!passwordInput.equals(usernameInput)){
                System.out.println("The username or password entered is incorrect.\n Please try again.");
            }
            else if (passwordInput.equals(usernameInput)){
                Scheduler();
                isLoggingIn = false;
            }
        }
        login.close();
    }

    private void Scheduler() {
        System.out.print("Welcome, hello!\n");
    }
}