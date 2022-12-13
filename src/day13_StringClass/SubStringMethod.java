package day13_StringClass;

public class SubStringMethod {
    public static void main(String[] args) {
        //substring() you are providing first and last index

        String str= "Cydeo School";

        String brand = str.substring(0,4);
        System.out.println(brand); // ending index always excluding,
        // if you want to print cydeo you need to take till index 6

        String cydeo = str.substring(0,5);
        System.out.println(cydeo);

        String school= str.substring(6);// only number print first index
        System.out.println(school);

        System.exit(0);
    }
}
