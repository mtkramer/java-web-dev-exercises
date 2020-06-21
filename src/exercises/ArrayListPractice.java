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

    static void sumEvens(List<Integer> list){
        int sum = 0;
        for (Object num : list) {
            if ((int) num % 2 == 0) {
                sum += (int) num;
            }
        }
        System.out.println(sum);
    }

    static void printFiveLetterWords(List<String> list){
        for (Object word : list){
            if (word.toString().length() == 5){
                System.out.println(word);
            }
        }
    }

}

/*
Write a static method to print out each word in a list that has exactly 5 letters.
Modify your code to prompt the user to enter the word length for the search.
BONUS: Instead of creating our own list of words, what if we want to use the string from the Array Practice
section? Search “Java convert String to ArrayList” online to see how to split a string into the more flexible
ArrayList collection.
 */