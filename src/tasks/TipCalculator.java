package tasks;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Split or No Split(Yes or No)?");
        String yesNo= scan.next().toLowerCase();

        System.out.println("Enter the number of people");
        int numOfPeople= scan.nextInt();

        System.out.println("Enter the check amount");
        double amount= scan.nextDouble();

        scan.nextLine();
        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String service= scan.nextLine();

        double tipRate= (service.equals("Excellent"))?0.25 :(service.equals("Great"))? 0.2
                :(service.equals("Good"))? 0.15 :(service.equals("Fair"))? 0.1 :0.05;

        double totalTip = amount* tipRate;

        System.out.println("Number of People entered: "+ numOfPeople);
        System.out.println("Total to pay : "+amount);
        System.out.println("Total tip: "+totalTip);

        if(yesNo.equals("yes")){
            System.out.println("Total per person: "+ (amount/numOfPeople));
            System.out.println("Tip per person: "+ (totalTip/numOfPeople));
        }

        scan.close();
    }
}
