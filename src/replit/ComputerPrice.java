package replit;

import java.util.Scanner;

public class ComputerPrice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double totalPrice = 0;


        double screenSize;
        String cpu, storageType, screenResolution;
        int storageSize, ramSize;


        System.out.println("Select screen size:");
        screenSize = scan.nextDouble();

        scan.nextLine();
        System.out.println("Select CPU type:");
        cpu = scan.nextLine();

        System.out.println("Select RAM size:");
        ramSize = scan.nextInt();

        scan.nextLine();
        System.out.println("Select storage type:");
        storageType = scan.nextLine();

        System.out.println("Select storage size:");
        storageSize = scan.nextInt();

        scan.nextLine();
        System.out.println("Select screen resolution:");
        screenResolution = scan.nextLine();

        if (screenSize == 13.3) {
            totalPrice += 200.0;
        } else if (screenSize == 15.0) {
            totalPrice += 300.0;
        } else if (screenSize == 17.3) {
            totalPrice += 400.0;
        }

        switch (cpu) {
            case "i3":
                totalPrice += 150.0;
            case "i5":
                totalPrice += 250.0;
                break;
            case "i7":
                totalPrice += 350.0;

                if(ramSize%4==0){
                    totalPrice += (ramSize / 4) * 50.0;
                }
                if (storageType.equals("HDD")) {
                    totalPrice += (storageSize / 500) * 50.0;
                } else if (storageType.equals("SDD")) {}
                totalPrice += (storageSize / 500) * 100.0;
        }

        if (screenResolution.equals("FullHD")) {
            totalPrice += 100;
        } else if (screenResolution.equals("4K")) {
            totalPrice += 200;
        }



        System.out.println("Final price is: $"+totalPrice);
        scan.close();
        System.exit(0);
    }

}

