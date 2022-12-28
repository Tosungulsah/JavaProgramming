package day42_ExceptionContinue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeywordManually {
    public static void main(String[] args) {


        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if (age<0){
          //  System.err.println("invalid age: "+age);
          //  System.exit(1);

            throw new InputMismatchException("Age cant be negative ");
        }

        if(age>21){
                System.out.println("You are eligible");
            }else{
            throw new RuntimeException("You must be at least 21");
        }

    }
}
