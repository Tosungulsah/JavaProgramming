package day12_Scanner;

import java.util.Scanner;

public class ScannerMultiplication {
    public static void main(String[] args) {
        Scanner multi = new Scanner(System.in);

        System.out.println(" Please enter a integer: ");

        int num1= multi.nextInt();

        System.out.println("Please enter a double: ");

        double num2= multi.nextDouble();
        System.out.println(" Multiplication of your numbers: "+ (num1*num2));



        multi.close();
    }




}
