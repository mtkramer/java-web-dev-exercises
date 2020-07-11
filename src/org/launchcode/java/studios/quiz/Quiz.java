package org.launchcode.java.studios.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz {

    //  Tester responses
    private ArrayList<String> responses = new ArrayList<>();

    //  Questions
    final Question q1 = new Question(
            "bool",
            "Is this Java?",
            new String[]{"t.) True", "f.) False"},
            new String[]{"t"}
    );
    final Question q2 = new Question(
            "pick",
            "What is 1 + 2?",
            new String[]{"a.) Red","b.) 3","c.) I don't know."},
            new String[]{"b"}
    );
    final Question q3 = new Question(
            "add",
            "Which of the following ingredients are in lemonade?",
            new String[]{"a.) water","b.) orange juice","c.) lemon juice","d.) sugar"},
            new String[]{"a", "c", "d"}
    );
    final Question[] QUESTIONS = {q1, q2, q3};

    private void printQuestion(Question question){
        System.out.println("\n" + question.getQUESTION() + "\n-------------------------");
        for(String option : question.getPOSSIBLE_ANSWERS()){
            System.out.println(option);
        }
    }

    public void startQuiz(){
        String response;
        System.out.println("\nWELCOME!\nYour quiz has " + QUESTIONS.length + " questions.  Good Luck!");
        Scanner input = new Scanner(System.in);
        for(Question question : QUESTIONS){
            printQuestion(question);
            response = input.nextLine().replaceAll("[^a-zA-Z]", "");

            if(question.getQUESTION_TYPE().equals("bool")){
                while(response.length() > 1 || !response.matches("[tf]")){
                    System.out.println("Invalid answer for true/false question.\n" +
                            "Please enter only the letter 't' or 'f' for your answer.");
                    printQuestion(question);
                    response = input.nextLine().replaceAll("[^a-zA-Z]", "");
                }
            } else if(question.getQUESTION_TYPE().equals("pick")){
                while(response.equals("")){
                    System.out.println("Invalid answer.\n" +
                            "Please enter only the letter for your answer.");
                    printQuestion(question);
                    response = input.nextLine().replaceAll("[^a-zA-Z]", "");
                }
            } else{
                while(response.equals("")){
                    System.out.println("Invalid answer.\n" +
                            "Please enter only the letters of your answers.");
                    printQuestion(question);
                    response = input.nextLine().replaceAll("[^a-zA-Z]", "");
                }
            }
            responses.add(response.toLowerCase());
        }
        input.close();
    }

    public void printResults(){
        int numberOfQuestions = QUESTIONS.length;
        int numberCorrect = 0;
        String key;
        int questionIndex = 0;
        System.out.println("\n******************************************");
        System.out.println("RESULTS:");
        for(Question question : QUESTIONS){
            System.out.println("For question #" + (questionIndex + 1) + ": " + question.getQUESTION());
            for(String option : question.getPOSSIBLE_ANSWERS()){
                System.out.println(option);
            }
            if(question.getQUESTION_TYPE().equals("bool")){
                String answer;
                key = question.getKEY()[0];
                if(responses.get(questionIndex).equals("t")){ answer = "True"; } else { answer = "False"; }
                System.out.println("You answered: " + answer);
                if(responses.get(questionIndex).equals(key)){
                    System.out.println("Which was correct!\n");
                    numberCorrect++;
                } else {
                    System.out.println("Which was incorrect.\n");
                }
            }
            if(question.getQUESTION_TYPE().equals("pick")){
                key = question.getKEY()[0];
                System.out.println("You answered: " + responses.get(questionIndex));
                if(responses.get(questionIndex).equals(key)){
                    System.out.println("Which was correct!\n");
                    numberCorrect++;
                } else {
                    System.out.println("Which was incorrect.\n");
                }
            }
            if(question.getQUESTION_TYPE().equals("add")){
                String[] picks = responses.get(questionIndex).split("");
                int keyLength = question.getKEY().length;
                int check = 0;
                System.out.println("You should have checked " + keyLength);
                System.out.println("You answered: " + Arrays.toString(picks));
                for(String pick : picks){
                    if(responses.get(questionIndex).contains(pick)){
                        System.out.println(pick + " was correct!");
                        check++;
                    } else {
                        System.out.println(pick + " was incorrect.");
                    }
                }
                if(check == keyLength){
                    System.out.println("All of your checks are Correct!");
                    numberCorrect++;
                } else {
                    System.out.println("Incorrect check means the question is incorrect.");
                }
            }
            questionIndex++;
        }
        System.out.println("\n====================================================");
        System.out.print("You got " + numberCorrect + " correct of " + numberOfQuestions + " for a ");
        System.out.printf("%.2f", (float) numberCorrect / numberOfQuestions * 100);
        System.out.println("% score!!");
    }

}
