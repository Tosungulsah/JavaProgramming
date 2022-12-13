package methodPractise;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddingElement {
    public static void main(String[] args) {

        int[] array={4,6,3,1,3,4};

        array= ArraysUtility.addingElement(array,5);
        System.out.println(Arrays.toString(array));
    }
}
