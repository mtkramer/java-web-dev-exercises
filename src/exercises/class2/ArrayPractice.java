package exercises.class2;

import java.util.Arrays;

public class ArrayPractice {
    public static void  main(String[] args){
        int[] intArray = {1, 1, 2, 3, 5, 8};

        for(int num : intArray){
            if(num%2!=0){
                System.out.println(num);
            }
        }

        String dataString = "I would not, could not, in a box. I would not, could not with a fox.\n" +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] dataArray = dataString.split("/.");
        System.out.println(Arrays.toString(dataArray));
    }
}
