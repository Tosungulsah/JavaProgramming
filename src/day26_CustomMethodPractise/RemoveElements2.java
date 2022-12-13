package day26_CustomMethodPractise;

import utilities.ArraysUtility;

public class RemoveElements2 {
    public static void main(String[] args) {


    }

    public static int[] removeElement(int[]array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index number");
            System.exit(0);
        }


        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                result = ArraysUtility.addingElement(result, array[i]);

            }
        }
return result;
    }
}
