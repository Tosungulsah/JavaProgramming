package tasks;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner myInfo= new Scanner(System.in);

        System.out.println("Enter your age");
        int age = myInfo.nextInt();

        System.out.println("Enter your gender");
        String gender = myInfo.next();

        myInfo.nextLine();
        System.out.println("Enter your full name");
        String name= myInfo.nextLine();

        System.out.println("Enter your phone number");
        long phone= myInfo.nextLong();

        System.out.println("Enter your zip code");
        int zipCode= myInfo.nextInt();

        myInfo.nextLine();
        System.out.println("Enter your school name");
        String school=myInfo.nextLine();

        System.out.println("Enter city name");
        String city = myInfo.nextLine();

        System.out.println("Enter state name");
        String state = myInfo.next();

        System.out.println("Enter your building number");
        int building = myInfo.nextInt();

        myInfo.nextLine();
        System.out.println("Enter your street name");
        String street= myInfo.nextLine();


        System.out.println("1. Full name: "+name);
        System.out.println("2. Age: "+age);
        System.out.println("3. Gender: "+gender);
        System.out.println("4. Phone number: "+phone);
        System.out.println("5. Address: "+ "\n"+"\t\t"+building+" "+street+ " \n"+"\t\t"+city+", "
             +state+ zipCode);
        System.out.println("6. School Name: "+school);


        myInfo.close();
System.exit(0);
    }
}
