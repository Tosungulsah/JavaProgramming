package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] array= {22,2,1,11,3,33,33,88 };
        array=removeDuplicates(array);
        System.out.println(Arrays.toString(array));

        String[] str={"Java", "Java","Python","C++"};
        str= ArraysUtility.removeDuplicate(str);
        System.out.println(Arrays.toString(str));

        System.exit(0);

    }
   public static int[] removeDuplicates(int[] array){

        int[] result= {};

        for (int each : array) {
            if(!ArraysUtility.contains(result,each)){
                ArraysUtility.addingElement(result,each);

            }
        }
        return result;

    }
}
