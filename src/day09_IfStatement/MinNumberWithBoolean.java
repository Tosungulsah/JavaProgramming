package day09_IfStatement;

public class MinNumberWithBoolean {
    public static void main(String[] args) {


        int n1 = 100,
                n2 = 200;

        boolean n1Ismin = n1 < n2;
        // this way is the boolean expressions , from scratches
        boolean n2Ismin = n2 < n1;
        boolean equal = n1 == n2;

        if (n1Ismin) {

            System.out.println(n1 + " is the minimum number.");
        }
        if (n2Ismin){
            System.out.println(n2 +" is the minimum number.");
        }
        if(equal){
            System.out.println("The numbers are equal. ");
        }
    }
}