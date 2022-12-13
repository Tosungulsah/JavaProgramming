package day21_ArrayForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers= {10, 20, 25, 550};
        int[] reversed = new int[numbers.length];

        /*
        reversed [0] = numbers[3];
        reversed [1] =numbers[2]
         */
        for (int i = numbers.length - 1, j=0 ; i >= 0; i--, j++) {
            reversed[j]= numbers[i];

        }
        System.out.println(Arrays.toString(reversed));

System.exit(0);
    }
}
