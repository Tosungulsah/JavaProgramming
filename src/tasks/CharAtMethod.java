package tasks;

import java.util.Scanner;

public class CharAtMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName= scan.next();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);
      //  System.out.println(f+" "+l);
        String initials= ""+f +"."+ l ;
        System.out.println(initials);
        scan.close();
        System.exit(0);
    }
}
