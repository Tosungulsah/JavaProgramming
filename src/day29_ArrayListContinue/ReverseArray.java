package day29_ArrayListContinue;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
            int[] array={1,5,62,3,4,};
            int[] result = new int[array.length];

       int j = 0;
        for (int i = array.length - 1; i >= 0; i--,j++ ){
            result[j]= array[i];
        }
        System.out.println(Arrays.toString(result));
    }
}