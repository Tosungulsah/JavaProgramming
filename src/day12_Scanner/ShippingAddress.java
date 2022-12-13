package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner postage= new Scanner(System.in);

        System.out.println("Enter Your Full Name: ");
        String fullName= postage.nextLine();

        System.out.println("Enter Your Building Number: ");
        String buildingNumber= postage.next();

        postage.nextLine();
        System.out.println("Enter Your Street Name: ");
        String streetName= postage.nextLine();

        System.out.println("Enter Your City Name: ");
        String city = postage.nextLine();

        System.out.println("Enter Your State: ");
        String state = postage.next();

        postage.nextLine();
        System.out.println("Enter Your Postcode: ");
        String postcode= postage.next();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("postcode = " + postcode);

        postage.close();



    }
}
