package day25_MethodOverLoading;

import utilities.StringUtility;

public class CallAnagramMethod {
    public static void main(String[] args) {
        String word1= "Kemal";
        String word2 = "Lemak";

       word1= word1.toLowerCase();
       word2= word2.toLowerCase();
        System.out.println(StringUtility.anagram(word1,word2));
    }
}
