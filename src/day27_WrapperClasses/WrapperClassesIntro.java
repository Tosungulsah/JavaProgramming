package day27_WrapperClasses;

public class WrapperClassesIntro {
    public static void main(String[] args) {
        int num1= 200;
        Integer n1= num1; //autoboxing , implicitly done
        int num2 = n1;
        System.out.println("--------------------------------------");

        Integer integerValue= 100;
        long longValue = integerValue;
        System.out.println("longValue: "+ longValue);

        System.out.println("***********************************************");
        int num3= 200;
         // Long num4= num3; its only its own wrapper classes

        Integer num4= num3; //autoboxing


        System.out.println("/////*/*****/*/*/*/*/*/*/*/*/*/*/*/*");

        Integer z = 900;
        Integer y = z;

        System.out.println("/*/*/*/*/*//*/*/*/*/*/*/*/*/");
        int[] numbers={1,2,3,4,5,6};
        Integer[] numbers2= {1,2,3,4};
    }


}
