package day18_NestedLoop;

import java.util.Scanner;

public class AdditionTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter Your First Number");
            int num1 = scan.nextInt();

            System.out.println("Enter Your Second Number");
            int num2 = scan.nextInt();

            System.out.println("Addition:" + (num1 + num2));

            System.out.println("Would you like to repeat?");
            String a= scan.next().toLowerCase();
            while( !(a.equals("yes")||a.equals("no")) ){  // this is inside of another while loop , nested
                System.err.println("Invalid Entry");
                a=scan.next().toLowerCase();
            }


            if(a.equals("no")){ //this stops outer loop
                break;
            }
        }
        scan.close();
    }
}
