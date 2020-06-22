package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double radius = 0.0;

        Scanner input = new Scanner(System.in);
            while(radius <= 0.0){
                System.out.println("Please enter circle radius greater than 0.0");
                try{
                    radius = input.nextDouble();
                }
                catch(Exception e){
                    System.out.println("Your entry for radius was invalid due to " + e);
                    System.out.println("Only numbers are valid for radius");
                    System.exit(1);
                }
            }
            System.out.println("The area of that circle is " + Circle.getArea(radius));
        input.close();
    }
}
