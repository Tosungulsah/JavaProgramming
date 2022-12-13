package day13_StringClass;

public class ToUppercaseLowerCase {
    public static void main(String[] args) {

        String sentence = "Today is a GrEat Day to learn Java";
        sentence = sentence.toLowerCase();
        System.out.println("sentence = " + sentence);

        sentence=sentence.toUpperCase();
        System.out.println("sentence = " + sentence);

        System.exit(0);
    }
}
