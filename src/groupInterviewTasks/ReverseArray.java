package groupInterviewTasks;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr1 = { 2,4,5,4,6,7,};
        System.out.println(Arrays.toString(reverse(arr1)));

    }
public static int[] reverse ( int[] newArr){
        int[] reverseArray= new int [newArr.length];

        int j = 0;   // 0  = 1, 1 = 2
        for (int i = newArr.length-1; i>=0; i--) {

            reverseArray[j] = newArr[i];
            j++;

        }
        return reverseArray;
}



}
