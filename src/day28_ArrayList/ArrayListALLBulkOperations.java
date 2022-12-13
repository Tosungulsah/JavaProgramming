package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListALLBulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();

        numbers.addAll(Arrays.asList(1,5,2,3,4,5));
        System.out.println("numbers = " + numbers);
   }
}
