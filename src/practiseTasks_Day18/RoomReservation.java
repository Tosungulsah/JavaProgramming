package practiseTasks_Day18;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        /*
        2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price
            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */
        Scanner scan = new Scanner(System.in);

        int total = 0;

        while (true) {
            System.out.println("Which room would you like to select?");
            System.out.println("King bed = $120");
            System.out.println("Queen bed = $100");
            System.out.println("Single bed= $80");

            String answer = scan.nextLine();


            while (!(answer.equalsIgnoreCase("King bed") || answer.equalsIgnoreCase("Queen bed") || answer.equalsIgnoreCase("Single Bed"))) {
                System.err.println("Sorry invalid answer, Please re-enter");
                answer = scan.nextLine();
            }
                total += (answer.equalsIgnoreCase("King bed")) ? 120 : (answer.equalsIgnoreCase("Queen bed")) ? 100 : 80;

                System.out.println("Would you like to select another room?, yes/no");
                String yesNo = scan.nextLine();

                while (!(yesNo.equalsIgnoreCase("yes") || yesNo.equalsIgnoreCase("no"))) {
                    System.out.println("Invalid answer, please try again");
                    System.out.println("Would you like to select another room?, yes/no");
                    yesNo = scan.nextLine();
                }
                if (yesNo.equalsIgnoreCase("no")) {
                    System.out.println("Total price is : $" + total);
                    break;
                }

            }
            scan.close();
        System.exit(0);
        }


    }


