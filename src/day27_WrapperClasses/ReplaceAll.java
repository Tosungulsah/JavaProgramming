package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {
    int[] array= {22,11,22,33,85,86,77};
    array= replaceAll(array,22,10);
        System.out.println(Arrays.toString(array));

    }
    public static int[] replaceAll(int[]array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldValue){
                array[i]= newValue;
            }
        }
        return array;
    }
}
