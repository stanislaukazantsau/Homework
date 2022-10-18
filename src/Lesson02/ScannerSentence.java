package Lesson02;

import java.util.*;
public class ScannerSentence {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String sentence = in.nextLine();
        System.out.println(sentence + sentence);
        System.out.println(sentence.length());
        System.out.println(sentence.isEmpty());
        System.out.println(sentence.charAt(2));
        System.out.println(sentence.concat(". The end"));
        System.out.println(sentence.replace(" ","*"));
        in.close();
        }
}
