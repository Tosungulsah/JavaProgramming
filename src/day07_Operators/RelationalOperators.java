package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {
        boolean result1 = 200>40 ;

        System.out.println("result1 = " + result1);

        boolean result2 = 300> 150;
        System.out.println("result2 = " + result2);

        boolean result3 = 1000>=1000;
        System.out.println("result3 = " + result3);

        boolean result4 = 300 <= 50;
        System.out.println("result4 = " + result4);

        //credit score of 720

        int CreditScore= 745;
        boolean isEligibleForLoan = CreditScore >= 720;

        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        System.out.println("*********************************************");

        int score= 59 ;
        boolean hasFailed = 59<= 59;

        System.out.println("hasFailed = " + hasFailed);


        System.out.println("***********************************");

        int x = 100;
        int y = 200;

        boolean equal =  x==y;
        System.out.println("equal = " + equal);

        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");

        boolean result11 = 100 !=200;

        System.out.println("result11 = " + result11);

    






    }
}
