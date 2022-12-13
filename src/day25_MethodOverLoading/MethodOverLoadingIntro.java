package day25_MethodOverLoading;

import java.util.Arrays;

public class MethodOverLoadingIntro {
    public static void main(String[] args) {
        int[] arr= {1,85,45,77};
        Arrays.sort(arr);
        double[] arr2={0.2,5.25,6.6,75.5};
        Arrays.sort(arr2);
        char[] arr3 = {'s','A','@'};
        Arrays.sort(arr3);
        System.exit(0);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
