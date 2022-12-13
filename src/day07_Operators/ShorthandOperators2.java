package day07_Operators;

public class ShorthandOperators2 {
    public static void main(String[] args) {

        int x= 100;
        System.out.println("x= "+ x);

        System.out.println(x+200); //300

        //x= x+200;
        x += 200;
        System.out.println("x = "+ x );

        String str= "Wooden";

        str += "Spoon";

        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1); //2.5

        // make this 8.0

        num1 += 5.5;

        System.out.println("num1 = " + num1);
        System.out.println("*************************************************");


        double salary = 50000.50;
        System.out.println("salary = " + salary);

        salary *= 2;

        System.out.println("salary = " + salary);

        double doge = 0.00000001;
        doge *= 1000000;
        System.out.println("doge = " + doge);

        System.out.println("******************************************************************");

        double num2 = 25000.0;

        System.out.println("num2 = " + num2);

        num2 /= 2;
        System.out.println("num2 = " + num2);

        System.out.println("****************************************************************");

        double num3 = 100;

        num3 %= 3;

        System.out.println("num3 = " + num3);

        System.out.println("*****************************************************");
        int amount = 127;

        int quarters = 127/25 ;
        int cents= 127%25;
        System.out.println("cents = " + cents);
        System.out.println("quarters = " + quarters);

        System.out.println("***************************************************");
        int y= 300;
        y %= 16;

        System.out.println("y = " + y);

        System.out.println("*******************************************************");

        int balance = 3500;

        // insurance fee $153

        balance &=153;

        System.out.println("balance = " + balance);

    }

}
