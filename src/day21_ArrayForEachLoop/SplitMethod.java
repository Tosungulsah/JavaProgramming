package day21_ArrayForEachLoop;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String sentence= "Wooden Spoon is a password ";
        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));
        System.exit(0);
    }
}
