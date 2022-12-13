package tasks;

import java.util.Scanner;

public class ScannerCircleRadius {
    public static void main(String[] args) {

        double radius;
        double pi= 3.14;

        System.out.println("Please enter the radius: ");
        Scanner askRadius = new Scanner(System.in);

         radius = askRadius.nextDouble();

        System.out.println("Your radius is: "+ radius);

        System.out.println("Area of circle is: "+ (radius*pi*2));

        System.out.println("Perimeter of circle is: "+ (radius*2));

        askRadius.close();









    }

}
