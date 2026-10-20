package com.pluralsight;

import java.util.Scanner;

public class FullNameGenerator {

    static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter your name\n");

        System.out.print("First name: ");
        String first = myScanner.nextLine();
        first = first.trim();

        System.out.print("Middle name: ");
        String middle = myScanner.nextLine();
        middle = middle.trim();

        System.out.print("Last name: ");
        String last = myScanner.nextLine();
        last = last.trim();

        System.out.print("Suffix: ");
        String suffix = myScanner.nextLine();
        suffix = suffix.trim();

        if (middle.isBlank()) {
            System.out.println(first + " " + last + " " + suffix);
        } else {

            System.out.print(first + " " + middle + " " + last + " " + suffix);
        }
    }
}
