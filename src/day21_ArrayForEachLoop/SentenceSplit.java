package day21_ArrayForEachLoop;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "Let's finish this course, hope we find a job as soon as possible, may the force be with u. ";

        String[] eachSentence = sentence.split(",");
        System.out.println(Arrays.toString(eachSentence));
System.exit(0);
    }
}
