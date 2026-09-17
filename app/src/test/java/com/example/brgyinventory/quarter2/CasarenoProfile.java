package com.example.brgyinventory.quarter2;
import org.junit.Test;

public class CasarenoProfile {
    @Test
    public void printMyProfile() {
        // INPUT - Storing personal details in variables
        String myName = "Ysha";
        String petName = "Pikachu";
        String favFood = "Gyudon";
        int myAge = 18;

        // OUTPUT - Printing to the console
        System.out.println("--- MY DIGITAL PROFILE ---");
        System.out.println("Hello, my name is " + myName + ", and I am " + myAge + " years old.");
        System.out.println("I have a wonderful pet named " + petName + ".");
        System.out.println("If I could, I would eat " + favFood + " every single day!");
    }
}
