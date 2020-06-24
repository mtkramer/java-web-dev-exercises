package exercises.class1;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        double height;
        double width;

        Scanner input = new Scanner(System.in);
            System.out.println("Rectangle height: ");
            height = input.nextDouble();
            System.out.println("Rectangle width: ");
            width = input.nextDouble();
        input.close();

        System.out.println("The rectangle area is " + (height * width));
    }
}
