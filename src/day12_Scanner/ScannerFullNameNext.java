package day12_Scanner;

import java.util.Scanner;

public class ScannerFullNameNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");

        String name = input.next();

        System.out.println("Enter your surname: "); // if I give 2 words , takes first one, didnt read second
        String surname= input.next();
        System.out.println("name = " + name);
        System.out.println("surname = " + surname);


        input.close();



    }
}
