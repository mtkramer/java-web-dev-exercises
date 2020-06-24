package exercises;

import java.util.*;

public class ArrayListPractice {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>(
                Arrays.asList(4,7,23,4,7,9,1,6,23,8,3,78,24,8,780)
        );
        sumEvens(intList);

        List<String> wordList = new ArrayList<>(
                Arrays.asList(
                        "Write", "a", "static", "method", "to", "print", "out", "each", "word",
                        "in", "a", "list", "that", "has", "exactly", "letters"
                ));
        printFiveLetterWords(wordList);

    }

    static void sumEvens(List<Integer> intList){
        int sum = 0;
        for (Object num : intList) {
            if ((int) num % 2 == 0) {
                sum += (int) num;
            }
        }
        System.out.println("The sum of the data in intList is: " + sum);
    }

    static void printFiveLetterWords(List<String> wordList){
        String userString;
        int userChoice;
        Scanner input = new Scanner(System.in);
            System.out.println("Please enter your string to check.");
            userString = input.nextLine();
            System.out.println("What word length would you like to search for?");
            userChoice = input.nextInt();
        input.close();

        if (userString.length() > 0){
            wordList = Arrays.asList(userString.split("[^a-zA-Z]"));
        }
        else{
            System.out.println("No string entered, using default wordList");
        }

        for (Object word : wordList) {
            if (word.toString().length() == userChoice) {
                System.out.println(word);
            }
        }
    }

}
