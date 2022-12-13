package practice;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        //integer: age,year,salary,miles
        byte age= 35;
        short year = 2023;
        int salary= 100000;
        long miles = 46456488499L; // when you type any integer in this code,
        // compiler takes this as a int type
        // you need to write l or L end of the  number.

        //* decimal
        double tax= 0.26;
        float pi= 3.14f;

        // symbols @, #

        char ch1= '@';
        char ch2= '#';


        System.out.println(age);
        System.out.println(year);
        System.out.println(salary);
        System.out.println(miles);
        System.out.println(tax);
        System.out.println(pi);
        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println("----------------------------------------------------");

        boolean result1= true;
        boolean result2= false;
        boolean result3= 5>25;

        System.out.println(result3);
        int a =100;
        int b= 300;
        boolean aIsGreaterThanB= a>b;

        System.out.println(aIsGreaterThanB);

        System.exit(0);
    }



}
