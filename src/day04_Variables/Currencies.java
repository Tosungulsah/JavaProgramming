package day04_Variables;

public class Currencies {

    public static void main(String[] args) {

        int dollar = 1000;

        double lira = dollar * 18.20;
        double euro = dollar * 0.86;
        double JPY = dollar * 114.14;
        double pound = dollar * 0.83;
        double CAD = dollar * 1.24;


        System.out.println("dollar = " + dollar);
        System.out.println("lira = " + lira);
        System.out.println("pound = " + pound);
        System.out.println("CAD = " + CAD);
        System.out.println("euro = " + euro);
    }
}
