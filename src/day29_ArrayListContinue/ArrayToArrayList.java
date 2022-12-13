package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] names = {"Josh","Jack","Daniel"};

        System.out.println("Array: " + Arrays.toString(names));

        ArrayList<String> nameList= new ArrayList<>();
        nameList.addAll(Arrays.asList(names));
        System.out.println(nameList);

        // second way
        ArrayList<String> namelist2= new ArrayList<>(Arrays.asList(names));
        System.out.println("namelist2 = " + namelist2);


    }
}
