package replit;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        //WRITE YOUR CODE BELOW
        Scanner scan= new Scanner(System.in);

        System.out.println("Hello, which item would you like?");

        String item= scan.nextLine();
        int balance= 100;



        boolean ifItemAvailable = item.equals("Hat")|| item.equals("Blanket") || item.equals( "Charger")
                || item.equals("HeadPhones")|| item.equals("Laptop") || item.equals( "Pants")|| item.equals( "Pillow") ||
                item.equals("Smartphone") || item.equals("Socks")|| item.equals("USB cable");

        if(ifItemAvailable){
            switch(item){
                case "Hat":
                    System.out.println("Thank you for your purchase!"+"\n"+
                            "Your current balance is: "+ (balance-25)+ "$");
                    break;
                case "Blanket":
                    System.out.println("Thank you for your purchase!"+"\n"+
                            "Your current balance is: "+ (balance-60)+ "$");
                    break;
                case "Charger":
                    System.out.println("Thank you for your purchase!"+"\n"+
                            "Your current balance is: "+ (balance-5)+ "$");
                    break;
                case "HeadPhones":
                    System.out.println("Thank you for your purchase!"+"\n"+
                            "Your current balance is: "+ (balance-30)+ "$");
                    break;
                case "Pants":
                    System.out.println("Thank you for your purchase!"+"\n"+
                            "Your current balance is: "+ (balance-50)+ "$");
                    break;
                case "Pillow":
                    System.out.println("Thank you for your purchase!"+"\n"+
                            "Your current balance is: "+ (balance-40)+ "$");
                    break;
                case "Socks":
                    System.out.println("Thank you for your purchase!"+"\n"+
                            "Your current balance is: "+ (balance-5)+ "$");
                    break;
                case "USB cable":
                    System.out.println("Thank you for your purchase!"+"\n"+
                            "Your current balance is: "+ (balance-10)+ "$");
                    break;
                default:
                    System.out.println("Sorry, not enough funds on your gift card");
            }

        } else{
            System.out.println("Sorry, that is an invalid item");
        }
System.exit(0);

    }
}

