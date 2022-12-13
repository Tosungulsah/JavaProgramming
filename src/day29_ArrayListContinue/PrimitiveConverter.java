package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimitiveConverter {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6}; // primitive
        Integer[] arr2 = {1,2,3,4,6,4,7,8};
     //   ArrayList<Integer> list= new ArrayList<>(Arrays.asList(arr)); you will get error cos int is not non primitive
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(arr2));
        System.out.println("list = " + list);


        }
    }

