package day26_CustomMethodPractise;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] numbers = {11,2,3,11,55,4,7,9};
        int[] unique= uniqueElements(numbers);
        System.out.println(Arrays.toString(unique));



    }



    public static int[] uniqueElements(int[] array){

        int[] result= {};
        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
              result= ArraysUtility.addingElement(result,each);
            }
        }
             return result;
    }
}
