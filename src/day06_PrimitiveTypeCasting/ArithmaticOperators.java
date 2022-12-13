package day06_PrimitiveTypeCasting;

public class ArithmaticOperators {
    public static void main(String[] args) {
        System.out.println(10+250);
        System.out.println(600-85);
        System.out.println(250*6);
        System.out.println(100/6);
        System.out.println(55.0/3);  // if you use .0 that makes automatically double
        System.out.println(100%6);
        System.out.println(25d/5);  // d makes decimal

        System.out.println("*************************************************************************");
        int a = 100;
        double d = a/6;
        System.out.println(d);
        System.out.println(a/6);
        System.out.println(a/6d);
        System.out.println((double)a/6);

    }
}
 /*
 integer / integer  ... integer
 decimal / integer ..... decimal
 integer / decimal .... decimal
 decimal / decimal ...... decimal




  */