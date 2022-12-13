package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Gulsah";
        int age= 35;
        String citizen = "UK";

        boolean isEligible= age >= 18 && citizen == "USA";
        System.out.println(name + " is eligible to vote for USA : "+isEligible);

        System.out.println("*-*-*--*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-*");

        String name2= "Josh";

        int creditScore = 720;
        int age2=23;
        int income = 40000;

        boolean isEligible2 =creditScore >=700 && age2 >= 21 && income >=60000;

        System.out.println(name2 + " is eligible for loan: " + isEligible2);

        System.out.println("/*/*/*/*/*/*//*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

        //|| operator

        String name3= "Shay";
        int age3= 21;
        char gender = 'F';

        boolean isEligible3 = age>= 18 && (gender == 'M' || gender == 'F');

        System.out.println(name3+ " is eligible to register: " + isEligible3);

    }
}
