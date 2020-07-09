package org.launchcode.java.studios.quiz;

public class Question {

    private final String QUESTION_TYPE; //bool:true/false, pick:multiple choice, add:checkbox
    private final String QUESTION;
    private final String[] POSSIBLE_ANSWERS;
    private final String[] KEY;

    public Question(String questionType, String question, String[] possibleAnswers, String[] key){
        this.QUESTION_TYPE = questionType;
        this.QUESTION = question;
        this.POSSIBLE_ANSWERS = possibleAnswers;
        this.KEY = key;
    }

    public String getQUESTION_TYPE() { return QUESTION_TYPE; }
    public String getQUESTION() { return QUESTION; }
    public String[] getPOSSIBLE_ANSWERS() { return POSSIBLE_ANSWERS; }
    public String[] getKEY() { return KEY; }

}
