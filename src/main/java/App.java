/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Gabriel Mousa
 */

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");
        String ans = input.nextLine().toUpperCase();

        switch (ans) {
            case "C" -> {
                System.out.println("Please enter the temperature in Fahrenheit: ");
                int temp = Integer.parseInt(input.nextLine());
                System.out.format("The temperature in Celsius is %d.", (temp - 32) * 5 / 9);
            }
            case "F" -> {
                System.out.println("Please enter the temperature in Celsius: ");
                int cemp = Integer.parseInt(input.nextLine());
                System.out.format("The temperature in Fahrenheit is %d.", (cemp * 9 / 5) + 32);
            }
        }
    }
}