package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        while(true) {
            System.out.println("Enter your age: ");
            int age = scan.nextInt();

            while (!(age >= 1 && age <= 120)) { // while age is invalid
                System.out.println("invalid entry, please reenter");
                age = scan.nextInt();
            }
            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase();

            while(!(a.equals("yes"))|| a.equals("no")){
                System.err.println("Invalid Entry, Please enter ; yes or no ");
                a=scan.next().toLowerCase();
            }



            if(a.equals("no")){
                break;
            }
        }
        scan.close();
    }
}
