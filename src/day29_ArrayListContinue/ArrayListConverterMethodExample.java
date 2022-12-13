package day29_ArrayListContinue;

import utilities.ArrayListUtility;

import java.util.ArrayList;

public class ArrayListConverterMethodExample {
    public static void main(String[] args) {


        int[] array = {12, 45, 7, 8, 45, 7, 6};
        ArrayList<Integer> list = new ArrayList<>(ArrayListUtility.convertArraytoArrayList(array));
        System.out.println(list);
        System.exit(0);
    }
}
