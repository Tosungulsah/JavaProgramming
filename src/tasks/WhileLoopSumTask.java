package tasks;

import java.util.Scanner;

public class WhileLoopSumTask {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1= scan.nextInt();

        while( !(num1>0)){
            System.err.println("Please enter a positive number");
            System.out.println("Please enter first number: ");
            num1= scan.nextInt();
        }
        System.out.println("Please enter second number: ");
        int num2 = scan.nextInt();
        while ( !(num2>0)){
            System.err.println("Please enter a positive number");
            System.out.println("Please enter second number: ");
            num2=scan.nextInt();
        }

        System.out.println(num1+num2);
        System.out.println("Do you want to continue? ");
        String answer=scan.next().toLowerCase();
        while( !(answer.equals("no")||answer.equals("yes"))) {

            System.out.println("Invalid Answer, Please re-enter: ");
            answer = scan.next().toLowerCase();
        }
            while(answer.equals("yes")) {
                System.out.println("Please enter first number: ");
                num1 = scan.nextInt();
                System.out.println("Please enter second number: ");
                num2 = scan.nextInt();
                System.out.println(num1 + num2);

                System.out.println("Bye");
                System.exit(0);

            }
        }

        }



