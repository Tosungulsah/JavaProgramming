package day12_Scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in); // creating an object in Scanner

        System.out.println("Enter a number: ");
        int num1= scan.nextInt();

       // System.out.println( scan.nextInt());
        System.out.println("Your number is: "+ num1);

        scan.close();
    }

}
