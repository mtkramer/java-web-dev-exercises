package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double radius;

        Scanner input = new Scanner(System.in);
            System.out.println("What is the radius? ");
            radius = input.nextDouble();
            System.out.println("The area of that circle is " + (Math.PI * radius * radius));
        input.close();
    }
}

/*
Write a class, Area, that prompts the user for the radius of a circle and
then calculate its area and print the result.
 */