package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName = myScanner.nextLine().trim();
        String[] name = fullName.split(" ");

        if (name.length == 2){
            System.out.println("First name: " + name[0]);

            System.out.println("Last name: " + name[1]);
        } else if (name.length > 2){
            System.out.println("First name: " + name[0]);

            String middle = name[1];
            char initial = middle.trim().charAt(0);

            System.out.println("Middle name: " + initial + ".");

            System.out.println("last name: " + name[2]);

        } else {
            System.out.println("ERROR: Invalid Input");
            System.out.println("You have to enter your full name and make sure to have spaces.");
        }
    }
}
