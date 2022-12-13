package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>() ;
        list.addAll(Arrays.asList(1,2,5,4,7,9,10));

        ArrayList<Integer> reversedList= new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            int each = list.get(i);
            reversedList.add(each);
        }
        System.out.println(reversedList);
    }
}
