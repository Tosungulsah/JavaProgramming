package day13_StringClass;

public class ReplaceMethodString {
    public static void main(String[] args) {
        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python";
        String sentence2= sentence.replace("Python","");// empty, instead of new word

        sentence2= sentence2.replace("  ","");
        System.out.println("sentence2 = " + sentence2);







    }
}
