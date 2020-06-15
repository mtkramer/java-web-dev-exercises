package exercises;

import java.util.Scanner;

public class Mileage {
    public static void main(String[] args){
        double miles;
        double fuel;

        Scanner input = new Scanner(System.in);
            System.out.println("How many miles?");
            miles = input.nextDouble();
            System.out.println("Gallons of fuel used?");
            fuel = input.nextDouble();
        input.close();

        System.out.println("Your mileage was " + miles/fuel + "mpg");
    }
}
