package tasks;

import java.util.Scanner;

public class ReplaceMethod2WarmUp {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a word: ");

        String word= scan.nextLine();

        word= word.replace("x","a");
        System.out.println("word = " + word);
    }
}
