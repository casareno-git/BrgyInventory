package com.example.brgyinventory.quarter2;
import org.junit.Test;

public class MedinaProfile {
    @Test
    public void printMyProfile() {
        String myName = "James";
        String petName = "Oval";
        String favFood = "Carbonara";
        int myAge = 17;

        System.out.println(" Welcome to my Introduction! ");
        System.out.println("Hi! My Name Is " + myName + ", and i am " + myAge + " years old ");
        System.out.println("And I Have A Dog Named " + petName + ".");
        System.out.println("And The Food I Want To Eat Is " + favFood + "Anytime");
    }

}
