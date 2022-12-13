package day26_CustomMethodPractise;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        char[] char1= {'l','@','{'};
        char[] char2 = {'(',')'};
        char[] merged = ArraysUtility.merge(char1,char2);
        System.out.println(Arrays.toString(merged));

    }
}
