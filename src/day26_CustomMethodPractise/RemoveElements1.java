package day26_CustomMethodPractise;

import java.util.Arrays;

public class RemoveElements1 {
    public static void main(String[] args) {
  int[] array = {1,1,2,2,3,4,5,6,7,8,9,99};
        array = removeElement(array,1);
        System.out.println(Arrays.toString(array));

    }

    public static int[] removeElement(int[] array, int index){

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid");
        }
        int[] result = new int[array.length-1];

       int j =0;
        for (int i =0; i< array.length; i++) {
            if(i==index){
                continue;
            }
            result[j++]=array[i];
        }
        return result;
    }
}
