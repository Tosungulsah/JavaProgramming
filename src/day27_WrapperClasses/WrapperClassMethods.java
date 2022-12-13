package day27_WrapperClasses;

import java.sql.SQLOutput;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str="123";
      int num=  Integer.parseInt(str); // // its not autoboxing or unboxing
        System.out.println(num+1);

        String str2= "10.5";
        double num2= Double.parseDouble(str2);

        int max= Integer.MAX_VALUE;
        int min= Integer.MIN_VALUE;

         long max2= Long.MAX_VALUE;
         long min2=Long.MIN_VALUE;


        System.out.println(max+ " "+min);
        System.out.println(max2+ " "+ min2);

        String s1= "true";
        boolean r1= Boolean.parseBoolean(s1);
        System.out.println(r1);

        String s2= "123";
        Integer x= Integer.valueOf(s2); // return Integer
        int y= Integer.valueOf(s2);
        System.out.println(x);
        System.out.println(y);
        System.out.println();

        String s3= "1.5";
        Double z= Double.valueOf(s3);
        System.out.println(z);

        System.out.println();

        //isDigit
        char ch1= '0';
        boolean r2= Character.isDigit(ch1);
        System.out.println(r2);

        boolean r3= Character.isLetter(ch1);
        System.out.println(r3);

        char specialChar= '@';
        boolean xx = !Character.isLetterOrDigit(specialChar);
        System.out.println("xx=" + xx);

        //uppercase
        char aaa= 'A';
       boolean upper=  Character.isUpperCase(aaa);
        System.out.println(upper);
        boolean lower = Character.isLowerCase(aaa);
        System.out.println(lower);





System.exit(0);
    }
}
