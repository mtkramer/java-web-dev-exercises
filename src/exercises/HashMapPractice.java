package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapPractice {

    public static void main(String[] args){
        String studentName;
        int studentID;
        Map<Integer, String> students = new HashMap<>();

        Scanner input = new Scanner(System.in);
            do{
                System.out.println("Please enter student name");
                studentName = input.nextLine();
                if(!studentName.equals("")){
                    System.out.println("Please enter student's ID");
                    studentID = input.nextInt();
                    students.put(studentID, studentName);
                    input.nextLine();
                }
            }
            while(!studentName.equals(""));
        input.close();
        System.out.println("User ended student entry");

        Set<Integer> keys = students.keySet();
        for (Integer key : keys){
            System.out.println(key + ": " + students.get(key));
        }
    }

}
