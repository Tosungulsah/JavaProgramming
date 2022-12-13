package day13_StringClass;

public class LastIndexOfMethod {
    public static void main(String[] args) {


        //if I want to take one index from end of code
        String name = "Java Programming Language";

        int callG = name.lastIndexOf("g");
        int callA = name.lastIndexOf('a');

        System.out.println("callG = " + callG);
        System.out.println("callA = " + callA);

    }
}