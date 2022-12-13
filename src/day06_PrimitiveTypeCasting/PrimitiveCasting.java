package day06_PrimitiveTypeCasting;

public class PrimitiveCasting {
    public static void main(String[] args) {

        byte a = 100;
        short b =a;
        short z= (short)a;

        int c = b;
        System.out.println(b);
        System.out.println(z);

        System.out.println("----------------------------------------------------------------------------------");
        long d = c ;
        System.out.println(d);

        long j  = 1000000;
        short l = (short)j;
        System.out.println(l);


    }




}
