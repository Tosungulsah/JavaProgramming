package day13_StringClass;

public class ToLowerCaseToUpperCase {
    public static void main(String[] args) {
        String str = "wooden spoon";
        str.toUpperCase();
        System.out.println("str = " + str);
        //  System.out.println("str = " +  str.toUpperCase());
        str= str.toUpperCase(); // we need to assign it again
        System.out.println("str = " + str);

        System.exit(0);
    }
}
