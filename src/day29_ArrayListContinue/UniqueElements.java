package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list1= new ArrayList<>();
        list1.addAll(Arrays.asList(1,1,2,33,3,6,66,666,9,999,999,3,6,666));
      
        ArrayList<Integer> unique= new ArrayList<>();
        for (Integer each : list1) {
            int frequency = Collections.frequency(list1,each);
            if(frequency==1){
                unique.add(each);
            }
        }
        System.out.println(unique);
    }
}
