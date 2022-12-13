package tasks;

import java.util.Scanner;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your age : ");
       int age= scan.nextInt();
        eligibleTobuy(age);
        scan.close();
    }

    public static void eligibleTobuy(int age){
        if(age>=18){
            System.out.println("You are eligible.");
        }else{
            System.out.println("You are not eligible.");
        }
    }
}
