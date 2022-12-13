package day25_MethodOverLoading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

        String sentence= "Java Programing Language";
        StringUtility.printEachChar(sentence);
        sentence=  StringUtility.reverseString(sentence);
        System.out.println(sentence);

       boolean answer=  StringUtility.palindrome(sentence);
        System.out.println(answer);
    }
}
