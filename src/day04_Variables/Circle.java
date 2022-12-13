package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        /**
         * PI= 3.14
         * area= radius²*PI
         * perimeter = 2*radius* PI
         * diameter = radius*2 
         */

        int radius = 20;
        double pi= 3.14;
        double  diameter = radius * 2 ;
        double areaOfCircle = radius * radius* pi ;
        double perimeterofCirle = 2.0 * diameter * pi;

        System.out.println("diameter = " + diameter + "cm");
        System.out.println("perimeterofCirle = " + perimeterofCirle + "cm");
        System.out.println("areaOfCircle = " + areaOfCircle + "cm²");

    }
}
