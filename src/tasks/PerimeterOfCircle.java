package tasks;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = scan.nextDouble();

        double  diameter = radius * 2;
        double area = 3.14 * radius * radius;
        double perimeter = diameter * 3.14;


        while (!(radius > 0)) {
            System.out.println("Invalid value, Please try again: ");
            radius = scan.nextInt();
        }
            while(radius > 0) {

            System.out.println("1. Diameter of circle: " + diameter);
        System.out.println("2. Area of circle: " + area);
        System.out.println("3. Perimeter of circle: " + perimeter);

        System.out.println("Would you like to calculate another circle?");
        String answer = scan.next().toLowerCase();


        if (answer.equals("yes")) {
            System.out.println("Enter the radius of the circle:");
            radius = scan.nextInt();
        } else {
            System.out.println("Thank you for using Cydeo Circle Calculator APP");
            break;
        }

    }
            scan.close();
            System.exit(0);
            }
            }




