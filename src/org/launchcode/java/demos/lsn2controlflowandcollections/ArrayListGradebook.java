package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListGradebook {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        ArrayList<Float> grades = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names
        do {
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                students.add(newStudent);
            }

        } while(!newStudent.equals(""));

        // Get student grades
        for (String student : students) {
            System.out.print("Grade for " + student + ": ");
            float grade = input.nextFloat();
            grades.add(grade);
        }

        // Print class roster
        System.out.println("\nClass roster:");
        float sum = 0.0f;

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " (" + grades.get(i) + ")");
            sum += grades.get(i);
        }

        float avg = sum / students.size();
        System.out.println("Average grade: " + String.format("%.3f", avg));

        input.close();
    }
}
