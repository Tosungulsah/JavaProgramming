package day33_CustomClass_Statics;

public class Iphone {

    public static String brand= "Apple";
    public String model;
    public double price;
    public static String Os= "IOS";
    public String colour;
    public String size;
    public static String country= "China";
    public static boolean hasBattery= true;

    public static void printModelAndPrice(){

         //   System.out.println(model+ price);
        }
        public void printModelAndPriceWithoutStatic(){
            System.out.println(model+price);
        }

}


