package day08_IfStatement;

public class LogicalOperatos2 {
    public static void main(String[] args) {

        String name= "Garry";

        String countryOfBirth= "TR";
        boolean marriedtoUSACitizen = false;
        String citizenship = "TR";
        int uklivingYear =5;
        boolean isEligible = countryOfBirth == "USA" || marriedtoUSACitizen == true ;

        boolean isEligibleToBuyHouse = citizenship == "UK" && uklivingYear >=5;
        System.out.println(name + " is eligible to get USA citizenship: " + isEligible);
        System.out.println(name+ " is eligible to buy a house in UK: "+ isEligibleToBuyHouse);




    }
}
