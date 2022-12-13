package tasks;

import java.util.Scanner;

public class ReplaceMethodWarmup {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Please enter a word");

        String word= scan.nextLine();
        char firstLetter= word.charAt(0);

        if(firstLetter=='x'){
           word= word.replaceFirst("x","a");
        }

        System.out.println(word);

    }
}
