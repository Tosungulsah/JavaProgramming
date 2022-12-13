package day26_CustomMethodPractise;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
       int[] arr={55,66,33,22,11};

       int[] result= reversed(arr);
        System.out.println(Arrays.toString(result));

    }
    public static int[] reversed(int[] array){
        int[] result= new int[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
         result[j]=array[i];
        }
            return result;
    }
}
