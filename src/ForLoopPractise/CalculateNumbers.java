package ForLoopPractise;

import java.util.Scanner;

public class CalculateNumbers {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num= scan.nextInt();

        int total=0;
        for (int i =1 ; i <= num; i++) {

            total += i;
        }
        System.out.println(total);
        scan.close();
    }
}
