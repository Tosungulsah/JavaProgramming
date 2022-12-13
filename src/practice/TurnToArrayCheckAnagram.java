package practice;

import java.util.Arrays;

public class TurnToArrayCheckAnagram {
    public static void main(String[] args) {


        String word1 = "Gulsah";
        String word2 = "hulGsa";

        char[] ch1 = word1.toCharArray();
        char[] ch2= word2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);


        System.out.println(Arrays.equals(ch1,ch2));
    }
}
