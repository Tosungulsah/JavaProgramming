package practice;

public class PrimitiveCasting {
    public static void main(String[] args) {


        // implicit casting==   converting small-- to -- large
        int a = 100;
        //double b = a ;  by compiler
        double b = (double) a; // manual way
        System.out.println(b);

        System.out.println("-----------------------------------------------------------------");
    //explicit casting     large to smaller primitive types

        int x = 150;
        byte y = (byte)x;
        System.out.println(y);

        System.out.println("**********************************************************************");
        double z = 30.52;
        int xx= (int)z;
        System.out.println(xx);
        System.exit(0);


    }




}
