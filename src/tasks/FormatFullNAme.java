package tasks;

import java.util.Scanner;

public class FormatFullNAme {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("First name: ");
        String firstName= scan.nextLine();

        System.out.println("Last name: ");
        String lastName= scan.nextLine();

       firstName= firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1);

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

scan.close();
System.exit(0);

    }
}
