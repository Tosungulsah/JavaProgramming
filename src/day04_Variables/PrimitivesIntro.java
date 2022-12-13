package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
        byte age= 38;

        short weight = 160;// 160 in short , out of range

        int salary = 100_000; // unscore doesnt change anything, moreeasy to read,
        //java doesnt accept ,

        float tax = 0.26f;

        double PI= 3.14;

        // char
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);
        char ch2 = 35;
        System.out.println("ch2 = " + ch2);
        char ch3 = 1000;
        System.out.println("ch3 = " + ch3);
        char ch4 = 25000;
        System.out.println("ch4 = " + ch4);


        //boolean
        boolean result = 250>200;
        System.out.println("result = " + result);

    }
}
