package day29_ArrayListContinue;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromePractiseRemoveIF {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Racecar","Level","Eye","Java","Cydeo"));

        names.removeIf(name-> !StringUtility.palindrome(name));
        System.out.println(names);
    }
}
