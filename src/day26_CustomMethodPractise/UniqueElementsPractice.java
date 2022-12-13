package day26_CustomMethodPractise;


import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElementsPractice {
    public static void main(String[] args) {
        int[] array= {11,11,2,3,55,6,4,7,8,9,9};
        int[] unique= ArraysUtility.uniqueElements(array);
        System.out.println(Arrays.toString(unique));

    }
}
