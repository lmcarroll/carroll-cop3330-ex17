/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Liam Carroll
 */

import java.util.Scanner;

public class BloodAlcoholCalculator {
    public static void main(String[] args) {
        System.out.println("Enter 1 if you are male or 2 if you are female: ");
        Scanner input = new Scanner(System.in);
        int gender = input.nextInt();

        System.out.println("How many ounces of alcohol did you have? ");
        input = new Scanner(System.in);
        float ounces = input.nextFloat();

        System.out.println("What is your weight in pounds? ");
        input = new Scanner(System.in);
        float weight = input.nextFloat();

        System.out.println("How many hours has it been since your last drink? ");
        input = new Scanner(System.in);
        float hours = input.nextFloat();

        float BAC = 1;
        switch (gender) {
            case 1: BAC = (ounces * (float) 5.14 / weight * (float) 0.73) - (float) 0.015 * hours;
            break;
            case 2: BAC = (ounces * (float) 5.14 / weight * (float) 0.66) - (float) 0.015 * hours;
            break;
        }

        System.out.printf("Your BAC is %.6f\n", BAC);

        if (BAC < 0.08) {
            System.out.println("It is legal for you to drive.");
        } else
            System.out.println("It is not legal for you to drive.");
    }
}
