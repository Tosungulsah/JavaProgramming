package day34_StaticContinue_GarbageCollection_AccessMod;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi;
    public static String name;
    public static ArrayList<Integer>numbers;

    public Circle(double radius){
        this.radius=radius;
      //  pi=3.14;
    }

    static {
         pi=3.14;
         name = "Circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }
/*
    public static void main(String[] args) {
        pi=3.14;
        name= "Circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);


    }
  */
}
