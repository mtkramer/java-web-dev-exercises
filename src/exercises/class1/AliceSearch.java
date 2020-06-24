package exercises.class1;

import java.util.Scanner;

public class AliceSearch {
    public static void main(String[] args){
        String data = ("Alice was beginning to get very tired of sitting by her sister on the bank, and of" +
                " having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, 'and what is the use of a book,' thought" +
                " Alice 'without pictures or conversation?").toLowerCase();
        String term;
        boolean isPresent;

        Scanner input = new Scanner(System.in);
            System.out.println("Which term would you like to search for?");
            term = input.next().toLowerCase();
        input.close();

        isPresent = data.contains(term);
        System.out.println("The first sentence of \"Alice's Adventures in Wonderland\" contains the term '" + term + "'?  " + isPresent);

        if(isPresent){
            String[] newSentence = data.split(term);
            System.out.println("Search term index: " + data.indexOf(term));
            System.out.println(newSentence[0] + newSentence[1]);
        }

    }
}
