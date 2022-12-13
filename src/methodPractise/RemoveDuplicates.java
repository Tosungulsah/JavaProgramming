package methodPractise;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array ={44,44,5,2,1,4,6,4};
        array= ArraysUtility.removeDuplicate(array);
        System.out.println(Arrays.toString(array));
    }
}
