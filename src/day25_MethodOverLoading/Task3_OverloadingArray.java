package day25_MethodOverLoading;

import java.util.Arrays;

public class Task3_OverloadingArray {
    public static void main(String[] args) {

       int[] arr= {2,5,6};
       int[] arr2= {4,5,6};
       int[] newArray= intMerge(arr,arr2);
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] intMerge(int[] num1,int[] num2){
    int[] result = new int[num1.length+num2.length];

    int i = 0;
        for (int each : num1) {
            result[i++] = each;
        }
        for (int each2 : num2) {
            result[i++] = each2;
        }

        return result;


    }

    public static double[] doubleMerge(double[] num1,double[] num2){
        double[] result = new double[num1.length+num2.length];

        int i = 0;
        for (double each : num1) {
            result[i++] += each;
        }
        for (double each2 : num2) {
            result[i++] = each2;
        }

        return result;


    }
}




