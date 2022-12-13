package day13_StringClass;

public class StringInfo {
    public static void main(String[] args) {

        String name= "Wooden Spoon";
        String name2= "Wooden Spoon";
        String name3= "Wooden Spoon";
        String name4= "Wooden Spoon";
        System.out.println(name == name2);
        System.out.println(name2== name3);
        System.out.println(name3 == name4); // these are all in heap and one object

        System.out.println("*******-------*******------********--------******------");

        String str1 = new String("Wooden Spoon");
        String str2 = new String("Wooden Spoon");// these are 4 different objects
        String str3 = new String("Wooden Spoon");
        String str4 = new String("Wooden Spoon");

        System.out.println(str1== str2);
        System.out.println(str2== str3);
        System.out.println(str3==str4);


        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/**/*/*/*/***/*/* ");


        String s1 = "Java";
        String s2 = new String("java");
// it gives false, cos java is case sensitive
        System.out.println(s1.equals(s2));


        String s3 = "Hello World";
        String s4= "Hello World";
        System.out.println(s3.equals(s4));


    }
}
