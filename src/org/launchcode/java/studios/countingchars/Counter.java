package org.launchcode.java.studios.countingchars;

import java.io.File;
import java.io.FileWriter;
import java.util.Hashtable;
import java.util.Set;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args){
        File file = null;
        try{
            file = new File("text.txt");
        }
        catch(Exception e){
            System.out.println("File already exists");
            System.exit(1);
        }

        try{
            FileWriter fileWriter = new FileWriter("text.txt");
                fileWriter.write("If the product of two terms is zero then common sense says at least one " +
                        "of the two terms has to be zero to start with.\nSo if you move all the terms over to " +
                        "one side, you can put the quadratics into a form that can be factored\nallowing that side " +
                        "of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.");
            fileWriter.close();
        }
        catch(Exception e){
            System.out.println("File doesn't exist");
            System.exit(1);
        }

        StringBuilder fileStream = new StringBuilder();
        try{
            Scanner fileReader = new Scanner(file);
                while (fileReader.hasNextLine()) {
                    fileStream.append(fileReader.nextLine());
                }
            fileReader.close();
        }
        catch(Exception e){
            System.out.println("File not found");
            System.exit(1);
        }

        char[] charArray = fileStream.toString().toLowerCase().toCharArray();
        Hashtable<String, Integer> bins = new Hashtable<>();

        for (char character : charArray){
            String stringChar = character + "";
            stringChar = stringChar.replaceAll("[^a-zA-Z]", "");
            if(bins.containsKey(stringChar)){
                bins.put(stringChar, bins.get(stringChar) + 1);
            }
            else if (!stringChar.equals("")){
                bins.put(stringChar, 1);
            }
        }

        Set<String> keys = bins.keySet();
        for (String key : keys){
            System.out.println(key + ": " + bins.get(key));
        }
    }
}
