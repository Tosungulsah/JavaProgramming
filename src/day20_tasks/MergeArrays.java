package day20_tasks;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 ={5,6};

        int[] allTogether= new int[arr1.length + arr2.length];
            int i=0;
        for (int each : arr1) {
            allTogether[i++]= each;
        }
        for (int each : arr2) {
            allTogether[i++]= each;
        }

        System.out.println(Arrays.toString(allTogether));
        System.exit(0);
    }
}
