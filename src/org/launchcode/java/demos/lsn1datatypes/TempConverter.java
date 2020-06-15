package org.launchcode.java.demos.lsn1datatypes;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner input;
        String choice = "";
        double temperature;

        input = new Scanner(System.in);

            while( !(choice.equals("c") || choice.equals("f")) ) {
                System.out.println("Which temperature do you have?\nCelsius or Fahrenheit? (C/F): ");
                choice = input.next().toLowerCase();
            }
            if(choice.equals("c")) {
                System.out.println("Enter the temperature in Celsius: ");
                temperature = input.nextDouble();
                System.out.println(temperature * 9 / 5 + 32 + "°F");
            }
            else {
                System.out.println("Enter the temperature in Fahrenheit: ");
                temperature = input.nextDouble();
                System.out.println((temperature - 32) * 5 / 9 + "°C");
            }

        input.close();

    }
}
