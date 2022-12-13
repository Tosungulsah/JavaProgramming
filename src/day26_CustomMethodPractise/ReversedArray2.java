package day26_CustomMethodPractise;

import utilities.ArraysUtility;

public class ReversedArray2 {
public static int[] reversed2(int[] array){

        int[] result={};
    for (int i = array.length - 1; i >= 0; i--) {
        result= ArraysUtility.addingElement(result,array[i]); // array[i] is last element
    }
return result;
}
}
